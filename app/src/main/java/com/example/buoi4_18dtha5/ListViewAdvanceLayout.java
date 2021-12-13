package com.example.buoi4_18dtha5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.buoi4_18dtha5.Adapter.StudentAdapter;
import com.example.lib.Modle.StudentModle;

public class ListViewAdvanceLayout extends AppCompatActivity {
    ListView listviewAdvance;
    StudentAdapter studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_advance_layout);
        listviewAdvance = findViewById(R.id.listviewAdvance);
        studentAdapter = new StudentAdapter(ListViewAdvanceLayout.this,R.layout.studentitem);
        studentAdapter.add(new StudentModle("Nguyễn Văn Meo", "1811060519", "0328015681", R.drawable.ss));
        studentAdapter.add(new StudentModle("Nguyễn Văn Meo", "1811060519", "0328015681", R.drawable.ss));
        studentAdapter.add(new StudentModle("Nguyễn Văn Meo", "1811060519", "0328015681", R.drawable.ss));
        studentAdapter.add(new StudentModle("Nguyễn Văn Meo", "1811060519", "0328015681", R.drawable.ss));
        studentAdapter.add(new StudentModle("Nguyễn Văn Meo", "1811060519", "0328015681", R.drawable.ss));
        studentAdapter.add(new StudentModle("Nguyễn Văn Meo", "1811060519", "0328015681", R.drawable.ss));
        studentAdapter.add(new StudentModle("Nguyễn Văn Meo", "1811060519", "0328015681", R.drawable.ss));
        studentAdapter.add(new StudentModle("Nguyễn Văn Meo", "1811060519", "0328015681", R.drawable.ss));
        listviewAdvance.setAdapter(studentAdapter);
        listviewAdvance.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(ListViewAdvanceLayout.this, Detail.class);
                intent.putExtra("meo",studentAdapter.getItem(position).Pic);
                intent.putExtra("meo",studentAdapter.getItem(position).Name);
                intent.putExtra("meo",studentAdapter.getItem(position).Code);
                intent.putExtra("meo",studentAdapter.getItem(position).Phone);
                startActivity(intent);
            }
        });
    }

}
