package com.example.pasha.JPAdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {
    @Id
    @Column(name = "idStudent")
    private int id;
    private String name;
    private int age;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "student_classes",
            joinColumns = { @JoinColumn(name = "idStudent") },
            inverseJoinColumns = { @JoinColumn(name = "idClass") }
    )
    Set<Class> classes = new HashSet<>();

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
