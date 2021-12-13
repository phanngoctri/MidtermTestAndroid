package com.example.buoi4_18dtha5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lib.Modle.StudentModle;
import com.example.lib.Services.StudentService;

public class ListViewBasic2Layout extends AppCompatActivity {
    ListView listviewBasic2;
    ArrayAdapter<StudentModle> studentArrayAdapter;
    StudentService studentService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_basic2_layout);
        listviewBasic2 = findViewById(R.id.listviewBasic2);
        studentService = new StudentService();
        studentArrayAdapter = new ArrayAdapter<StudentModle>(ListViewBasic2Layout.this, android.R.layout.simple_list_item_1, studentService.GetStudentList());
        listviewBasic2.setAdapter(studentArrayAdapter);
    }
}