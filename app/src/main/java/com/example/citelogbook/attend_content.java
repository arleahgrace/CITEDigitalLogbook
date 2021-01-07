package com.example.citelogbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

public class attend_content extends AppCompatActivity {
    Button back_attend;
    FirebaseFirestore fire_store;
    TextView tname;

    //monday
    TextView tsubject1, tdate1, tstat1,tsubject2, tdate2, tstat2,tsubject3, tdate3, tstat3,tsubject4, tdate4, tstat4,tsubject5, tdate5, tstat5;
    //tuesday
    TextView tsubject6, tdate6, tstat6,tsubject7, tdate7, tstat7,tsubject8, tdate8, tstat8,tsubject9, tdate9, tstat9,tsubject10, tdate10, tstat10;
    //wednesday
    TextView tsubject11, tdate11, tstat11,tsubject12, tdate12, tstat12,tsubject13, tdate13, tstat13,tsubject14, tdate14, tstat14,tsubject15, tdate15, tstat15;
    //thursday
    TextView tsubject16, tdate16, tstat16,tsubject17, tdate17, tstat17,tsubject18, tdate18, tstat18,tsubject19, tdate19, tstat19,tsubject20, tdate20, tstat20;
    //friday
    TextView tsubject21, tdate21, tstat21,tsubject22, tdate22, tstat22,tsubject23, tdate23, tstat23,tsubject24, tdate24, tstat24,tsubject25, tdate25, tstat25;

    String textname, t_subject1, t_date1, t_stat1,t_subject2, t_date2, t_stat2,t_subject3, t_date3, t_stat3,t_subject4, t_date4, t_stat4,t_subject5, t_date5, t_stat5;
    String t_subject6, t_date6, t_stat6,t_subject7, t_date7, t_stat7,t_subject8, t_date8, t_stat8,t_subject9, t_date9, t_stat9,t_subject10, t_date10, t_stat10;
    String t_subject11, t_date11, t_stat11,t_subject12, t_date12, t_stat12,t_subject13, t_date13, t_stat13,t_subject14, t_date14, t_stat14,t_subject15, t_date15, t_stat15;
    String t_subject16, t_date16, t_stat16,t_subject17, t_date17, t_stat17,t_subject18, t_date18, t_stat18,t_subject19, t_date19, t_stat19,t_subject20, t_date20, t_stat20;
    String t_subject21, t_date21, t_stat21,t_subject22, t_date22, t_stat22,t_subject23, t_date23, t_stat23,t_subject24, t_date24, t_stat24,t_subject25, t_date25, t_stat25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attend_content_layout);

        back_attend = findViewById(R.id.back_attend);
        fire_store = FirebaseFirestore.getInstance();

        tname = findViewById(R.id.tname);

        tsubject1 = findViewById(R.id.tsubject1);
        tdate1 = findViewById(R.id.tdate1);
        tstat1 = findViewById(R.id.tstat1);

        tsubject2 = findViewById(R.id.tsubject2);
        tdate2 = findViewById(R.id.tdate2);
        tstat2 = findViewById(R.id.tstat2);

        tsubject3 = findViewById(R.id.tsubject3);
        tdate3 = findViewById(R.id.tdate3);
        tstat3 = findViewById(R.id.tstat3);

        tsubject4 = findViewById(R.id.tsubject4);
        tdate4 = findViewById(R.id.tdate4);
        tstat4 = findViewById(R.id.tstat4);

        tsubject5 = findViewById(R.id.tsubject5);
        tdate5 = findViewById(R.id.tdate5);
        tstat5 = findViewById(R.id.tstat5);

        tsubject6 = findViewById(R.id.tsubject6);
        tdate6 = findViewById(R.id.tdate6);
        tstat6 = findViewById(R.id.tstat6);

        tsubject7 = findViewById(R.id.tsubject7);
        tdate7 = findViewById(R.id.tdate7);
        tstat7 = findViewById(R.id.tstat7);

        tsubject8 = findViewById(R.id.tsubject8);
        tdate8 = findViewById(R.id.tdate8);
        tstat8 = findViewById(R.id.tstat8);

        tsubject9 = findViewById(R.id.tsubject9);
        tdate9 = findViewById(R.id.tdate9);
        tstat9 = findViewById(R.id.tstat9);

        tsubject10 = findViewById(R.id.tsubject10);
        tdate10 = findViewById(R.id.tdate10);
        tstat10 = findViewById(R.id.tstat10);

        tsubject11 = findViewById(R.id.tsubject11);
        tdate11 = findViewById(R.id.tdate11);
        tstat11 = findViewById(R.id.tstat11);

        tsubject12 = findViewById(R.id.tsubject12);
        tdate12 = findViewById(R.id.tdate12);
        tstat12 = findViewById(R.id.tstat12);

        tsubject13 = findViewById(R.id.tsubject13);
        tdate13 = findViewById(R.id.tdate13);
        tstat13 = findViewById(R.id.tstat13);

        tsubject14 = findViewById(R.id.tsubject14);
        tdate14 = findViewById(R.id.tdate14);
        tstat14 = findViewById(R.id.tstat14);

        tsubject15 = findViewById(R.id.tsubject15);
        tdate15 = findViewById(R.id.tdate15);
        tstat15 = findViewById(R.id.tstat15);

        tsubject16 = findViewById(R.id.tsubject16);
        tdate16 = findViewById(R.id.tdate16);
        tstat16 = findViewById(R.id.tstat16);

        tsubject17 = findViewById(R.id.tsubject17);
        tdate17 = findViewById(R.id.tdate17);
        tstat17 = findViewById(R.id.tstat17);

        tsubject18 = findViewById(R.id.tsubject18);
        tdate18 = findViewById(R.id.tdate18);
        tstat18 = findViewById(R.id.tstat18);

        tsubject19 = findViewById(R.id.tsubject19);
        tdate19 = findViewById(R.id.tdate19);
        tstat19 = findViewById(R.id.tstat19);

        tsubject20 = findViewById(R.id.tsubject20);
        tdate20 = findViewById(R.id.tdate20);
        tstat20 = findViewById(R.id.tstat20);

        tsubject21 = findViewById(R.id.tsubject21);
        tdate21 = findViewById(R.id.tdate21);
        tstat21 = findViewById(R.id.tstat21);

        tsubject22 = findViewById(R.id.tsubject22);
        tdate22 = findViewById(R.id.tdate22);
        tstat22 = findViewById(R.id.tstat22);

        tsubject23 = findViewById(R.id.tsubject23);
        tdate23 = findViewById(R.id.tdate23);
        tstat23 = findViewById(R.id.tstat23);

        tsubject24 = findViewById(R.id.tsubject24);
        tdate24 = findViewById(R.id.tdate24);
        tstat24 = findViewById(R.id.tstat24);

        tsubject25 = findViewById(R.id.tsubject25);
        tdate25 = findViewById(R.id.tdate25);
        tstat25 = findViewById(R.id.tstat25);


        //get string
        textname = getIntent().getStringExtra("tname");
        t_subject1 = getIntent().getStringExtra("amSubject1");
        t_date1 = getIntent().getStringExtra("amDate1");
        t_stat1 = getIntent().getStringExtra("amSubject1Stat");

        t_subject2 = getIntent().getStringExtra("amSubject2");
        t_date2 = getIntent().getStringExtra("amDate2");
        t_stat2 = getIntent().getStringExtra("amSubject2Stat");

        t_subject3 = getIntent().getStringExtra("amSubject3");
        t_date3 = getIntent().getStringExtra("amDate3");
        t_stat3 = getIntent().getStringExtra("amSubject3Stat");

        t_subject4 = getIntent().getStringExtra("pmSubject4");
        t_date4 = getIntent().getStringExtra("pmDate4");
        t_stat4 = getIntent().getStringExtra("pmSubject4Stat");

        t_subject5 = getIntent().getStringExtra("pmSubject5");
        t_date5 = getIntent().getStringExtra("pmDate5");
        t_stat5 = getIntent().getStringExtra("pmSubject5Stat");

        t_subject6 = getIntent().getStringExtra("amSubject6");
        t_date6 = getIntent().getStringExtra("amDate6");
        t_stat6 = getIntent().getStringExtra("amSubject6Stat");

        t_subject7 = getIntent().getStringExtra("amSubject7");
        t_date7 = getIntent().getStringExtra("amDate7");
        t_stat7 = getIntent().getStringExtra("amSubject7Stat");

        t_subject8 = getIntent().getStringExtra("amSubject8");
        t_date8 = getIntent().getStringExtra("amDate8");
        t_stat8 = getIntent().getStringExtra("amSubject8Stat");

        t_subject9 = getIntent().getStringExtra("pmSubject9");
        t_date9 = getIntent().getStringExtra("pmDate9");
        t_stat9 = getIntent().getStringExtra("pmSubject9Stat");

        t_subject10 = getIntent().getStringExtra("pmSubject10");
        t_date10 = getIntent().getStringExtra("pmDate10");
        t_stat10 = getIntent().getStringExtra("pmSubject10Stat");

        t_subject11 = getIntent().getStringExtra("amSubject11");
        t_date11 = getIntent().getStringExtra("amDate11");
        t_stat11 = getIntent().getStringExtra("amSubject11Stat");

        t_subject12 = getIntent().getStringExtra("amSubject12");
        t_date12 = getIntent().getStringExtra("amDate12");
        t_stat12 = getIntent().getStringExtra("amSubject12Stat");

        t_subject13 = getIntent().getStringExtra("amSubject13");
        t_date13 = getIntent().getStringExtra("amDate13");
        t_stat13 = getIntent().getStringExtra("amSubject13Stat");

        t_subject14 = getIntent().getStringExtra("pmSubject14");
        t_date14 = getIntent().getStringExtra("pmDate14");
        t_stat14 = getIntent().getStringExtra("pmSubject14Stat");

        t_subject15 = getIntent().getStringExtra("pmSubject15");
        t_date15 = getIntent().getStringExtra("pmDate15");
        t_stat15 = getIntent().getStringExtra("pmSubject15Stat");

        t_subject16 = getIntent().getStringExtra("amSubject16");
        t_date16 = getIntent().getStringExtra("amDate16");
        t_stat16 = getIntent().getStringExtra("amSubject16Stat");

        t_subject17 = getIntent().getStringExtra("amSubject17");
        t_date17 = getIntent().getStringExtra("amDate17");
        t_stat17 = getIntent().getStringExtra("amSubject17Stat");

        t_subject18 = getIntent().getStringExtra("amSubject18");
        t_date18 = getIntent().getStringExtra("amDate18");
        t_stat18 = getIntent().getStringExtra("amSubject18Stat");

        t_subject19 = getIntent().getStringExtra("pmSubject19");
        t_date19 = getIntent().getStringExtra("pmDate19");
        t_stat19 = getIntent().getStringExtra("pmSubject19Stat");

        t_subject20 = getIntent().getStringExtra("pmSubject20");
        t_date20 = getIntent().getStringExtra("pmDate20");
        t_stat20 = getIntent().getStringExtra("pmSubject20Stat");

        t_subject21 = getIntent().getStringExtra("amSubject21");
        t_date21 = getIntent().getStringExtra("amDate21");
        t_stat21 = getIntent().getStringExtra("amSubject21Stat");

        t_subject22 = getIntent().getStringExtra("amSubject22");
        t_date22 = getIntent().getStringExtra("amDate22");
        t_stat22 = getIntent().getStringExtra("amSubject22Stat");

        t_subject23 = getIntent().getStringExtra("amSubject23");
        t_date23 = getIntent().getStringExtra("amDate23");
        t_stat23 = getIntent().getStringExtra("amSubject23Stat");

        t_subject24 = getIntent().getStringExtra("pmSubject24");
        t_date24 = getIntent().getStringExtra("pmDate24");
        t_stat24 = getIntent().getStringExtra("pmSubject24Stat");

        t_subject25 = getIntent().getStringExtra("pmSubject25");
        t_date25 = getIntent().getStringExtra("pmDate25");
        t_stat25 = getIntent().getStringExtra("pmSubject25Stat");


        tname.setText(textname);
        tsubject1.setText(t_subject1);
        tdate1.setText(t_date1);
        tstat1.setText(t_stat1);

        tsubject2.setText(t_subject2);
        tdate2.setText(t_date2);
        tstat2.setText(t_stat2);

        tsubject3.setText(t_subject3);
        tdate3.setText(t_date3);
        tstat3.setText(t_stat3);

        tsubject4.setText(t_subject4);
        tdate4.setText(t_date4);
        tstat4.setText(t_stat4);

        tsubject5.setText(t_subject5);
        tdate5.setText(t_date5);
        tstat5.setText(t_stat5);

        tsubject6.setText(t_subject6);
        tdate6.setText(t_date6);
        tstat6.setText(t_stat6);

        tsubject7.setText(t_subject7);
        tdate7.setText(t_date7);
        tstat7.setText(t_stat7);

        tsubject8.setText(t_subject8);
        tdate8.setText(t_date8);
        tstat8.setText(t_stat8);

        tsubject9.setText(t_subject9);
        tdate9.setText(t_date9);
        tstat9.setText(t_stat9);

        tsubject10.setText(t_subject10);
        tdate10.setText(t_date10);
        tstat10.setText(t_stat10);

        tsubject11.setText(t_subject11);
        tdate11.setText(t_date11);
        tstat11.setText(t_stat11);

        tsubject12.setText(t_subject12);
        tdate12.setText(t_date12);
        tstat12.setText(t_stat12);

        tsubject13.setText(t_subject13);
        tdate13.setText(t_date13);
        tstat13.setText(t_stat13);

        tsubject14.setText(t_subject14);
        tdate14.setText(t_date14);
        tstat14.setText(t_stat14);

        tsubject15.setText(t_subject15);
        tdate15.setText(t_date15);
        tstat15.setText(t_stat15);

        tsubject16.setText(t_subject16);
        tdate16.setText(t_date16);
        tstat16.setText(t_stat16);

        tsubject17.setText(t_subject17);
        tdate17.setText(t_date17);
        tstat17.setText(t_stat17);

        tsubject18.setText(t_subject18);
        tdate18.setText(t_date18);
        tstat18.setText(t_stat18);

        tsubject19.setText(t_subject19);
        tdate19.setText(t_date19);
        tstat19.setText(t_stat19);

        tsubject20.setText(t_subject20);
        tdate20.setText(t_date20);
        tstat20.setText(t_stat20);

        tsubject21.setText(t_subject21);
        tdate21.setText(t_date21);
        tstat21.setText(t_stat21);

        tsubject22.setText(t_subject22);
        tdate22.setText(t_date22);
        tstat22.setText(t_stat22);

        tsubject23.setText(t_subject23);
        tdate23.setText(t_date23);
        tstat23.setText(t_stat23);

        tsubject24.setText(t_subject24);
        tdate24.setText(t_date24);
        tstat24.setText(t_stat24);

        tsubject25.setText(t_subject25);
        tdate25.setText(t_date25);
        tstat25.setText(t_stat25);

        back_attend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toReport=new Intent(attend_content.this,Report_admin.class);
                startActivity(toReport);
            }
        });
    }
}