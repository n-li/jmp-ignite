package com.example.ignite;


import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;


public class Person implements Serializable {

    @QuerySqlField(index = true)
    private Long id;

    @QuerySqlField(index = true)
    private String fullName;


    public Person() {
    }

    public Person(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    @Override
    public String toString() {
        return "{\"name\": \"" + fullName + "\"}";
    }
}
