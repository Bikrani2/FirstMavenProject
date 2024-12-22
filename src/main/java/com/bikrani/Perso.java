package com.bikrani;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Perso implements Comparable<Perso> {
    private String lastName;
    private String firstName;

    @Override
    public int compareTo(Perso other) {
        if (other == null) return 1; // Comparaison sécurisée avec un objet null
        int lastNameComparison = String.valueOf(this.lastName).compareTo(String.valueOf(other.lastName));
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return String.valueOf(this.firstName).compareTo(String.valueOf(other.firstName));
    }
}
