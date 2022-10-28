package com.students.students_system.service;

import com.students.students_system.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
