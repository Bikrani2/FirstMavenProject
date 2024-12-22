package com.bikrani;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PersonConstructorAndSetterAndGetterTest {

    @Test
    public void testPersonConstructor() {

        Person fatiPerson = new Person();
        fatiPerson.setFirstName("Fatima");
        fatiPerson.setFamilyName("Saidi");

        assertThat(fatiPerson).isNotNull();
        
        assertThat(fatiPerson.getFirstName()).isEqualTo("Fatima");
        
        assertThat(fatiPerson.getFamilyName()).isEqualTo("Saidi");




    }

}
