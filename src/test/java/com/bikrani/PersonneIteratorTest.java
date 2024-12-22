package com.bikrani;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.Test;

public class PersonneIteratorTest {

    @Test
    public void testConcurrentModificationException() {
        
        Set<Personne> persons = new HashSet<>();
        persons.add(new Personne(1, "Alice"));
        persons.add(new Personne(2, "Bob"));
        persons.add(new Personne(3, "Charlie"));
        
        assertThatThrownBy(() -> {
            for (Personne person : persons) {
                if (person.getId() == 2) {
                    persons.remove(person); 
                }
            }
        }).isInstanceOf(ConcurrentModificationException.class);
    }

    @Test
    public void testSafeRemovalUsingIterator() {
        
        Set<Personne> persons = new HashSet<>();
        persons.add(new Personne(1, "Alice"));
        persons.add(new Personne(2, "Bob"));
        persons.add(new Personne(3, "Charlie")); 
        
        Iterator<Personne> iterator = persons.iterator();

        while (iterator.hasNext()) {
            Personne person = iterator.next();
            if (person.getId() == 2) {
                iterator.remove(); 
            }
        }
        
        assertThat(persons).hasSize(2);
        assertThat(persons).doesNotContain(new Personne(2, "Bob"));
    }
}
