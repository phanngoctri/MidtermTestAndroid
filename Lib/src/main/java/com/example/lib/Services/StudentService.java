package com.example.lib.Services;

import com.example.lib.Modle.StudentModle;
import com.example.lib.Repository.StudentRepository;

import java.util.List;

public class StudentService {
    StudentRepository studentRepository;
    public StudentService(){
        studentRepository = new StudentRepository();
    }
    public List<StudentModle> GetStudentList(){
        return studentRepository.GetStudent();
    }
}
