package com.example.demo;

import com.example.demo.di.PythonStudent;
import com.example.demo.ioc.JavaStudent;
import com.example.demo.ioc.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        //        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
//
//        Teacher myTeahcer = context.getBean("myTeacher", Teacher.class);
//
//        myTeahcer.code();
//        myTeahcer.speed();
//        context.close();


//        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContex.xml");
//        PythonStudent pythonStudent = context2.getBean("myTeacherPh", PythonStudent.class);
//        System.out.println(pythonStudent.getName());
//        System.out.println(pythonStudent.getAge());
//        System.out.println(pythonStudent.getEmail());
//        System.out.println(pythonStudent.getPhoneNumber());
//         pythonStudent.getTeacher().code();
//         pythonStudent.getTeacher().speed();
//         context2.close();


//        ClassPathXmlApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContex.xml");
//        PythonStudent pythonStudent = context3.getBean("myTeacherPh", PythonStudent.class);
//        System.out.println(pythonStudent.getName());
//        System.out.println(pythonStudent.getAge());
//        System.out.println(pythonStudent.getEmail());
//        System.out.println(pythonStudent.getPhoneNumber());
//        pythonStudent.getTeacher().code();
//        pythonStudent.getTeacher().speed();
//        context3.close();

        Teacher teacher = new JavaStudent();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");

        PythonStudent pythonStudent = context.getBean("myTeacherPh" , PythonStudent.class);
        System.out.println(pythonStudent.getName());
        System.out.println(pythonStudent.getAge());
        System.out.println(pythonStudent.getEmail());
        System.out.println(pythonStudent.getPhoneNumber());
        pythonStudent.getTeacher().code();
        pythonStudent.getTeacher().speed();
        context.close();

    }

}
