package com.example.citelogbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class add_user extends AppCompatActivity {
Button backadd_admin, adduser;
boolean valid = true;
EditText fullname, email, password, userid, phone;
FirebaseAuth fAuth;
FirebaseFirestore fStore;
//Monday
String day1, amSubject1, amSection1, amSTime1, amETime1, day2, amSubject2, amSection2, amSTime2, amETime2, day3, amSubject3, amSection3, amSTime3, amETime3, day4, pmSubject4, pmSection4, pmSTime4, pmETime4, day5, pmSubject5, pmSection5, pmSTime5, pmETime5;
//Tuesday
String day6, amSubject6, amSection6, amSTime6, amETime6, day7, amSubject7, amSection7, amSTime7, amETime7, day8, amSubject8, amSection8,amSTime8, amETime8, day9, pmSubject9, pmSection9, pmSTime9, pmETime9, day10, pmSubject10, pmSection10, pmSTime10, pmETime10;
//Wednesday
String day11, amSubject11, amSection11, amSTime11, amETime11, day12, amSubject12, amSection12, amSTime12, amETime12, day13, amSubject13, amSection13, amSTime13, amETime13, day14, pmSubject14, pmSection14, pmSTime14, pmETime14, day15, pmSubject15, pmSection15, pmSTime15, pmETime15;
//Thursday
String day16, amSubject16, amSection16, amSTime16, amETime16, day17, amSubject17, amSection17, amSTime17, amETime17, day18, amSubject18, amSection18, amSTime18, amETime18, day19, pmSubject19, pmSection19, pmSTime19, pmETime19, day20, pmSubject20, pmSection20, pmSTime20, pmETime20;
//Friday
String day21, amSubject21, amSection21, amSTime21, amETime21, day22, amSubject22, amSection22, amSTime22, amETime22, day23, amSubject23, amSection23, amSTime23, amETime23, day24, pmSubject24, pmSection24, pmSTime24, pmETime24, day25, pmSubject25, pmSection25, pmSTime25, pmETime25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_user_layout);

        fullname = findViewById(R.id.fullname);
        email = findViewById(R.id.email_add);
        password = findViewById(R.id.password);
        phone = findViewById(R.id.phone);
        userid = findViewById(R.id.idnumber);
        backadd_admin = findViewById(R.id.backadmin_adduser);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        adduser = findViewById(R.id.adduser_button);

        adduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkField(fullname);
                checkField(email);
                checkField(userid);
                checkField(phone);
                checkField(password);
                if (valid){
                    //start adding user process
                    fAuth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString()).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                           /* FirebaseUser user = FirebaseUser.getCurrentUser();
                            fAuth = user.getUid;*/

                            day1 = "Monday";
                            day2 = "Monday";
                            day3 = "Monday";
                            day4 = "Monday";
                            day5 = "Monday";
                            day6 = "Tuesday";
                            day7 = "Tuesday";
                            day8 = "Tuesday";
                            day9 = "Tuesday";
                            day10 = "Tuesday";
                            day11 = "Wednesday";
                            day12 = "Wednesday";
                            day13 = "Wednesday";
                            day14 = "Wednesday";
                            day15 = "Wednesday";
                            day16 = "Thursday";
                            day17 = "Thursday";
                            day18 = "Thursday";
                            day19 = "Thursday";
                            day20 = "Thursday";
                            day21 = "Friday";
                            day22 = "Friday";
                            day23 = "Friday";
                            day24 = "Friday";
                            day25 = "Friday";
                            //monday am
                            amSubject1 = "none";
                            amSection1 = "none";
                            amSTime1 = "none";
                            amETime1 = "none";
                            amSubject2 = "none";
                            amSection2 = "none";
                            amSTime2 = "none";
                            amETime2 = "none";
                            amSubject3 = "none";
                            amSection3 = "none";
                            amSTime3 = "none";
                            amETime3 = "none";
                            //monday pm
                            pmSubject4 = "none";
                            pmSection4 = "none";
                            pmSTime4 = "none";
                            pmETime4 = "none";
                            pmSubject5 = "none";
                            pmSection5 = "none";
                            pmSTime5 = "none";
                            pmETime5 = "none";
                            //tuesday am
                            amSubject6 = "none";
                            amSection6 ="none";
                            amSTime6 = "none";
                            amETime6 = "none";
                            amSubject7 = "none";
                            amSection7 = "none";
                            amSTime7 = "none";
                            amETime7 = "none";
                            amSubject8 = "none";
                            amSection8 = "none";
                            amSTime8 = "none";
                            amETime8 = "none";
                            //tueday pm
                            pmSubject9 = "none";
                            pmSection9 = "none";
                            pmSTime9 = "none";
                            pmETime9 = "none";
                            pmSubject10 = "none";
                            pmSection10 = "none";
                            pmSTime10 = "none";
                            pmETime10 = "none";
                            //wednesday am
                            amSubject11 = "none";
                            amSection11 = "none";
                            amSTime11 = "none";
                            amETime11 = "none";
                            amSubject12 = "none";
                            amSection12 = "none";
                            amSTime12 = "none";
                            amETime12 = "none";
                            amSubject13 = "none";
                            amSection13 = "none";
                            amSTime13 = "none";
                            amETime13 = "none";
                            //wednesday pm
                            pmSubject14 = "none";
                            pmSection14 = "none";
                            pmSTime14 = "none";
                            pmETime14 = "none";
                            pmSubject15 = "none";
                            pmSection15 = "none";
                            pmSTime15 = "none";
                            pmETime15 = "none";
                            //thursday am
                            amSubject16 = "none";
                            amSection16 = "none";
                            amSTime16 = "none";
                            amETime16 = "none";
                            amSubject17 = "none";
                            amSection17 = "none";
                            amSTime17 = "none";
                            amETime17 = "none";
                            amSubject18 = "none";
                            amSection18 = "none";
                            amSTime18 = "none";
                            amETime18 = "none";
                            //thursday pm
                            pmSubject19 = "none";
                            pmSection19 = "none";
                            pmSTime19 = "none";
                            pmETime19 = "none";
                            pmSubject20 = "none";
                            pmSection20 = "none";
                            pmSTime20 = "none";
                            pmETime20 = "none";
                            //friday am
                            amSubject21 = "none";
                            amSection21 = "none";
                            amSTime21 = "none";
                            amETime21 = "none";
                            amSubject22 = "none";
                            amSection22 = "none";
                            amSTime22 = "none";
                            amETime22 = "none";
                            amSubject23 = "none";
                            amSection23 = "none";
                            amSTime23 = "none";
                            amETime23 = "none";
                            //friday pm
                            pmSubject24 = "none";
                            pmSection24 = "none";
                            pmSTime24 = "none";
                            pmETime24 = "none";
                            pmSubject25 = "none";
                            pmSection25 = "none";
                            pmSTime25 = "none";
                            pmETime25 = "none";

                            String amDate1 = "none";
                            String amSubject1Stat = "none";

                            String amDate2 = "none";
                            String amSubject2Stat = "none";

                            String amDate3 = "none";
                            String amSubject3Stat = "none";

                            String pmDate4 = "none";
                            String pmSubject4Stat = "none";

                            String pmDate5 = "none";
                            String pmSubject5Stat = "none";

                            String amDate6 = "none";
                            String amSubject6Stat = "none";

                            String amDate7 = "none";
                            String amSubject7Stat = "none";

                            String amDate8 = "none";
                            String amSubject8Stat = "none";

                            String pmDate9 = "none";
                            String pmSubject9Stat = "none";

                            String pmDate10 = "none";
                            String pmSubject10Stat = "none";

                            String amDate11 = "none";
                            String amSubject11Stat = "none";

                            String amDate12 = "none";
                            String amSubject12Stat = "none";

                            String amDate13 = "none";
                            String amSubject13Stat = "none";

                            String pmDate14 = "none";
                            String pmSubject14Stat = "none";

                            String pmDate15 = "none";
                            String pmSubject15Stat = "none";

                            String amDate16 = "none";
                            String amSubject16Stat = "none";

                            String amDate17 = "none";
                            String amSubject17Stat = "none";

                            String amDate18 = "none";
                            String amSubject18Stat = "none";

                            String pmDate19 = "none";
                            String pmSubject19Stat = "none";

                            String pmDate20 = "none";
                            String pmSubject20Stat = "none";

                            String amDate21 = "none";
                            String amSubject21Stat = "none";

                            String amDate22 = "none";
                            String amSubject22Stat = "none";

                            String amDate23 = "none";
                            String amSubject23Stat = "none";

                            String pmDate24 = "none";
                            String pmSubject24Stat = "none";

                            String pmDate25 = "none";
                            String pmSubject25Stat = "none";

                            String userTeacher = fAuth.getUid();
                            String userUser = fAuth.getUid();
                            DocumentReference teacherUID = fStore.collection("teachers").document(userTeacher);
                            DocumentReference userUID = fStore.collection("users").document(userUser);
                            DocumentReference teacherAttendance = fStore.collection("teacherAttendance").document(userTeacher);

                            Map<String,String> userInfo = new HashMap<>();
                            userInfo.put("fullname", fullname.getText().toString());
                            userInfo.put("email", email.getText().toString());
                            userInfo.put("idNumber", userid.getText().toString());
                            userInfo.put("phonenumber", phone.getText().toString());
                            userInfo.put("password", password.getText().toString());
                            userInfo.put("userID", userUser);
                            // specify if the user is admin
                            userInfo.put("isUser", "2");
                            userUID.set(userInfo);

                            Map<String,String> teacherInfo = new HashMap<>();
                            //teacherinfo
                            teacherInfo.put("fullname", fullname.getText().toString());
                            teacherInfo.put("email", email.getText().toString());
                            teacherInfo.put("idNumber", userid.getText().toString());
                            teacherInfo.put("phonenumber", phone.getText().toString());
                            teacherInfo.put("userID", userTeacher);
                            /*SCHEDULING STARTS*/
                            //days
                            teacherInfo.put("day1", day1);
                            teacherInfo.put("day2", day2);
                            teacherInfo.put("day3", day3);
                            teacherInfo.put("day4", day4);
                            teacherInfo.put("day5", day5);
                            teacherInfo.put("day6", day6);
                            teacherInfo.put("day7", day7);
                            teacherInfo.put("day8", day8);
                            teacherInfo.put("day9", day9);
                            teacherInfo.put("day10", day10);
                            teacherInfo.put("day11", day11);
                            teacherInfo.put("day12", day12);
                            teacherInfo.put("day13", day13);
                            teacherInfo.put("day14", day14);
                            teacherInfo.put("day15", day15);
                            teacherInfo.put("day16", day16);
                            teacherInfo.put("day17", day17);
                            teacherInfo.put("day18", day18);
                            teacherInfo.put("day19", day19);
                            teacherInfo.put("day20", day20);
                            teacherInfo.put("day21", day21);
                            teacherInfo.put("day22", day22);
                            teacherInfo.put("day23", day23);
                            teacherInfo.put("day24", day24);
                            teacherInfo.put("day25", day25);
                            //monday am
                            teacherInfo.put("amSubject1", amSubject1);
                            teacherInfo.put("amSection1", amSection1);
                            teacherInfo.put("amSTime1", amSTime1);
                            teacherInfo.put("amETime1", amETime1);
                            teacherInfo.put("amSubject2", amSubject2);
                            teacherInfo.put("amSection2", amSection2);
                            teacherInfo.put("amSTime2", amSTime2);
                            teacherInfo.put("amETime2", amETime2);
                            teacherInfo.put("amSubject3", amSubject3);
                            teacherInfo.put("amSection3", amSection3);
                            teacherInfo.put("amSTime3", amSTime3);
                            teacherInfo.put("amETime3", amETime3);
                            //monday pm
                            teacherInfo.put("pmSubject4", pmSubject4);
                            teacherInfo.put("pmSection4", pmSection4);
                            teacherInfo.put("pmSTime4", pmSTime4);
                            teacherInfo.put("pmETime4", pmETime4);
                            teacherInfo.put("pmSubject5", pmSubject5);
                            teacherInfo.put("pmSection5", pmSection5);
                            teacherInfo.put("pmSTime5", pmSTime5);
                            teacherInfo.put("pmETime5", pmETime5);
                            //tuesday am
                            teacherInfo.put("amSubject6", amSubject6);
                            teacherInfo.put("amSection6", amSection6);
                            teacherInfo.put("amSTime6", amSTime6);
                            teacherInfo.put("amETime6", amETime6);
                            teacherInfo.put("amSubject7", amSubject7);
                            teacherInfo.put("amSection7", amSection7);
                            teacherInfo.put("amSTime7", amSTime7);
                            teacherInfo.put("amETime7", amETime7);
                            teacherInfo.put("amSubject8", amSubject8);
                            teacherInfo.put("amSection8", amSection8);
                            teacherInfo.put("amSTime8", amSTime8);
                            teacherInfo.put("amETime8", amETime8);
                            //tuesday pm
                            teacherInfo.put("pmSubject9",pmSubject9);
                            teacherInfo.put("pmSection9", pmSection9);
                            teacherInfo.put("pmSTime9", pmSTime9);
                            teacherInfo.put("pmETime9", pmETime9);
                            teacherInfo.put("pmSubject10", pmSubject10);
                            teacherInfo.put("pmSection10", pmSection10);
                            teacherInfo.put("pmSTime10", pmSTime10);
                            teacherInfo.put("pmETime10", pmETime10);
                            //wednesday am
                            teacherInfo.put("amSubject11", amSubject11);
                            teacherInfo.put("amSection11", amSection11);
                            teacherInfo.put("amSTime11", amSTime11);
                            teacherInfo.put("amETime11", amETime11);
                            teacherInfo.put("amSubject12", amSubject12);
                            teacherInfo.put("amSection12", amSection12);
                            teacherInfo.put("amSTime12", amSTime12);
                            teacherInfo.put("amETime12", amETime12);
                            teacherInfo.put("amSubject13", amSubject13);
                            teacherInfo.put("amSection13", amSection13);
                            teacherInfo.put("amSTime13", amSTime13);
                            teacherInfo.put("amETime13", amETime13);
                            //wednesday pm
                            teacherInfo.put("pmSubject14", pmSubject14);
                            teacherInfo.put("pmSection14", pmSection14);
                            teacherInfo.put("pmSTime14", pmSTime14);
                            teacherInfo.put("pmETime14", pmETime14);
                            teacherInfo.put("pmSubject15", pmSubject15);
                            teacherInfo.put("pmSection15", pmSection15);
                            teacherInfo.put("pmSTime15", pmSTime15);
                            teacherInfo.put("pmETime15", pmETime15);
                            //thursday am
                            teacherInfo.put("amSubject16", amSubject16);
                            teacherInfo.put("amSection16", amSection16);
                            teacherInfo.put("amSTime16", amSTime16);
                            teacherInfo.put("amETime16", amETime16);
                            teacherInfo.put("amSubject17", amSubject17);
                            teacherInfo.put("amSection17", amSection17);
                            teacherInfo.put("amSTime17", amSTime17);
                            teacherInfo.put("amETime17", amETime17);
                            teacherInfo.put("amSubject18", amSubject18);
                            teacherInfo.put("amSection18", amSection18);
                            teacherInfo.put("amSTime18", amSTime18);
                            teacherInfo.put("amETime18", amETime18);
                            //thursday pm
                            teacherInfo.put("pmSubject19", pmSubject19);
                            teacherInfo.put("pmSection19", pmSection19);
                            teacherInfo.put("pmSTime19", pmSTime19);
                            teacherInfo.put("pmETime19",pmETime19);
                            teacherInfo.put("pmSubject20", pmSubject20);
                            teacherInfo.put("pmSection20", pmSection20);
                            teacherInfo.put("pmSTime20", pmSTime20);
                            teacherInfo.put("pmETime20", pmETime20);
                            //friday am
                            teacherInfo.put("amSubject21", amSubject21);
                            teacherInfo.put("amSection21", amSection21);
                            teacherInfo.put("amSTime21", amSTime21);
                            teacherInfo.put("amETime21", amETime21);
                            teacherInfo.put("amSubject22", amSubject22);
                            teacherInfo.put("amSection22", amSection22);
                            teacherInfo.put("amSTime22", amSTime22);
                            teacherInfo.put("amETime22", amETime22);
                            teacherInfo.put("amSubject23", amSubject23);
                            teacherInfo.put("amSection23", amSection23);
                            teacherInfo.put("amSTime23", amSTime23);
                            teacherInfo.put("amETime23", amETime23);
                            //friday pm
                            teacherInfo.put("pmSubject24", pmSubject24);
                            teacherInfo.put("pmSection24", pmSection24);
                            teacherInfo.put("pmSTime24", pmSTime24);
                            teacherInfo.put("pmETime24", pmETime24);
                            teacherInfo.put("pmSubject25", pmSubject25);
                            teacherInfo.put("pmSection25", pmSection25);
                            teacherInfo.put("pmSTime25", pmSTime25);
                            teacherInfo.put("pmETime25", pmETime25);
                            /*SCHEDULING ENDS*/
                            teacherUID.set(teacherInfo);

                            Map<String,String> tAttend = new HashMap<>();

                            tAttend.put("fullname", fullname.getText().toString());
                            tAttend.put("userID", userTeacher);
                            tAttend.put("amSubject1",amSubject1);
                            tAttend.put("amDate1",amDate1);
                            tAttend.put("amSubject1Stat", amSubject1Stat);

                            tAttend.put("amSubject2",amSubject2);
                            tAttend.put("amDate2",amDate2);
                            tAttend.put("amSubject2Stat", amSubject2Stat);

                            tAttend.put("amSubject3",amSubject3);
                            tAttend.put("amDate3",amDate3);
                            tAttend.put("amSubject3Stat", amSubject3Stat);

                            tAttend.put("pmSubject4",pmSubject4);
                            tAttend.put("pmDate4",pmDate4);
                            tAttend.put("pmSubject4Stat", pmSubject4Stat);

                            tAttend.put("pmSubject5",pmSubject5);
                            tAttend.put("pmDate5",pmDate5);
                            tAttend.put("pmSubject5Stat", pmSubject5Stat);

                            tAttend.put("amSubject6",amSubject6);
                            tAttend.put("amDate6",amDate6);
                            tAttend.put("amSubject6Stat", amSubject6Stat);

                            tAttend.put("amSubject7",amSubject7);
                            tAttend.put("amDate7",amDate7);
                            tAttend.put("amSubject7Stat", amSubject7Stat);

                            tAttend.put("amSubject8",amSubject8);
                            tAttend.put("amDate8",amDate8);
                            tAttend.put("amSubject8Stat", amSubject8Stat);

                            tAttend.put("pmSubject9",pmSubject9);
                            tAttend.put("pmDate9",pmDate9);
                            tAttend.put("pmSubject9Stat", pmSubject9Stat);

                            tAttend.put("pmSubject10",pmSubject10);
                            tAttend.put("pmDate10",pmDate10);
                            tAttend.put("pmSubject10Stat", pmSubject10Stat);

                            tAttend.put("amSubject11",amSubject11);
                            tAttend.put("amDate11",amDate11);
                            tAttend.put("amSubject11Stat", amSubject11Stat);

                            tAttend.put("amSubject12",amSubject12);
                            tAttend.put("amDate12",amDate12);
                            tAttend.put("amSubject12Stat", amSubject12Stat);

                            tAttend.put("amSubject13",amSubject13);
                            tAttend.put("amDate13",amDate13);
                            tAttend.put("amSubject13Stat", amSubject13Stat);

                            tAttend.put("pmSubject14",pmSubject14);
                            tAttend.put("pmDate14",pmDate14);
                            tAttend.put("pmSubject14Stat", pmSubject14Stat);

                            tAttend.put("pmSubject15",pmSubject15);
                            tAttend.put("pmDate15",pmDate15);
                            tAttend.put("pmSubject15Stat", pmSubject15Stat);

                            tAttend.put("amSubject16",amSubject16);
                            tAttend.put("amDate16",amDate16);
                            tAttend.put("amSubject16Stat", amSubject16Stat);

                            tAttend.put("amSubject17",amSubject17);
                            tAttend.put("amDate17",amDate17);
                            tAttend.put("amSubject17Stat", amSubject17Stat);

                            tAttend.put("amSubject18",amSubject18);
                            tAttend.put("amDate18",amDate18);
                            tAttend.put("amSubject18Stat", amSubject18Stat);

                            tAttend.put("pmSubject19",pmSubject19);
                            tAttend.put("pmDate19",pmDate19);
                            tAttend.put("pmSubject19Stat", pmSubject19Stat);

                            tAttend.put("pmSubject20",pmSubject20);
                            tAttend.put("pmDate20",pmDate20);
                            tAttend.put("pmSubject20Stat", pmSubject20Stat);

                            tAttend.put("amSubject21",amSubject21);
                            tAttend.put("amDate21",amDate21);
                            tAttend.put("amSubject21Stat", amSubject21Stat);

                            tAttend.put("amSubject22",amSubject22);
                            tAttend.put("amDate22",amDate22);
                            tAttend.put("amSubject22Stat", amSubject22Stat);

                            tAttend.put("amSubject23",amSubject23);
                            tAttend.put("amDate23",amDate23);
                            tAttend.put("amSubject23Stat", amSubject23Stat);

                            tAttend.put("pmSubject24",pmSubject24);
                            tAttend.put("pmDate24",pmDate24);
                            tAttend.put("pmSubject24Stat", pmSubject24Stat);

                            tAttend.put("pmSubject25",pmSubject25);
                            tAttend.put("pmDate25",pmDate25);
                            tAttend.put("pmSubject5Stat", pmSubject25Stat);

                            teacherAttendance.set(tAttend);


                            Toast.makeText(add_user.this, "Account Created", Toast.LENGTH_SHORT).show();
                            fullname.setText("");
                            email.setText("");
                            password.setText("");
                            phone.setText("");
                            userid.setText("");
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(add_user.this,"Failed to Add User", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });


        backadd_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(add_user.this,UserSettings_admin.class);
                startActivity(back);
            }
        });

    }
    public boolean checkField(EditText textField){
        if(textField.getText().toString().isEmpty()){
            textField.setError("Error");
            valid = false;
        }
        else{
            valid = true;
        }
        return valid;
    }
}