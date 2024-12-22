package com.bikrani;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Personne {
    
    private int id;
    private String name;

    public Personne(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
