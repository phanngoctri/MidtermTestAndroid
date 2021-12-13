package com.example.buoi4_18dtha5.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.buoi4_18dtha5.R;
import com.example.lib.Modle.StudentModle;

import org.w3c.dom.Text;

public class StudentAdapter extends ArrayAdapter<StudentModle> {
    Activity context;
    int resource;
    public StudentAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = (Activity) context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View view = layoutInflater.inflate(this.resource,null);
        ImageView imageView = view.findViewById(R.id.imgST);
        TextView txtName = view.findViewById(R.id.txtStName);
        TextView txtPhone = view.findViewById(R.id.txtStPhone);
        TextView txtCode = view.findViewById(R.id.txtStCode);

        StudentModle studentModle = getItem(position);
        imageView.setImageResource(studentModle.Pic);
        txtPhone.setText(studentModle.Phone);
        txtCode.setText(studentModle.Code);
        txtName.setText(studentModle.Name);
        return view;
    }
}
