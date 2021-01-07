package com.example.citelogbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sched_admin extends AppCompatActivity {
    Button backsched_admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sched_admin_layout);

        backsched_admin = findViewById(R.id.backadmin_sched);

        backsched_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFaculty=new Intent(Sched_admin.this,faculty_admin.class);
                startActivity(toFaculty);
            }
        });
    }
}