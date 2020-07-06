package com.sdias.springwebdemo.datasource.model;


import javax.validation.constraints.NotBlank;

public class Post {

    @NotBlank
    private String name;
    @NotBlank
    private String lastName;

    public Post(){

    }

    public Post(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
