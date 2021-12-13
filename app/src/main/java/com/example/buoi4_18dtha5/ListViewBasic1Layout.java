package com.example.buoi4_18dtha5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class ListViewBasic1Layout extends AppCompatActivity {
    ListView listViewBasic1;
    ArrayAdapter<String> studentArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_basic1_layout);
        listViewBasic1 = findViewById(R.id.listViewBasic1);
        List<String> studentData = Arrays.asList(getResources().getStringArray(R.array.studentdata));
        studentArrayAdapter = new ArrayAdapter<String>(ListViewBasic1Layout.this, android.R.layout.simple_list_item_single_choice,studentData);


        /*for(int i = 0; i< 20;i++){
            studentArrayAdapter.add("Sinh Viên " + i);
        }*/
        listViewBasic1.setAdapter(studentArrayAdapter);
    }
}