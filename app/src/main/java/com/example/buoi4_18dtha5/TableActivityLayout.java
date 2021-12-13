package com.example.buoi4_18dtha5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import nguyenvanquan7826.com.Balan;

public class TableActivityLayout extends AppCompatActivity {
    EditText txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        txtResult = findViewById(R.id.txtResult);
    }

    public void ClickResult(View view) {
        Balan balan = new Balan();
        String math = "5 + ((1 + 2) * 4) – 3"; //txtResult.getText().toString();
        Double result = balan.valueMath(math) ;
        txtResult.setText(math + "=" + String.valueOf(result) );
    }
}