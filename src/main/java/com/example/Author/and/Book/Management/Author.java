package com.example.Author.and.Book.Management;

public class Author {
    private String name;
    private int age;
    private char gender;
    private float rating;

    public Author() {
    }

    public Author(String name, int age, char gender, float rating) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rating = rating;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", rating=" + rating +
                '}';
    }
}
