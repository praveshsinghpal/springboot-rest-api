package com.bagheera.springboot.controller;

import com.bagheera.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(
                1,
                "Pravesh",
                "Singh"
        );
        return student;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Pravesh", "Singh"));
        students.add(new Student(2, "Ram", "Singh"));
        students.add(new Student(3, "Radha", "Rani"));
        return students;
    }

    @GetMapping("/students/{id}")
    public Student studentPathVariable(@PathVariable("id") int studentId){
        return new Student(studentId, "Pravesh", "Singh");
    }

    @GetMapping("/students/{id}/{first-name}/{last-name}")
    public Student studentMultiPathVariables(@PathVariable("id") int studentId,
                                             @PathVariable("first-name") String firstName,
                                             @PathVariable("last-name") String lastName){
        return new Student(studentId, firstName, lastName);
    }
}
