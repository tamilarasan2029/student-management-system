package com.project.student.service;

import com.project.student.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {
        for (Student s : students) {
            s.display();
        }
    }
}

