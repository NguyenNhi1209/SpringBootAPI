package com.example.spring_boot_api.service;

import com.example.spring_boot_api.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Long studentId);

    public void deleteById(Long studentId);

    public Student updateStudentById(Student student);
}
