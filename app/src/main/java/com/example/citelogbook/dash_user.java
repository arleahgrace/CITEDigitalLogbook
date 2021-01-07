package com.example.citelogbook;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class dash_user extends AppCompatActivity {
    Button logout;
    CardView attendance_button,message_button,leave_button,sched_button,profile_button;
    String user;
    private FirebaseFirestore ffStore = FirebaseFirestore.getInstance();
    FirebaseAuth ffAuth = FirebaseAuth.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_user_layout);
        logout = findViewById(R.id.logout_button);
        attendance_button = findViewById(R.id.attendance);
        leave_button = findViewById(R.id.leave);
        profile_button = findViewById(R.id.profile);
        message_button = findViewById(R.id.message);


        String pattern = "hh:mm aa";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date currTime = calendar.getTime();
        Date date = new Date();
        String dateTime = sdf.format(date.getTime());

        user = ffAuth.getCurrentUser().getUid();


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
            }
        });
        attendance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), home_user.class));
            }
        });
        leave_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Leave_user.class));
            }
        });
        profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), profile_user.class));
            }
        });

    }

}