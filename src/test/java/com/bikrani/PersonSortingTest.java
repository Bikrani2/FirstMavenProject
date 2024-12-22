package com.bikrani;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PersonSortingTest {

    @Test
    public void testSortPerson() {
        List<Person> people = new ArrayList<>();
        people.add(Person.builder().firstName("Hamid").familyName("Jamila").build());
        people.add(Person.builder().firstName("Martin").familyName("Bob").build());
        people.add(Person.builder().firstName("Hamid").familyName("Charles").build());
        people.add(Person.builder().firstName("Bernard").familyName("Charles").build());
    
        Collections.sort(people);

        assertThat(people.get(0).getFamilyName()).isEqualTo("Bob");
        assertThat(people.get(1).getFirstName()).isEqualTo("Bernard");
    }
}
