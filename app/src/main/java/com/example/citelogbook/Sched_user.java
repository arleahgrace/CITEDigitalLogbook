package com.example.citelogbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sched_user extends AppCompatActivity {
    Button backsched_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sched_user_layout);

        backsched_user = findViewById(R.id.backuser_sched);

        backsched_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDash=new Intent(Sched_user.this,dash_user.class);
                startActivity(toDash);
            }
        });
    }
}