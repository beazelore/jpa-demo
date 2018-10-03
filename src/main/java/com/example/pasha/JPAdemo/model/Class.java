package com.example.pasha.JPAdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Class {
    @Id
    @Column(name = "idClass")
    private int id;
    private String name;

    @ManyToMany(mappedBy = "classes", cascade = CascadeType.PERSIST)
    private Set<Student> students = new HashSet<>();

    public Class() {
    }

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
