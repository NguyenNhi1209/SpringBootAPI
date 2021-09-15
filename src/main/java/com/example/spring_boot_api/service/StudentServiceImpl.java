package com.example.spring_boot_api.service;

import com.example.spring_boot_api.entity.Student;
import com.example.spring_boot_api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long studentId){
        return  studentRepository.getById(studentId);
    }

    @Override
    public void deleteById(Long studentId){
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student updateStudentById(Student student){

        return  studentRepository.save(student);

    }

}
