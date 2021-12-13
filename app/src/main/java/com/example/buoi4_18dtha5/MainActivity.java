package com.example.buoi4_18dtha5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToLinearLayout(View view) {
        Intent intent = new Intent(MainActivity.this, LinearActivityLayout.class);
        startActivity(intent);
    }

    public void GoToRelativeLayout(View view) {
       Intent intent = new Intent(MainActivity.this, RelativeActivityLayout.class);
       startActivity(intent);
    }

    public void GoToFrameLayout(View view) {
        Intent intent = new Intent(MainActivity.this, FrameActivityLayout.class);
        startActivity(intent);
    }

    public void GoToTableLayout(View view) {
        Intent intent = new Intent(MainActivity.this, TableActivityLayout.class);
        startActivity(intent);
    }

    public void GoToListViewBasic1Layout(View view) {
        Intent intent = new Intent(MainActivity.this, ListViewBasic1Layout.class);
        startActivity(intent);
    }

    public void GoToListViewBasic2Layout(View view) {
        Intent intent = new Intent(MainActivity.this, ListViewBasic2Layout.class);
        startActivity(intent);
    }

    public void GoToListViewAdvanceLayout(View view) {
        Intent intent = new Intent(MainActivity.this, ListViewAdvanceLayout.class);
        startActivity(intent);
    }
}