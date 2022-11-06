package com.example.demo.di;

import com.example.demo.ioc.Teacher;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PythonStudent {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    Teacher teacher;

//    public PythonStudent(String name, int age, String email, String phoneNumber, Teacher teacher) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.teacher = teacher;
//    }

    @Override
    public String toString() {
        return "PythonStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
