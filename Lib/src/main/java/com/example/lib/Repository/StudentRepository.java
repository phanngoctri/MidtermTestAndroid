package com.example.lib.Repository;

import com.example.lib.Modle.StudentModle;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public StudentRepository(){

    }
    public List<StudentModle> GetStudent(){
        //get data from api
        List<StudentModle> studentList = new ArrayList<StudentModle>();
        for( int i = 0; i< 20;i++){
            studentList.add(new StudentModle("Sinh viên" + i, "Code " + 3, "123456789", 0));
        }
        return studentList;
    }
}
