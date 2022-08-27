package com.example.springboot.learnspringboot;

public class Course {
    private long id;
    private String name;
    private String author;

    //Constructor
    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    //Getters would help to retrieve these values whenever we need them
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    //toString Method
    //Whenever we print the object of the course class,toString method is called and all the details of the course
    // would be printed.
    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }
}
