package com.matyuhin.tp_lab6.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "SUBJECTS")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "weight")
    private int weight;


    public Subject(){

    }

    public Subject(String name, String description, int weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }
}
