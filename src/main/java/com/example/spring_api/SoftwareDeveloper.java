package com.example.spring_api;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

import java.util.Objects;


@Entity
public class SoftwareDeveloper {

    @Id
    private int age;
    private String name;
    private String techStack;

    public SoftwareDeveloper() {
    }

    public SoftwareDeveloper(int age, String name, String techStack) {
        this.age = age;
        this.name = name;
        this.techStack = techStack;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareDeveloper that = (SoftwareDeveloper) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, techStack);
    }
}
