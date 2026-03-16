package com.project.student;

import com.project.student.model.Student;
import com.project.student.service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.addStudent(new Student(1, "Arun", 20));
        service.addStudent(new Student(2, "Kumar", 22));

        service.viewStudents();
    }
}