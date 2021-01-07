package com.example.citelogbook;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class home_user extends AppCompatActivity{
    Button backhome_user;
    String user;
    private FirebaseFirestore ffStore = FirebaseFirestore.getInstance();
    FirebaseAuth ffAuth = FirebaseAuth.getInstance();

    //Monday
    TextView text_subject1,text_block1, text_STime1, text_ETime1;
    Button attend_button1;
    TextView text_subject2,text_block2, text_STime2, text_ETime2;
    Button attend_button2;
    TextView text_subject3, text_block3,text_STime3, text_ETime3;
    Button attend_button3;
    TextView text_subject4,text_block4, text_STime4, text_ETime4;
    Button attend_button4;
    TextView text_subject5,text_block5, text_STime5, text_ETime5;
    Button attend_button5;
    //Tuesday
    TextView text_subject6,text_block6, text_STime6, text_ETime6;
    Button attend_button6;
    TextView text_subject7,text_block7, text_STime7, text_ETime7;
    Button attend_button7;
    TextView text_subject8,text_block8, text_STime8, text_ETime8;
    Button attend_button8;
    TextView text_subject9,text_block9, text_STime9, text_ETime9;
    Button attend_button9;
    TextView text_subject10,text_block10, text_STime10, text_ETime10;
    Button attend_button10;
    //Wednesday
    TextView text_subject11,text_block11, text_STime11, text_ETime11;
    Button attend_button11;
    TextView text_subject12,text_block12, text_STime12, text_ETime12;
    Button attend_button12;
    TextView text_subject13, text_block13,text_STime13, text_ETime13;
    Button attend_button13;
    TextView text_subject14, text_block14,text_STime14, text_ETime14;
    Button attend_button14;
    TextView text_subject15,text_block15, text_STime15, text_ETime15;
    Button attend_button15;
    //Thursday
    TextView text_subject16,text_block16, text_STime16, text_ETime16;
    Button attend_button16;
    TextView text_subject17,text_block17, text_STime17, text_ETime17;
    Button attend_button17;
    TextView text_subject18,text_block18, text_STime18, text_ETime18;
    Button attend_button18;
    TextView text_subject19,text_block19, text_STime19, text_ETime19;
    Button attend_button19;
    TextView text_subject20,text_block20, text_STime20, text_ETime20;
    Button attend_button20;
    //Friday
    TextView text_subject21,text_block21, text_STime21, text_ETime21;
    Button attend_button21;
    TextView text_subject22,text_block22, text_STime22, text_ETime22;
    Button attend_button22;
    TextView text_subject23,text_block23, text_STime23, text_ETime23;
    Button attend_button23;
    TextView text_subject24,text_block24, text_STime24, text_ETime24;
    Button attend_button24;
    TextView text_subject25,text_block25, text_STime25, text_ETime25;
    Button attend_button25;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_user_layout);

        backhome_user = findViewById(R.id.backuser_home);
        ffStore = FirebaseFirestore.getInstance();

        //Monday
        text_subject1 = findViewById(R.id.text_subject1);
        text_block1 = findViewById(R.id.text_block1);
        text_STime1 = findViewById(R.id.text_Stime1);
        text_ETime1 = findViewById(R.id.text_Etime1);
        attend_button1 = findViewById(R.id.attend_button1);

        text_subject2 = findViewById(R.id.text_subject2);
        text_block2 = findViewById(R.id.text_block2);
        text_STime2 = findViewById(R.id.text_Stime2);
        text_ETime2 = findViewById(R.id.text_Etime2);
        attend_button2 = findViewById(R.id.attend_button2);

        text_subject3 = findViewById(R.id.text_subject3);
        text_block3 = findViewById(R.id.text_block3);
        text_STime3 = findViewById(R.id.text_Stime3);
        text_ETime3 = findViewById(R.id.text_Etime3);
        attend_button3 = findViewById(R.id.attend_button3);

        text_subject4 = findViewById(R.id.text_subject4);
        text_block4 = findViewById(R.id.text_block4);
        text_STime4 = findViewById(R.id.text_Stime4);
        text_ETime4 = findViewById(R.id.text_Etime4);
        attend_button4 = findViewById(R.id.attend_button4);

        text_subject5 = findViewById(R.id.text_subject5);
        text_block5 = findViewById(R.id.text_block5);
        text_STime5 = findViewById(R.id.text_Stime5);
        text_ETime5 = findViewById(R.id.text_Etime5);
        attend_button5 = findViewById(R.id.attend_button5);

        //Tuesday
        text_subject6 = findViewById(R.id.text_subject6);
        text_block6 = findViewById(R.id.text_block6);
        text_STime6 = findViewById(R.id.text_Stime6);
        text_ETime6 = findViewById(R.id.text_Etime6);
        attend_button6 = findViewById(R.id.attend_button6);

        text_subject7 = findViewById(R.id.text_subject7);
        text_block7 = findViewById(R.id.text_block7);
        text_STime7 = findViewById(R.id.text_Stime7);
        text_ETime7 = findViewById(R.id.text_Etime7);
        attend_button7 = findViewById(R.id.attend_button7);

        text_subject8 = findViewById(R.id.text_subject8);
        text_block8 = findViewById(R.id.text_block8);
        text_STime8 = findViewById(R.id.text_Stime8);
        text_ETime8 = findViewById(R.id.text_Etime8);
        attend_button8 = findViewById(R.id.attend_button8);

        text_subject9 = findViewById(R.id.text_subject9);
        text_block9 = findViewById(R.id.text_block9);
        text_STime9 = findViewById(R.id.text_Stime9);
        text_ETime9 = findViewById(R.id.text_Etime9);
        attend_button9 = findViewById(R.id.attend_button9);

        text_subject10 = findViewById(R.id.text_subject10);
        text_block10 = findViewById(R.id.text_block10);
        text_STime10 = findViewById(R.id.text_Stime10);
        text_ETime10 = findViewById(R.id.text_Etime10);
        attend_button10 = findViewById(R.id.attend_button10);

        //Wednesday
        text_subject11 = findViewById(R.id.text_subject11);
        text_block11 = findViewById(R.id.text_block11);
        text_STime11 = findViewById(R.id.text_Stime11);
        text_ETime11 = findViewById(R.id.text_Etime11);
        attend_button11 = findViewById(R.id.attend_button11);

        text_subject12 = findViewById(R.id.text_subject12);
        text_block12 = findViewById(R.id.text_block12);
        text_STime12 = findViewById(R.id.text_Stime12);
        text_ETime12 = findViewById(R.id.text_Etime12);
        attend_button12 = findViewById(R.id.attend_button12);

        text_subject13 = findViewById(R.id.text_subject13);
        text_block13 = findViewById(R.id.text_block13);
        text_STime13 = findViewById(R.id.text_Stime13);
        text_ETime13 = findViewById(R.id.text_Etime13);
        attend_button13 = findViewById(R.id.attend_button13);

        text_subject14 = findViewById(R.id.text_subject14);
        text_block14 = findViewById(R.id.text_block14);
        text_STime14 = findViewById(R.id.text_Stime14);
        text_ETime14 = findViewById(R.id.text_Etime14);
        attend_button14 = findViewById(R.id.attend_button14);

        text_subject15 = findViewById(R.id.text_subject15);
        text_block15 = findViewById(R.id.text_block15);
        text_STime15 = findViewById(R.id.text_Stime15);
        text_ETime15 = findViewById(R.id.text_Etime15);
        attend_button15 = findViewById(R.id.attend_button15);

        //Thursday
        text_subject16 = findViewById(R.id.text_subject16);
        text_block16 = findViewById(R.id.text_block16);
        text_STime16 = findViewById(R.id.text_Stime16);
        text_ETime16 = findViewById(R.id.text_Etime16);
        attend_button16 = findViewById(R.id.attend_button16);

        text_subject17 = findViewById(R.id.text_subject17);
        text_block17 = findViewById(R.id.text_block17);
        text_STime17 = findViewById(R.id.text_Stime17);
        text_ETime17 = findViewById(R.id.text_Etime17);
        attend_button17 = findViewById(R.id.attend_button17);

        text_subject18 = findViewById(R.id.text_subject18);
        text_block18 = findViewById(R.id.text_block18);
        text_STime18 = findViewById(R.id.text_Stime18);
        text_ETime18 = findViewById(R.id.text_Etime18);
        attend_button18 = findViewById(R.id.attend_button18);

        text_subject19 = findViewById(R.id.text_subject19);
        text_block19 = findViewById(R.id.text_block19);
        text_STime19 = findViewById(R.id.text_Stime19);
        text_ETime19 = findViewById(R.id.text_Etime19);
        attend_button19 = findViewById(R.id.attend_button19);

        text_subject20 = findViewById(R.id.text_subject20);
        text_block20 = findViewById(R.id.text_block20);
        text_STime20 = findViewById(R.id.text_Stime20);
        text_ETime20 = findViewById(R.id.text_Etime20);
        attend_button20 = findViewById(R.id.attend_button20);

        //Friday
        text_subject21 = findViewById(R.id.text_subject21);
        text_block21 = findViewById(R.id.text_block21);
        text_STime21 = findViewById(R.id.text_Stime21);
        text_ETime21 = findViewById(R.id.text_Etime21);
        attend_button21 = findViewById(R.id.attend_button21);

        text_subject22 = findViewById(R.id.text_subject22);
        text_block22 = findViewById(R.id.text_block22);
        text_STime22 = findViewById(R.id.text_Stime22);
        text_ETime22 = findViewById(R.id.text_Etime22);
        attend_button22 = findViewById(R.id.attend_button22);

        text_subject23 = findViewById(R.id.text_subject23);
        text_block23 = findViewById(R.id.text_block23);
        text_STime23 = findViewById(R.id.text_Stime23);
        text_ETime23 = findViewById(R.id.text_Etime23);
        attend_button23 = findViewById(R.id.attend_button23);

        text_subject24 = findViewById(R.id.text_subject24);
        text_block24 = findViewById(R.id.text_block24);
        text_STime24 = findViewById(R.id.text_Stime24);
        text_ETime24 = findViewById(R.id.text_Etime24);
        attend_button24 = findViewById(R.id.attend_button24);

        text_subject25 = findViewById(R.id.text_subject25);
        text_block25 = findViewById(R.id.text_block25);
        text_STime25 = findViewById(R.id.text_Stime25);
        text_ETime25 = findViewById(R.id.text_Etime25);
        attend_button25 = findViewById(R.id.attend_button25);

        user = ffAuth.getCurrentUser().getUid();

        DocumentReference documentReference = ffStore.collection("teachers").document(user);

        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {

                //monday
                text_subject1.setText(value.getString("amSubject1"));
                text_block1.setText(value.getString("amSection1"));
                text_STime1.setText(value.getString("amSTime1"));
                text_ETime1.setText(value.getString("amETime1"));

                text_subject2.setText(value.getString("amSubject2"));
                text_block2.setText(value.getString("amSection2"));
                text_STime2.setText(value.getString("amSTime2"));
                text_ETime2.setText(value.getString("amETime2"));

                text_subject3.setText(value.getString("amSubject3"));
                text_block3.setText(value.getString("amSection3"));
                text_STime3.setText(value.getString("amSTime3"));
                text_ETime3.setText(value.getString("amETime3"));

                text_subject4.setText(value.getString("pmSubject4"));
                text_block4.setText(value.getString("pmSection4"));
                text_STime4.setText(value.getString("pmSTime4"));
                text_ETime4.setText(value.getString("pmETime4"));


                text_subject5.setText(value.getString("pmSubject5"));
                text_block5.setText(value.getString("pmSection5"));
                text_STime5.setText(value.getString("pmSTime5"));
                text_ETime5.setText(value.getString("pmETime5"));

                //tuesday
                text_subject6.setText(value.getString("amSubject6"));
                text_block6.setText(value.getString("amSection6"));
                text_STime6.setText(value.getString("amSTime6"));
                text_ETime6.setText(value.getString("amETime6"));

                text_subject7.setText(value.getString("amSubject7"));
                text_block7.setText(value.getString("amSection7"));
                text_STime7.setText(value.getString("amSTime7"));
                text_ETime7.setText(value.getString("amETime7"));

                text_subject8.setText(value.getString("amSubject8"));
                text_block8.setText(value.getString("amSection8"));
                text_STime8.setText(value.getString("amSTime8"));
                text_ETime8.setText(value.getString("amETime8"));

                text_subject9.setText(value.getString("pmSubject9"));
                text_block9.setText(value.getString("pmSection9"));
                text_STime9.setText(value.getString("pmSTime9"));
                text_ETime9.setText(value.getString("pmETime9"));

                text_subject10.setText(value.getString("pmSubject10"));
                text_block10.setText(value.getString("pmSection10"));
                text_STime10.setText(value.getString("pmSTime10"));
                text_ETime10.setText(value.getString("pmETime10"));

                //wednesday
                text_subject11.setText(value.getString("amSubject11"));
                text_block11.setText(value.getString("amSection11"));
                text_STime11.setText(value.getString("amSTime11"));
                text_ETime11.setText(value.getString("amETime11"));

                text_subject12.setText(value.getString("amSubject12"));
                text_block12.setText(value.getString("amSection12"));
                text_STime12.setText(value.getString("amSTime12"));
                text_ETime12.setText(value.getString("amETime12"));

                text_subject13.setText(value.getString("amSubject13"));
                text_block13.setText(value.getString("amSection13"));
                text_STime13.setText(value.getString("amSTime13"));
                text_ETime13.setText(value.getString("amETime13"));

                text_subject14.setText(value.getString("pmSubject14"));
                text_block14.setText(value.getString("pmSection14"));
                text_STime14.setText(value.getString("pmSTime14"));
                text_ETime14.setText(value.getString("pmETime14"));

                text_subject15.setText(value.getString("pmSubject15"));
                text_block15.setText(value.getString("pmSection15"));
                text_STime15.setText(value.getString("pmSTime15"));
                text_ETime15.setText(value.getString("pmETime15"));

                //thursday
                text_subject16.setText(value.getString("amSubject16"));
                text_block16.setText(value.getString("amSection16"));
                text_STime16.setText(value.getString("amSTime16"));
                text_ETime16.setText(value.getString("amETime16"));

                text_subject17.setText(value.getString("amSubject17"));
                text_block17.setText(value.getString("amSection17"));
                text_STime17.setText(value.getString("amSTime17"));
                text_ETime17.setText(value.getString("amETime17"));

                text_subject18.setText(value.getString("amSubject18"));
                text_block18.setText(value.getString("amSection18"));
                text_STime18.setText(value.getString("amSTime18"));
                text_ETime18.setText(value.getString("amETime18"));

                text_subject19.setText(value.getString("pmSubject19"));
                text_block19.setText(value.getString("pmSection19"));
                text_STime19.setText(value.getString("pmSTime19"));
                text_ETime19.setText(value.getString("pmETime19"));

                text_subject20.setText(value.getString("pmSubject20"));
                text_block20.setText(value.getString("pmSection20"));
                text_STime20.setText(value.getString("pmSTime20"));
                text_ETime20.setText(value.getString("pmETime20"));

                //friday
                text_subject21.setText(value.getString("amSubject21"));
                text_block21.setText(value.getString("amSection21"));
                text_STime21.setText(value.getString("amSTime21"));
                text_ETime21.setText(value.getString("amETime21"));

                text_subject22.setText(value.getString("amSubject22"));
                text_block22.setText(value.getString("amSection22"));
                text_STime22.setText(value.getString("amSTime22"));
                text_ETime22.setText(value.getString("amETime22"));

                text_subject23.setText(value.getString("amSubject23"));
                text_block23.setText(value.getString("amSection23"));
                text_STime23.setText(value.getString("amSTime23"));
                text_ETime23.setText(value.getString("amETime23"));

                text_subject24.setText(value.getString("pmSubject24"));
                text_block24.setText(value.getString("pmSection24"));
                text_STime24.setText(value.getString("pmSTime24"));
                text_ETime24.setText(value.getString("pmETime24"));

                text_subject25.setText(value.getString("pmSubject25"));
                text_block25.setText(value.getString("pmSection25"));
                text_STime25.setText(value.getString("pmSTime25"));
                text_ETime25.setText(value.getString("pmETime25"));


                String timeS1 = text_STime1.getText().toString();
                String timeE1 = text_ETime1.getText().toString();

                String timeS2 = text_STime2.getText().toString();
                String timeE2 = text_ETime2.getText().toString();

                String timeS3 = text_STime3.getText().toString();
                String timeE3 = text_ETime3.getText().toString();

                String timeS4 = text_STime4.getText().toString();
                String timeE4 = text_ETime4.getText().toString();

                String timeS5 = text_STime5.getText().toString();
                String timeE5 = text_ETime5.getText().toString();

                String timeS6 = text_STime6.getText().toString();
                String timeE6 = text_ETime6.getText().toString();

                String timeS7 = text_STime7.getText().toString();
                String timeE7 = text_ETime7.getText().toString();

                String timeS8 = text_STime8.getText().toString();
                String timeE8 = text_ETime8.getText().toString();

                String timeS9 = text_STime9.getText().toString();
                String timeE9    = text_ETime9.getText().toString();

                String timeS10 = text_STime10.getText().toString();
                String timeE10 = text_ETime10.getText().toString();

                String timeS11 = text_STime11.getText().toString();
                String timeE11 = text_ETime11.getText().toString();

                String timeS12 = text_STime12.getText().toString();
                String timeE12 = text_ETime12.getText().toString();

                String timeS13 = text_STime13.getText().toString();
                String timeE13 = text_ETime13.getText().toString();

                String timeS14 = text_STime14.getText().toString();
                String timeE14 = text_ETime14.getText().toString();

                String timeS15 = text_STime15.getText().toString();
                String timeE15 = text_ETime15.getText().toString();

                String timeS16 = text_STime16.getText().toString();
                String timeE16 = text_ETime16.getText().toString();

                String timeS17 = text_STime17.getText().toString();
                String timeE17 = text_ETime17.getText().toString();

                String timeS18 = text_STime18.getText().toString();
                String timeE18 = text_ETime18.getText().toString();

                String timeS19 = text_STime19.getText().toString();
                String timeE19 = text_ETime19.getText().toString();

                String timeS20 = text_STime20.getText().toString();
                String timeE20 = text_ETime20.getText().toString();

                String timeS21 = text_STime21.getText().toString();
                String timeE21 = text_ETime21.getText().toString();

                String timeS22 = text_STime22.getText().toString();
                String timeE22 = text_ETime22.getText().toString();

                String timeS23 = text_STime23.getText().toString();
                String timeE23 = text_ETime23.getText().toString();

                String timeS24 = text_STime24.getText().toString();
                String timeE24 = text_ETime24.getText().toString();

                String timeS25 = text_STime25.getText().toString();
                String timeE25 = text_ETime25.getText().toString();

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");



                String pattern = "hh:mm aa";
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat(pattern);
                Date currTime = calendar.getTime();
                Date date = new Date();
                String dateTime = sdf.format(date.getTime());
                String tName = value.getString("fullname");


             try {
                    Date start1 = sdf.parse(timeS1);
                    Date end1 = sdf.parse(timeE1);
                    Date current = sdf.parse(sdf.format(date.getTime()));
                    String currentDate = dateFormat.format(new Date());

                    if((current.compareTo(start1) > 0) && (current.compareTo(end1) < 0)){
                        attend_button1.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                                tAttendance.update("amSubject1", text_subject1.getText().toString(),"amDate1", currentDate + current,"amSubject1Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()) {
                                            Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                        }
                                        else{
                                            Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });

                            }
                        });
                    }
                    else{
                       attend_button1.setEnabled(false);
                    }

                 Date start2 = sdf.parse(timeS2);
                 Date end2 = sdf.parse(timeE2);

                 if((current.compareTo(start2) > 0) && (current.compareTo(end2) < 0)){
                     attend_button2.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject2", text_subject2.getText().toString(),"amDate2", currentDate,"amSubject2Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button2.setEnabled(false);

                 }

                 Date start3 = sdf.parse(timeS3);
                 Date end3 = sdf.parse(timeE3);


                 if((current.compareTo(start3) > 0) && (current.compareTo(end3) < 0)){
                     attend_button3.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject3", text_subject3.getText().toString(),"amDate3", currentDate,"amSubject3Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button3.setEnabled(false);
                 }
                 Date start4 = sdf.parse(timeS4);
                 Date end4 = sdf.parse(timeE4);
                 if((current.compareTo(start4) > 0) && (current.compareTo(end4) < 0)){
                     attend_button4.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject4", text_subject1.getText().toString(),"pmDate4", currentDate,"pmSubject4Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button4.setEnabled(false);

                 }

                 Date start5 = sdf.parse(timeS5);
                 Date end5 = sdf.parse(timeE5);


                 if((current.compareTo(start5) > 0) && (current.compareTo(end5) < 0)){
                     attend_button5.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject5", text_subject5.getText().toString(),"pmDate5", currentDate,"pmSubject5Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button5.setEnabled(false);
                 }

                 Date start6 = sdf.parse(timeS6);
                 Date end6 = sdf.parse(timeE6);

                 if((current.compareTo(start6) > 0) && (current.compareTo(end6) < 0)){
                     attend_button6.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject6", text_subject6.getText().toString(),"amDate6", currentDate,"amSubject6Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button6.setEnabled(false);
                 }
                 Date start7 = sdf.parse(timeS7);
                 Date end7 = sdf.parse(timeE7);


                 if((current.compareTo(start7) > 0) && (current.compareTo(end7) < 0)){
                     attend_button7.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject7", text_subject7.getText().toString(),"amDate7", currentDate,"amSubject7Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button7.setEnabled(false);
                 }
                 Date start8 = sdf.parse(timeS8);
                 Date end8 = sdf.parse(timeE8);

                 if((current.compareTo(start8) > 0) && (current.compareTo(end8) < 0)){
                     attend_button8.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject8", text_subject8.getText().toString(),"amDate8", currentDate,"amSubject8Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button8.setEnabled(false);
                 }
                 Date start9 = sdf.parse(timeS9);
                 Date end9 = sdf.parse(timeE9);

                 if((current.compareTo(start9) > 0) && (current.compareTo(end9) < 0)){
                     attend_button9.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject9", text_subject9.getText().toString(),"pmDate9", currentDate,"pmSubject9Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button9.setEnabled(false);
                 }
                 Date start10 = sdf.parse(timeS10);
                 Date end10 = sdf.parse(timeE10);

                 if((current.compareTo(start10) > 0) && (current.compareTo(end10) < 0)){
                     attend_button10.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject10", text_subject10.getText().toString(),"pmDate10", currentDate,"pmSubject10Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button10.setEnabled(false);
                 }
                 Date start11 = sdf.parse(timeS11);
                 Date end11 = sdf.parse(timeE11);

                 if((current.compareTo(start11) > 0) && (current.compareTo(end11) < 0)){
                     attend_button11.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject11", text_subject11.getText().toString(),"amDate11", currentDate,"amSubject11Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button11.setEnabled(false);
                 }
                 Date start12 = sdf.parse(timeS12);
                 Date end12 = sdf.parse(timeE12);


                 if((current.compareTo(start12) > 0) && (current.compareTo(end12) < 0)){
                     attend_button12.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject12", text_subject12.getText().toString(),"amDate12", currentDate,"amSubject12Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button12.setEnabled(false);
                 }
                 Date start13 = sdf.parse(timeS13);
                 Date end13 = sdf.parse(timeE13);

                 if((current.compareTo(start13) > 0) && (current.compareTo(end13) < 0)){
                     attend_button13.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject13", text_subject13.getText().toString(),"amDate13", currentDate,"amSubject13Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button13.setEnabled(false);
                 }
                 Date start14 = sdf.parse(timeS14);
                 Date end14 = sdf.parse(timeE14);

                 if((current.compareTo(start14) > 0) && (current.compareTo(end14) < 0)){
                     attend_button14.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject14", text_subject14.getText().toString(),"pmDate14", currentDate,"pmSubject14Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button14.setEnabled(false);
                 }
                 Date start15 = sdf.parse(timeS15);
                 Date end15 = sdf.parse(timeE15);

                 if((current.compareTo(start15) > 0) && (current.compareTo(end15) < 0)){
                     attend_button15.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject15", text_subject15.getText().toString(),"pmDate15", currentDate,"pmSubject15Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button15.setEnabled(false);
                 }
                 Date start16 = sdf.parse(timeS16);
                 Date end16 = sdf.parse(timeE16);

                 if((current.compareTo(start16) > 0) && (current.compareTo(end16) < 0)){
                     attend_button16.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject16", text_subject16.getText().toString(),"amDate16", currentDate,"amSubject16Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button16.setEnabled(false);
                 }
                 Date start17 = sdf.parse(timeS17);
                 Date end17 = sdf.parse(timeE17);


                 if((current.compareTo(start17) > 0) && (current.compareTo(end17) < 0)){
                     attend_button17.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject17", text_subject17.getText().toString(),"amDate17", currentDate,"amSubject17Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button17.setEnabled(false);
                 }
                 Date start18 = sdf.parse(timeS18);
                 Date end18 = sdf.parse(timeE18);

                 if((current.compareTo(start18) > 0) && (current.compareTo(end18) < 0)){
                     attend_button18.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject18", text_subject18.getText().toString(),"amDate18", currentDate,"amSubject18Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button18.setEnabled(false);
                 }
                 Date start19 = sdf.parse(timeS19);
                 Date end19 = sdf.parse(timeE19);


                 if((current.compareTo(start19) > 0) && (current.compareTo(end19) < 0)){
                     attend_button19.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject19", text_subject19.getText().toString(),"pmDate19", currentDate,"pmSubject19Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button19.setEnabled(false);
                 }
                 Date start20 = sdf.parse(timeS20);
                 Date end20 = sdf.parse(timeE20);


                 if((current.compareTo(start20) > 0) && (current.compareTo(end20) < 0)){
                     attend_button20.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject20", text_subject20.getText().toString(),"pmDate20", currentDate,"pmSubject20Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button20.setEnabled(false);
                 }
                 Date start21 = sdf.parse(timeS21);
                 Date end21 = sdf.parse(timeE21);

                 if((current.compareTo(start21) > 0) && (current.compareTo(end21) < 0)){
                     attend_button21.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject21", text_subject21.getText().toString(),"amDate21", currentDate,"amSubject21Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button21.setEnabled(false);
                 }
                 Date start22 = sdf.parse(timeS22);
                 Date end22 = sdf.parse(timeE22);

                 if((current.compareTo(start22) > 0) && (current.compareTo(end22) < 0)){
                     attend_button22.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject22", text_subject22.getText().toString(),"amDate22", currentDate,"amSubject22Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button22.setEnabled(false);
                 }
                 Date start23 = sdf.parse(timeS23);
                 Date end23 = sdf.parse(timeE23);

                 if((current.compareTo(start23) > 0) && (current.compareTo(end23) < 0)){
                     attend_button23.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("amSubject23", text_subject23.getText().toString(),"amDate23", currentDate,"amSubject23Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button23.setEnabled(false);
                 }
                 Date start24 = sdf.parse(timeS24);
                 Date end24 = sdf.parse(timeE24);


                 if((current.compareTo(start24) > 0) && (current.compareTo(end24) < 0)){
                     attend_button24.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject24", text_subject24.getText().toString(),"pmDate24", currentDate,"pmSubject24Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button24.setEnabled(false);
                 }
                 Date start25 = sdf.parse(timeS25);
                 Date end25 = sdf.parse(timeE25);
                 if((current.compareTo(start25) > 0) && (current.compareTo(end25) < 0)){
                     attend_button25.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             DocumentReference tAttendance = ffStore.collection("teacherAttendance").document(user);
                             tAttendance.update("pmSubject25", text_subject25.getText().toString(),"pmDate25", currentDate,"pmSubject25Stat", "Present").addOnCompleteListener(new OnCompleteListener<Void>() {
                                 @Override
                                 public void onComplete(@NonNull Task<Void> task) {
                                     if (task.isSuccessful()){
                                         Toast.makeText(home_user.this, "Attendance Recorded", Toast.LENGTH_SHORT).show();
                                     }
                                     else{
                                         Toast.makeText(home_user.this, "Failed Recording Attendance", Toast.LENGTH_SHORT).show();
                                     }
                                 }
                             });
                         }
                     });
                 }
                 else{
                     attend_button25.setEnabled(false);
                 }
                }

             catch (ParseException e) {
                 // Exception handling goes here
             }
            }
        });





        backhome_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDash = new Intent(home_user.this, dash_user.class);
                startActivity(toDash);
            }
        });


    }


    }
    

