package com.example.citelogbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.lang.reflect.Array;
import java.util.Calendar;

public class add_sched extends AppCompatActivity {
    FirebaseAuth fbaseAuth;
    FirebaseFirestore fbaseFstore;

    int t1Hour1, t1Minute1, t2Hour2, t2Minute2, t3Hour3, t3Minute3, t4Hour4, t4Minute4, t5Hour5, t5Minute5, t6Hour6, t6Minute6, t7Hour7, t7Minute7,
            t8Hour8, t8Minute8,t9Hour9,t9Minute9, t10Hour10, t10Minute10, t11Hour11, t11Minute11, t12Hour12, t12Minute12,t13Hour13, t13Minute13,t14Hour14, t14Minute14,
            t15Hour15, t15Minute15,t16Hour16, t16Minute16,t17Hour17, t17Minute17, t18Hour18, t18Minute18,t19Hour19, t19Minute19,t20Hour20, t20Minute20,
            t21Hour21, t21Minute21, t22Hour22, t22Minute22, t23Hour23, t23Minute23, t24Hour24, t24Minute24, t25Hour25, t25Minute25, t26Hour26, t26Minute26,
            t27Hour27, t27Minute27,t28Hour28, t28Minute28,t29Hour29, t29Minute29,t30Hour30, t30Minute30,t31Hour31, t31Minute31,t32Hour32, t32Minute32,
            t33Hour33, t33Minute33, t34Hour34, t34Minute34, t35Hour35, t35Minute35,t36Hour36, t36Minute36,t37Hour37, t37Minute37,t38Hour38, t38Minute38,
            t39Hour39, t39Minute39,t40Hour40, t40Minute40,t41Hour41, t41Minute41,t42Hour42, t42Minute42,t43Hour43, t43Minute43,t44Hour44, t44Minute44,
            t45Hour45, t45Minute45,t46Hour46, t46Minute46,t47Hour47, t47Minute47,t48Hour48, t48Minute48,t49Hour49, t49Minute49,t50Hour50, t50Minute50;

String timeS1, timeE1, timeS2, timeE2, timeS3, timeE3, timeS4, timeE4, timeS5, timeE5, timeS6, timeE6, timeS7, timeE7, timeS8, timeE8, timeS9, timeE9,
        timeS10, timeE10, timeS11, timeE11, timeS12, timeE12,timeS13, timeE13,timeS14, timeE14,timeS15, timeE15,timeS16, timeE16,timeS17, timeE17,
        timeS18, timeE18,timeS19, timeE19,timeS20, timeE20,timeS21, timeE21,timeS22, timeE22,timeS23, timeE23,timeS24, timeE24,timeS25, timeE25;

    //spinner selected item
    String selectedSection1, selectedSection2, selectedSection3, selectedSection4, selectedSection5, selectedSection6, selectedSection7, selectedSection8,
            selectedSection9,selectedSection10,selectedSection11,selectedSection12,selectedSection13,selectedSection14,selectedSection15,selectedSection16,
            selectedSection17,selectedSection18,selectedSection19,selectedSection20,selectedSection21,selectedSection22,selectedSection23,selectedSection24,
            selectedSection25;

    Button backadd_sched, save_sched;
    String uID;
    //Monday

    //am
    Spinner editSection1;
    EditText editSubject1;
    Button buttSTime1, buttETime1;
    TextView editSTime1, editETime1;
    String currSection1, currSubject1, currSTime1, currETime1;
    String newSection1, newSubject1, newSTime1, newETime1;

    Spinner editSection2;
    EditText editSubject2;
    Button buttSTime2, buttETime2;
    TextView editSTime2, editETime2;
    String currSection2, currSubject2, currSTime2, currETime2;
    String newSection2, newSubject2, newSTime2, newETime2;

    Spinner editSection3;
    EditText editSubject3;
    Button buttSTime3, buttETime3;
    TextView editSTime3, editETime3;
    String currSection3, currSubject3, currSTime3, currETime3;
    String newSection3, newSubject3, newSTime3, newETime3;
    //pm
    Spinner editSection4;
    EditText editSubject4;
    Button buttSTime4, buttETime4;
    TextView editSTime4, editETime4;
    String currSection4, currSubject4, currSTime4, currETime4;
    String newSection4, newSubject4, newSTime4, newETime4;

    Spinner editSection5;
    EditText editSubject5;
    Button buttSTime5, buttETime5;
    TextView editSTime5, editETime5;
    String currSection5, currSubject5, currSTime5, currETime5;
    String newSection5, newSubject5, newSTime5, newETime5;

    //tuesday

    //am
    Spinner editSection6;
    EditText editSubject6;
    Button buttSTime6, buttETime6;
    TextView editSTime6, editETime6;
    String currSection6, currSubject6, currSTime6, currETime6;
    String newSection6, newSubject6, newSTime6, newETime6;

    Spinner editSection7;
    EditText editSubject7;
    Button buttSTime7, buttETime7;
    TextView editSTime7, editETime7;
    String currSection7, currSubject7, currSTime7, currETime7;
    String newSection7, newSubject7, newSTime7, newETime7;

    Spinner editSection8;
    EditText editSubject8;
    Button buttSTime8, buttETime8;
    TextView editSTime8, editETime8;
    String currSection8, currSubject8, currSTime8, currETime8;
    String newSection8, newSubject8, newSTime8, newETime8;
    //pm
    Spinner editSection9;
    EditText editSubject9;
    Button buttSTime9, buttETime9;
    TextView editSTime9, editETime9;
    String currSection9, currSubject9, currSTime9, currETime9;
    String newSection9, newSubject9, newSTime9, newETime9;

    Spinner editSection10;
    EditText editSubject10;
    Button buttSTime10, buttETime10;
    TextView editSTime10, editETime10;
    String currSection10, currSubject10, currSTime10, currETime10;
    String newSection10, newSubject10, newSTime10, newETime10;

    //wednesday

    //am
    Spinner editSection11;
    EditText editSubject11;
    Button buttSTime11, buttETime11;
    TextView editSTime11, editETime11;
    String currSection11, currSubject11, currSTime11, currETime11;
    String newSection11, newSubject11, newSTime11, newETime11;

    Spinner editSection12;
    EditText editSubject12;
    Button buttSTime12, buttETime12;
    TextView editSTime12, editETime12;
    String currSection12, currSubject12, currSTime12, currETime12;
    String newSection12, newSubject12, newSTime12, newETime12;

    Spinner editSection13;
    EditText editSubject13;
    Button buttSTime13, buttETime13;
    TextView editSTime13, editETime13;
    String currSection13, currSubject13, currSTime13, currETime13;
    String newSection13, newSubject13, newSTime13, newETime13;

    //pm
    Spinner editSection14;
    EditText editSubject14;
    Button buttSTime14, buttETime14;
    TextView editSTime14, editETime14;
    String currSection14, currSubject14, currSTime14, currETime14;
    String newSection14, newSubject14, newSTime14, newETime14;

    Spinner editSection15;
    EditText editSubject15;
    Button buttSTime15, buttETime15;
    TextView editSTime15, editETime15;
    String currSection15, currSubject15, currSTime15, currETime15;
    String newSection15, newSubject15, newSTime15, newETime15;
    //thursday
    //am
    Spinner editSection16;
    EditText editSubject16;
    Button buttSTime16, buttETime16;
    TextView editSTime16, editETime16;
    String currSection16, currSubject16, currSTime16, currETime16;
    String newSection16, newSubject16, newSTime16, newETime16;

    Spinner editSection17;
    EditText editSubject17;
    Button buttSTime17, buttETime17;
    TextView editSTime17, editETime17;
    String currSection17, currSubject17, currSTime17, currETime17;
    String newSection17, newSubject17, newSTime17, newETime17;

    Spinner editSection18;
    EditText editSubject18;
    Button buttSTime18, buttETime18;
    TextView editSTime18, editETime18;
    String currSection18, currSubject18, currSTime18, currETime18;
    String newSection18, newSubject18, newSTime18, newETime18;

    //pm
    Spinner editSection19;
    EditText editSubject19;
    Button buttSTime19, buttETime19;
    TextView editSTime19, editETime19;
    String currSection19, currSubject19, currSTime19, currETime19;
    String newSection19, newSubject19, newSTime19, newETime19;

    Spinner editSection20;
    EditText editSubject20;
    Button buttSTime20, buttETime20;
    TextView editSTime20, editETime20;
    String currSection20, currSubject20, currSTime20, currETime20;
    String newSection20, newSubject20, newSTime20, newETime20;

    //friday
    //am
    Spinner editSection21;
    EditText editSubject21;
    Button buttSTime21, buttETime21;
    TextView editSTime21, editETime21;
    String currSection21, currSubject21, currSTime21, currETime21;
    String newSection21, newSubject21, newSTime21, newETime21;

    Spinner editSection22;
    EditText editSubject22;
    Button buttSTime22, buttETime22;
    TextView editSTime22, editETime22;
    String currSection22, currSubject22, currSTime22, currETime22;
    String newSection22, newSubject22, newSTime22, newETime22;

    Spinner editSection23;
    EditText editSubject23;
    Button buttSTime23, buttETime23;
    TextView editSTime23, editETime23;
    String currSection23, currSubject23, currSTime23, currETime23;
    String newSection23, newSubject23, newSTime23, newETime23;

    //pm
    Spinner editSection24;
    EditText editSubject24;
    Button buttSTime24, buttETime24;
    TextView editSTime24, editETime24;
    String currSection24, currSubject24, currSTime24, currETime24;
    String newSection24, newSubject24, newSTime24, newETime24;

    Spinner editSection25;
    EditText editSubject25;
    Button buttSTime25, buttETime25;
    TextView editSTime25, editETime25;
    String currSection25, currSubject25, currSTime25, currETime25;
    String newSection25, newSubject25, newSTime25, newETime25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_sched_layout);

        fbaseAuth = FirebaseAuth.getInstance();
        fbaseFstore = FirebaseFirestore.getInstance();
        backadd_sched = findViewById(R.id.backadd_sched);
        save_sched = findViewById(R.id.save_sched);

        //monday
        editSection1 = findViewById(R.id.editSection1);
        editSubject1 = findViewById(R.id.editSubject1);
        buttSTime1 = findViewById(R.id.buttSTime1);
        buttETime1 = findViewById(R.id.buttETime1);
        editSTime1 = findViewById(R.id.editSTime1);
        editETime1 = findViewById(R.id.editETime1);

        editSection2 = findViewById(R.id.editSection2);
        editSubject2 = findViewById(R.id.editSubject2);
        buttSTime2 = findViewById(R.id.buttSTime2);
        buttETime2 = findViewById(R.id.buttETime2);
        editSTime2 = findViewById(R.id.editSTime2);
        editETime2 = findViewById(R.id.editETime2);

        editSection3 = findViewById(R.id.editSection3);
        editSubject3 = findViewById(R.id.editSubject3);
        buttSTime3 = findViewById(R.id.buttSTime3);
        buttETime3 = findViewById(R.id.buttETime3);
        editSTime3 = findViewById(R.id.editSTime3);
        editETime3 = findViewById(R.id.editETime3);

        editSection4 = findViewById(R.id.editSection4);
        editSubject4 = findViewById(R.id.editSubject4);
        buttSTime4 = findViewById(R.id.buttSTime4);
        buttETime4 = findViewById(R.id.buttETime4);
        editSTime4 = findViewById(R.id.editSTime4);
        editETime4 = findViewById(R.id.editETime4);

        editSection5 = findViewById(R.id.editSection5);
        editSubject5 = findViewById(R.id.editSubject5);
        buttSTime5 = findViewById(R.id.buttSTime5);
        buttETime5 = findViewById(R.id.buttETime5);
        editSTime5 = findViewById(R.id.editSTime5);
        editETime5 = findViewById(R.id.editETime5);

        //tuesday
        editSection6 = findViewById(R.id.editSection6);
        editSubject6 = findViewById(R.id.editSubject6);
        buttSTime6 = findViewById(R.id.buttSTime6);
        buttETime6 = findViewById(R.id.buttETime6);
        editSTime6 = findViewById(R.id.editSTime6);
        editETime6 = findViewById(R.id.editETime6);

        editSection7 = findViewById(R.id.editSection7);
        editSubject7 = findViewById(R.id.editSubject7);
        buttSTime7 = findViewById(R.id.buttSTime7);
        buttETime7 = findViewById(R.id.buttETime7);
        editSTime7 = findViewById(R.id.editSTime7);
        editETime7 = findViewById(R.id.editETime7);

        editSection8 = findViewById(R.id.editSection8);
        editSubject8 = findViewById(R.id.editSubject8);
        buttSTime8 = findViewById(R.id.buttSTime8);
        buttETime8 = findViewById(R.id.buttETime8);
        editSTime8 = findViewById(R.id.editSTime8);
        editETime8 = findViewById(R.id.editETime8);

        editSection9 = findViewById(R.id.editSection9);
        editSubject9 = findViewById(R.id.editSubject9);
        buttSTime9 = findViewById(R.id.buttSTime9);
        buttETime9 = findViewById(R.id.buttETime9);
        editSTime9 = findViewById(R.id.editSTime9);
        editETime9 = findViewById(R.id.editETime9);

        editSection10 = findViewById(R.id.editSection10);
        editSubject10 = findViewById(R.id.editSubject10);
        buttSTime10 = findViewById(R.id.buttSTime10);
        buttETime10 = findViewById(R.id.buttETime10);
        editSTime10 = findViewById(R.id.editSTime10);
        editETime10 = findViewById(R.id.editETime10);

        //wednesday
        editSection11 = findViewById(R.id.editSection11);
        editSubject11 = findViewById(R.id.editSubject11);
        buttSTime11 = findViewById(R.id.buttSTime11);
        buttETime11 = findViewById(R.id.buttETime11);
        editSTime11 = findViewById(R.id.editSTime11);
        editETime11 = findViewById(R.id.editETime11);

        editSection12 = findViewById(R.id.editSection12);
        editSubject12 = findViewById(R.id.editSubject12);
        buttSTime12 = findViewById(R.id.buttSTime12);
        buttETime12 = findViewById(R.id.buttETime12);
        editSTime12 = findViewById(R.id.editSTime12);
        editETime12 = findViewById(R.id.editETime12);

        editSection13 = findViewById(R.id.editSection13);
        editSubject13 = findViewById(R.id.editSubject13);
        buttSTime13 = findViewById(R.id.buttSTime13);
        buttETime13 = findViewById(R.id.buttETime13);
        editSTime13 = findViewById(R.id.editSTime13);
        editETime13 = findViewById(R.id.editETime13);

        editSection14 = findViewById(R.id.editSection14);
        editSubject14 = findViewById(R.id.editSubject14);
        buttSTime14 = findViewById(R.id.buttSTime14);
        buttETime14 = findViewById(R.id.buttETime14);
        editSTime14 = findViewById(R.id.editSTime14);
        editETime14 = findViewById(R.id.editETime14);

        editSection15 = findViewById(R.id.editSection15);
        editSubject15 = findViewById(R.id.editSubject15);
        buttSTime15 = findViewById(R.id.buttSTime15);
        buttETime15 = findViewById(R.id.buttETime15);
        editSTime15 = findViewById(R.id.editSTime15);
        editETime15 = findViewById(R.id.editETime15);

        //thursday
        editSection16 = findViewById(R.id.editSection16);
        editSubject16 = findViewById(R.id.editSubject16);
        buttSTime16 = findViewById(R.id.buttSTime16);
        buttETime16 = findViewById(R.id.buttETime16);
        editSTime16 = findViewById(R.id.editSTime16);
        editETime16 = findViewById(R.id.editETime16);

        editSection17 = findViewById(R.id.editSection17);
        editSubject17 = findViewById(R.id.editSubject17);
        buttSTime17 = findViewById(R.id.buttSTime17);
        buttETime17 = findViewById(R.id.buttETime17);
        editSTime17 = findViewById(R.id.editSTime17);
        editETime17 = findViewById(R.id.editETime17);

        editSection18 = findViewById(R.id.editSection18);
        editSubject18 = findViewById(R.id.editSubject18);
        buttSTime18 = findViewById(R.id.buttSTime18);
        buttETime18 = findViewById(R.id.buttETime18);
        editSTime18 = findViewById(R.id.editSTime18);
        editETime18 = findViewById(R.id.editETime18);

        editSection19 = findViewById(R.id.editSection19);
        editSubject19 = findViewById(R.id.editSubject19);
        buttSTime19 = findViewById(R.id.buttSTime19);
        buttETime19 = findViewById(R.id.buttETime19);
        editSTime19 = findViewById(R.id.editSTime19);
        editETime19 = findViewById(R.id.editETime19);

        editSection20 = findViewById(R.id.editSection20);
        editSubject20 = findViewById(R.id.editSubject20);
        buttSTime20 = findViewById(R.id.buttSTime20);
        buttETime20 = findViewById(R.id.buttETime20);
        editSTime20 = findViewById(R.id.editSTime20);
        editETime20 = findViewById(R.id.editETime20);

        //friday
        editSection21 = findViewById(R.id.editSection21);
        editSubject21 = findViewById(R.id.editSubject21);
        buttSTime21 = findViewById(R.id.buttSTime21);
        buttETime21 = findViewById(R.id.buttETime21);
        editSTime21 = findViewById(R.id.editSTime21);
        editETime21 = findViewById(R.id.editETime21);

        editSection22 = findViewById(R.id.editSection22);
        editSubject22 = findViewById(R.id.editSubject22);
        buttSTime22 = findViewById(R.id.buttSTime22);
        buttETime22 = findViewById(R.id.buttETime22);
        editSTime22 = findViewById(R.id.editSTime22);
        editETime22 = findViewById(R.id.editETime22);

        editSection23 = findViewById(R.id.editSection23);
        editSubject23 = findViewById(R.id.editSubject23);
        buttSTime23 = findViewById(R.id.buttSTime23);
        buttETime23 = findViewById(R.id.buttETime23);
        editSTime23 = findViewById(R.id.editSTime23);
        editETime23 = findViewById(R.id.editETime23);

        editSection24 = findViewById(R.id.editSection24);
        editSubject24 = findViewById(R.id.editSubject24);
        buttSTime24 = findViewById(R.id.buttSTime24);
        buttETime24 = findViewById(R.id.buttETime24);
        editSTime24 = findViewById(R.id.editSTime24);
        editETime24 = findViewById(R.id.editETime24);

        editSection25 = findViewById(R.id.editSection25);
        editSubject25 = findViewById(R.id.editSubject25);
        buttSTime25 = findViewById(R.id.buttSTime25);
        buttETime25 = findViewById(R.id.buttETime25);
        editSTime25 = findViewById(R.id.editSTime25);
        editETime25 = findViewById(R.id.editETime25);

        currSubject1 = getIntent().getStringExtra("amSubject1");
        currSection1 = getIntent().getStringExtra("amSection1");
        currSTime1 = getIntent().getStringExtra("amSTime1");
        currETime1 = getIntent().getStringExtra("amETime1");

        currSubject2 = getIntent().getStringExtra("amSubject2");
        currSection2 = getIntent().getStringExtra("amSection2");
        currSTime2 = getIntent().getStringExtra("amSTime2");
        currETime2 = getIntent().getStringExtra("amETime2");

        currSubject3 = getIntent().getStringExtra("amSubject3");
        currSection3 = getIntent().getStringExtra("amSection3");
        currSTime3 = getIntent().getStringExtra("amSTime3");
        currETime3 = getIntent().getStringExtra("amETime3");

        currSubject4 = getIntent().getStringExtra("pmSubject4");
        currSection4 = getIntent().getStringExtra("pmSection4");
        currSTime4 = getIntent().getStringExtra("pmSTime4");
        currETime4 = getIntent().getStringExtra("pmETime4");

        currSubject5 = getIntent().getStringExtra("pmSubject5");
        currSection5 = getIntent().getStringExtra("pmSection5");
        currSTime5 = getIntent().getStringExtra("pmSTime5");
        currETime5 = getIntent().getStringExtra("pmETime5");

        currSubject6 = getIntent().getStringExtra("amSubject6");
        currSection6 = getIntent().getStringExtra("amSection6");
        currSTime6 = getIntent().getStringExtra("amSTime6");
        currETime6 = getIntent().getStringExtra("amETime6");

        currSubject7 = getIntent().getStringExtra("amSubject7");
        currSection7 = getIntent().getStringExtra("amSection7");
        currSTime7 = getIntent().getStringExtra("amSTime7");
        currETime7 = getIntent().getStringExtra("amETime7");

        currSubject8 = getIntent().getStringExtra("amSubject8");
        currSection8 = getIntent().getStringExtra("amSection8");
        currSTime8 = getIntent().getStringExtra("amSTime8");
        currETime8 = getIntent().getStringExtra("amETime8");

        currSubject9 = getIntent().getStringExtra("pmSubject9");
        currSection9 = getIntent().getStringExtra("pmSection9");
        currSTime9 = getIntent().getStringExtra("pmSTime9");
        currETime9 = getIntent().getStringExtra("pmETime9");

        currSubject10 = getIntent().getStringExtra("pmSubject10");
        currSection10 = getIntent().getStringExtra("pmSection10");
        currSTime10 = getIntent().getStringExtra("pmSTime10");
        currETime10 = getIntent().getStringExtra("pmETime10");

        currSubject11 = getIntent().getStringExtra("amSubject11");
        currSection11 = getIntent().getStringExtra("amSection11");
        currSTime11 = getIntent().getStringExtra("amSTime11");
        currETime11 = getIntent().getStringExtra("amETime11");

        currSubject12 = getIntent().getStringExtra("amSubject12");
        currSection12 = getIntent().getStringExtra("amSection12");
        currSTime12 = getIntent().getStringExtra("amSTime12");
        currETime12 = getIntent().getStringExtra("amETime12");

        currSubject13 = getIntent().getStringExtra("amSubject13");
        currSection13 = getIntent().getStringExtra("amSection13");
        currSTime13 = getIntent().getStringExtra("amSTime13");
        currETime13 = getIntent().getStringExtra("amETime13");

        currSubject14 = getIntent().getStringExtra("pmSubject14");
        currSection14 = getIntent().getStringExtra("pmSection14");
        currSTime14 = getIntent().getStringExtra("pmSTime14");
        currETime14 = getIntent().getStringExtra("pmETime14");

        currSubject15 = getIntent().getStringExtra("pmSubject15");
        currSection15 = getIntent().getStringExtra("pmSection15");
        currSTime15 = getIntent().getStringExtra("pmSTime15");
        currETime15 = getIntent().getStringExtra("pmETime15");

        currSubject16 = getIntent().getStringExtra("amSubject16");
        currSection16 = getIntent().getStringExtra("amSection16");
        currSTime16 = getIntent().getStringExtra("amSTime16");
        currETime16 = getIntent().getStringExtra("amETime16");

        currSubject17 = getIntent().getStringExtra("amSubject17");
        currSection17 = getIntent().getStringExtra("amSection17");
        currSTime17 = getIntent().getStringExtra("amSTime17");
        currETime17 = getIntent().getStringExtra("amETime17");

        currSubject18 = getIntent().getStringExtra("amSubject18");
        currSection18 = getIntent().getStringExtra("amSection18");
        currSTime18 = getIntent().getStringExtra("amSTime18");
        currETime18 = getIntent().getStringExtra("amETime18");

        currSubject19 = getIntent().getStringExtra("pmSubject19");
        currSection19 = getIntent().getStringExtra("pmSection19");
        currSTime19 = getIntent().getStringExtra("pmSTime19");
        currETime19 = getIntent().getStringExtra("pmETime19");

        currSubject20 = getIntent().getStringExtra("pmSubject20");
        currSection20 = getIntent().getStringExtra("pmSection20");
        currSTime20 = getIntent().getStringExtra("pmSTime20");
        currETime20 = getIntent().getStringExtra("pmETime20");

        currSubject21 = getIntent().getStringExtra("amSubject21");
        currSection21 = getIntent().getStringExtra("amSection21");
        currSTime21 = getIntent().getStringExtra("amSTime21");
        currETime21 = getIntent().getStringExtra("amETime21");

        currSubject22 = getIntent().getStringExtra("amSubject22");
        currSection22 = getIntent().getStringExtra("amSection22");
        currSTime22 = getIntent().getStringExtra("amSTime22");
        currETime22 = getIntent().getStringExtra("amETime22");

        currSubject23 = getIntent().getStringExtra("amSubject23");
        currSection23 = getIntent().getStringExtra("amSection23");
        currSTime23 = getIntent().getStringExtra("amSTime23");
        currETime23 = getIntent().getStringExtra("amETime23");

        currSubject24 = getIntent().getStringExtra("pmSubject24");
        currSection24 = getIntent().getStringExtra("pmSection24");
        currSTime24 = getIntent().getStringExtra("pmSTime24");
        currETime24 = getIntent().getStringExtra("pmETime24");

        currSubject25 = getIntent().getStringExtra("pmSubject25");
        currSection25 = getIntent().getStringExtra("pmSection25");
        currSTime25 = getIntent().getStringExtra("pmSTime25");
        currETime25 = getIntent().getStringExtra("pmETime25");

        //set text to current value which is null
        editSubject1.setText(currSubject1);
        editSTime1.setText(currSTime1);
        editETime1.setText(currETime1);

        editSubject2.setText(currSubject2);
        editSTime2.setText(currSTime2);
        editETime2.setText(currETime2);

        editSubject3.setText(currSubject3);
        editSTime3.setText(currSTime3);
        editETime3.setText(currETime3);

        editSubject4.setText(currSubject4);
        editSTime4.setText(currSTime4);
        editETime4.setText(currETime4);

        editSubject5.setText(currSubject5);
        editSTime5.setText(currSTime5);
        editETime5.setText(currETime5);

        editSubject6.setText(currSubject6);
        editSTime6.setText(currSTime6);
        editETime6.setText(currETime6);

        editSubject7.setText(currSubject7);
        editSTime7.setText(currSTime7);
        editETime7.setText(currETime7);

        editSubject8.setText(currSubject8);
        editSTime8.setText(currSTime8);
        editETime8.setText(currETime8);

        editSubject9.setText(currSubject9);
        editSTime9.setText(currSTime9);
        editETime9.setText(currETime9);

        editSubject10.setText(currSubject10);
        editSTime10.setText(currSTime10);
        editETime10.setText(currETime10);

        editSubject11.setText(currSubject11);
        editSTime11.setText(currSTime11);
        editETime11.setText(currETime11);

        editSubject12.setText(currSubject12);
        editSTime12.setText(currSTime12);
        editETime12.setText(currETime12);

        editSubject13.setText(currSubject13);
        editSTime13.setText(currSTime13);
        editETime13.setText(currETime13);

        editSubject14.setText(currSubject14);
        editSTime14.setText(currSTime14);
        editETime14.setText(currETime14);

        editSubject15.setText(currSubject15);
        editSTime15.setText(currSTime15);
        editETime15.setText(currETime15);

        editSubject16.setText(currSubject16);
        editSTime16.setText(currSTime16);
        editETime16.setText(currETime16);

        editSubject17.setText(currSubject17);
        editSTime17.setText(currSTime17);
        editETime17.setText(currETime17);

        editSubject18.setText(currSubject18);
        editSTime18.setText(currSTime18);
        editETime18.setText(currETime18);

        editSubject19.setText(currSubject19);
        editSTime19.setText(currSTime19);
        editETime19.setText(currETime19);

        editSubject20.setText(currSubject20);
        editSTime20.setText(currSTime20);
        editETime20.setText(currETime20);

        editSubject21.setText(currSubject21);
        editSTime21.setText(currSTime21);
        editETime21.setText(currETime21);

        editSubject22.setText(currSubject22);
        editSTime22.setText(currSTime22);
        editETime22.setText(currETime22);

        editSubject23.setText(currSubject23);
        editSTime23.setText(currSTime23);
        editETime23.setText(currETime23);

        editSubject24.setText(currSubject24);
        editSTime24.setText(currSTime24);
        editETime24.setText(currETime24);

        editSubject25.setText(currSubject25);
        editSTime25.setText(currSTime25);
        editETime25.setText(currETime25);

        ArrayAdapter<CharSequence> arrayAdapter1 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection1.setAdapter((arrayAdapter1));
        editSection1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection1 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter2 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection2.setAdapter((arrayAdapter2));
        editSection2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 selectedSection2 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter3 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection3.setAdapter((arrayAdapter3));
        editSection3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection3 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter4 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection4.setAdapter((arrayAdapter4));
        editSection4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection4 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter5 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection5.setAdapter((arrayAdapter5));
        editSection5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection5 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter6 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection6.setAdapter((arrayAdapter6));
        editSection6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection6 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter7 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection7.setAdapter((arrayAdapter7));
        editSection7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection7 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter8 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection8.setAdapter((arrayAdapter8));
        editSection8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection8 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter9 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection9.setAdapter((arrayAdapter9));
        editSection9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection9 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter10 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection10.setAdapter((arrayAdapter10));
        editSection10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection10 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter11 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection11.setAdapter((arrayAdapter11));
        editSection11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection11 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter12 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection12.setAdapter((arrayAdapter12));
        editSection12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection12 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter13 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection13.setAdapter((arrayAdapter13));
        editSection13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection13 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter14 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection14.setAdapter((arrayAdapter14));
        editSection14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection14 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter15 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection15.setAdapter((arrayAdapter15));
        editSection15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection15 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter16 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection16.setAdapter((arrayAdapter16));
        editSection16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection16 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter17 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection17.setAdapter((arrayAdapter17));
        editSection17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection17 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter18 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection18.setAdapter((arrayAdapter18));
        editSection18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection18 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter19 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection19.setAdapter((arrayAdapter19));
        editSection19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection19 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter20 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection20.setAdapter((arrayAdapter20));
        editSection20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection20 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter21 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter21.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection21.setAdapter((arrayAdapter21));
        editSection21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection21 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter22 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection22.setAdapter((arrayAdapter22));
        editSection22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection22 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter23 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter23.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection23.setAdapter((arrayAdapter23));
        editSection23.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection23 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter24 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter24.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection24.setAdapter((arrayAdapter24));
        editSection24.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection24 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> arrayAdapter25 = ArrayAdapter.createFromResource(this,R.array.Block, android.R.layout.simple_spinner_item);
        arrayAdapter25.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editSection25.setAdapter((arrayAdapter25));
        editSection25.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSection25 = (String) parent.getItemAtPosition(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        buttSTime1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog1 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                         t1Hour1 = hourOfDay1;
                         t1Minute1 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t1Hour1, t1Minute1);
                        //set selected time on text view


                        timeS1 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime1.setText(timeS1);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog1.updateTime(t1Hour1, t1Minute1);
                //show dialog
                timePickerDialog1.show();
            }
        });

        buttETime1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog2 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t2Hour2 = hourOfDay1;
                        t2Minute2 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t2Hour2, t2Minute2);
                        //set selected time on text view


                        timeE1 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime1.setText(timeE1);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog2.updateTime(t2Hour2, t2Minute2);
                //show dialog
                timePickerDialog2.show();
            }
        });

        buttSTime2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog3 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t3Hour3 = hourOfDay1;
                        t3Minute3 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t3Hour3, t3Minute3);
                        //set selected time on text view


                        timeS2 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime2.setText(timeS2);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog3.updateTime(t3Hour3, t3Minute3);
                //show dialog
                timePickerDialog3.show();
            }
        });

        buttETime2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog4 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t4Hour4 = hourOfDay1;
                        t4Minute4 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t4Hour4, t4Minute4);
                        //set selected time on text view


                        timeE2 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime2.setText(timeE2);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog4.updateTime(t4Hour4, t4Minute4);
                //show dialog
                timePickerDialog4.show();
            }
        });

         buttSTime3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //initialize time picker dialog

                 TimePickerDialog timePickerDialog5 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                     @Override
                     public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                         //initialize hour and minute

                         t5Hour5 = hourOfDay1;
                         t5Minute5 = minute1;

                         Calendar calendar = Calendar.getInstance();

                         //set hour and minute
                         calendar.set(0, 0, 0, t5Hour5, t5Minute5);
                         //set selected time on text view


                         timeS3 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                         editSTime3.setText(timeS3);
                     }
                 }, 12, 0, false
                 );
                 // displayed previous selected time

                 timePickerDialog5.updateTime(t5Hour5, t5Minute5);
                 //show dialog
                 timePickerDialog5.show();
             }
         });

         buttETime3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //initialize time picker dialog

                 TimePickerDialog timePickerDialog6 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                     @Override
                     public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                         //initialize hour and minute

                         t6Hour6 = hourOfDay1;
                         t6Minute6 = minute1;

                         Calendar calendar = Calendar.getInstance();

                         //set hour and minute
                         calendar.set(0, 0, 0, t6Hour6, t6Minute6);
                         //set selected time on text view


                         timeE3 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                         editETime3.setText(timeE3);
                     }
                 }, 12, 0, false
                 );
                 // displayed previous selected time

                 timePickerDialog6.updateTime(t6Hour6, t6Minute6);
                 //show dialog
                 timePickerDialog6.show();
             }
         });

         buttSTime4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //initialize time picker dialog

                 TimePickerDialog timePickerDialog7 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                     @Override
                     public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                         //initialize hour and minute

                         t7Hour7 = hourOfDay1;
                         t7Minute7 = minute1;

                         Calendar calendar = Calendar.getInstance();

                         //set hour and minute
                         calendar.set(0, 0, 0, t7Hour7, t7Minute7);
                         //set selected time on text view


                         timeS4 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                         editSTime4.setText(timeS4);
                     }
                 }, 12, 0, false
                 );
                 // displayed previous selected time

                 timePickerDialog7.updateTime(t7Hour7, t7Minute7);
                 //show dialog
                 timePickerDialog7.show();
             }
         });

        buttETime4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog8 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t8Hour8 = hourOfDay1;
                        t8Minute8 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t8Hour8, t8Minute8);
                        //set selected time on text view


                        timeE4 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime4.setText(timeE4);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog8.updateTime(t8Hour8, t8Minute8);
                //show dialog
                timePickerDialog8.show();
            }
        });

        buttSTime5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog9 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t9Hour9 = hourOfDay1;
                        t9Minute9 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t9Hour9, t9Minute9);
                        //set selected time on text view


                        timeS5 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime5.setText(timeS5);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog9.updateTime(t9Hour9, t9Minute9);
                //show dialog
                timePickerDialog9.show();
            }
        });

        buttETime5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog10 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t10Hour10 = hourOfDay1;
                        t10Minute10 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t10Hour10, t10Minute10);
                        //set selected time on text view


                        timeE5 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime5.setText(timeE5);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog10.updateTime(t10Hour10, t10Minute10);
                //show dialog
                timePickerDialog10.show();
            }
        });

        buttSTime6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog11 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t11Hour11 = hourOfDay1;
                        t11Minute11 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t11Hour11, t11Minute11);
                        //set selected time on text view


                        timeS6 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime6.setText(timeS6);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog11.updateTime(t11Hour11, t11Minute11);
                //show dialog
                timePickerDialog11.show();
            }
        });

        buttETime6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog12 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t12Hour12 = hourOfDay1;
                        t12Minute12 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t12Hour12, t12Minute12);
                        //set selected time on text view


                        timeE6 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime6.setText(timeE6);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog12.updateTime(t12Hour12, t12Minute12);
                //show dialog
                timePickerDialog12.show();
            }
        });

        buttSTime7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog13 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t13Hour13 = hourOfDay1;
                        t13Minute13 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t13Hour13, t13Minute13);
                        //set selected time on text view


                        timeS7 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime7.setText(timeS7);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog13.updateTime(t13Hour13, t13Minute13);
                //show dialog
                timePickerDialog13.show();
            }
        });
        buttETime7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog14 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t14Hour14 = hourOfDay1;
                        t14Minute14 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t14Hour14, t14Minute14);
                        //set selected time on text view


                        timeE7 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime7.setText(timeE7);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog14.updateTime(t14Hour14, t14Minute14);
                //show dialog
                timePickerDialog14.show();
            }
        });

        buttSTime8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog15 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t15Hour15 = hourOfDay1;
                        t15Minute15 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t15Hour15, t15Minute15);
                        //set selected time on text view


                        timeS8 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime8.setText(timeS8);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog15.updateTime(t15Hour15, t15Minute15);
                //show dialog
                timePickerDialog15.show();
            }
        });


        buttETime8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog16 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t16Hour16 = hourOfDay1;
                        t16Minute16 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t16Hour16, t16Minute16);
                        //set selected time on text view


                        timeE8 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime8.setText(timeE8);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog16.updateTime(t16Hour16, t16Minute16);
                //show dialog
                timePickerDialog16.show();
            }
        });

        buttSTime9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog17 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t17Hour17 = hourOfDay1;
                        t17Minute17 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t17Hour17, t17Minute17);
                        //set selected time on text view


                        timeS9 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime9.setText(timeS9);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog17.updateTime(t17Hour17, t17Minute17);
                //show dialog
                timePickerDialog17.show();
            }
        });

        buttETime9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog18 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t18Hour18 = hourOfDay1;
                        t18Minute18 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t18Hour18, t18Minute18);
                        //set selected time on text view


                        timeE9 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime9.setText(timeE9);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog18.updateTime(t18Hour18, t18Minute18);
                //show dialog
                timePickerDialog18.show();
            }
        });

        buttSTime10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog19 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t19Hour19 = hourOfDay1;
                        t19Minute19 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t19Hour19, t19Minute19);
                        //set selected time on text view


                        timeS10 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime10.setText(timeS10);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog19.updateTime(t19Hour19, t19Minute19);
                //show dialog
                timePickerDialog19.show();
            }
        });

        buttETime10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog20 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t20Hour20 = hourOfDay1;
                        t20Minute20 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t20Hour20, t20Minute20);
                        //set selected time on text view


                        timeE10 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime10.setText(timeE10);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog20.updateTime(t20Hour20, t20Minute20);
                //show dialog
                timePickerDialog20.show();
            }
        });

        buttSTime11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog21 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t21Hour21 = hourOfDay1;
                        t21Minute21 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t21Hour21, t21Minute21);
                        //set selected time on text view


                        timeS11 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime11.setText(timeS11);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog21.updateTime(t21Hour21, t21Minute21);
                //show dialog
                timePickerDialog21.show();
            }
        });

        buttETime11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog22 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t22Hour22 = hourOfDay1;
                        t22Minute22 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t22Hour22, t22Minute22);
                        //set selected time on text view


                        timeE11 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime11.setText(timeE11);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog22.updateTime(t22Hour22, t22Minute22);
                //show dialog
                timePickerDialog22.show();
            }
        });

        buttSTime12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog23 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t23Hour23 = hourOfDay1;
                        t23Minute23 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t23Hour23, t23Minute23);
                        //set selected time on text view


                        timeS12 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime12.setText(timeS12);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog23.updateTime(t23Hour23, t23Minute23);
                //show dialog
                timePickerDialog23.show();
            }
        });

        buttETime12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog24 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t24Hour24 = hourOfDay1;
                        t24Minute24 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t24Hour24, t24Minute24);
                        //set selected time on text view


                        timeE12 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime12.setText(timeE12);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog24.updateTime(t24Hour24, t24Minute24);
                //show dialog
                timePickerDialog24.show();
            }
        });

        buttSTime13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog25 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t25Hour25 = hourOfDay1;
                        t25Minute25 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t25Hour25, t25Minute25);
                        //set selected time on text view


                        timeS13 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime13.setText(timeS13);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog25.updateTime(t25Hour25, t25Minute25);
                //show dialog
                timePickerDialog25.show();
            }
        });

        buttETime13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog26 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t26Hour26 = hourOfDay1;
                        t26Minute26 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t26Hour26, t26Minute26);
                        //set selected time on text view


                        timeE13 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime13.setText(timeE13);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog26.updateTime(t26Hour26, t26Minute26);
                //show dialog
                timePickerDialog26.show();
            }
        });

        buttSTime14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog27 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t27Hour27 = hourOfDay1;
                        t27Minute27 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t27Hour27, t27Minute27);
                        //set selected time on text view


                        timeS14 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime14.setText(timeS14);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog27.updateTime(t27Hour27, t27Minute27);
                //show dialog
                timePickerDialog27.show();
            }
        });

        buttETime14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog28 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t28Hour28 = hourOfDay1;
                        t28Minute28 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t28Hour28, t28Minute28);
                        //set selected time on text view


                        timeE14 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime14.setText(timeE14);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog28.updateTime(t28Hour28, t28Minute28);
                //show dialog
                timePickerDialog28.show();
            }
        });

        buttSTime15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog29 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t29Hour29 = hourOfDay1;
                        t29Minute29 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t29Hour29, t29Minute29);
                        //set selected time on text view


                        timeS15 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime15.setText(timeS15);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog29.updateTime(t29Hour29, t29Minute29);
                //show dialog
                timePickerDialog29.show();
            }
        });

        buttETime15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog30 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t30Hour30 = hourOfDay1;
                        t30Minute30 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t30Hour30, t30Minute30);
                        //set selected time on text view


                        timeE15 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime15.setText(timeE15);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog30.updateTime(t30Hour30, t30Minute30);
                //show dialog
                timePickerDialog30.show();
            }
        });

        buttSTime16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog31 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t31Hour31 = hourOfDay1;
                        t31Minute31 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t31Hour31, t31Minute31);
                        //set selected time on text view


                        timeS16 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime16.setText(timeS16);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog31.updateTime(t31Hour31, t31Minute31);
                //show dialog
                timePickerDialog31.show();
            }
        });

        buttETime16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog32 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t32Hour32 = hourOfDay1;
                        t32Minute32 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t32Hour32, t32Minute32);
                        //set selected time on text view


                        timeE16 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime16.setText(timeE16);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog32.updateTime(t32Hour32, t32Minute32);
                //show dialog
                timePickerDialog32.show();
            }
        });

        buttSTime17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog33 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t33Hour33 = hourOfDay1;
                        t33Minute33 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t33Hour33, t33Minute33);
                        //set selected time on text view


                        timeS17 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime17.setText(timeS17);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog33.updateTime(t33Hour33, t33Minute33);
                //show dialog
                timePickerDialog33.show();
            }
        });

        buttETime17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog34 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t34Hour34 = hourOfDay1;
                        t34Minute34 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t34Hour34, t34Minute34);
                        //set selected time on text view


                        timeE17 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime17.setText(timeE17);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog34.updateTime(t34Hour34, t34Minute34);
                //show dialog
                timePickerDialog34.show();
            }
        });

        buttSTime18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog35 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t35Hour35 = hourOfDay1;
                        t35Minute35 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t35Hour35, t35Minute35);
                        //set selected time on text view


                        timeS18 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime18.setText(timeS18);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog35.updateTime(t35Hour35, t35Minute35);
                //show dialog
                timePickerDialog35.show();
            }
        });

        buttETime18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog36 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t36Hour36 = hourOfDay1;
                        t36Minute36 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t36Hour36, t36Minute36);
                        //set selected time on text view


                        timeE18 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime18.setText(timeE18);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog36.updateTime(t36Hour36, t36Minute36);
                //show dialog
                timePickerDialog36.show();
            }
        });

        buttSTime19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog37 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t37Hour37 = hourOfDay1;
                        t37Minute37 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t37Hour37, t37Minute37);
                        //set selected time on text view


                        timeS19 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime19.setText(timeS19);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog37.updateTime(t37Hour37, t37Minute37);
                //show dialog
                timePickerDialog37.show();
            }
        });

        buttETime19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog38 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t38Hour38 = hourOfDay1;
                        t38Minute38 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t38Hour38, t38Minute38);
                        //set selected time on text view


                        timeE19 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime19.setText(timeE19);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog38.updateTime(t38Hour38, t38Minute38);
                //show dialog
                timePickerDialog38.show();
            }
        });

        buttSTime20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog39 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t39Hour39 = hourOfDay1;
                        t39Minute39 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t39Hour39, t39Minute39);
                        //set selected time on text view


                        timeS20 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime20.setText(timeS20);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog39.updateTime(t39Hour39, t39Minute39);
                //show dialog
                timePickerDialog39.show();
            }
        });

        buttETime20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog40 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t40Hour40 = hourOfDay1;
                        t40Minute40 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t40Hour40, t40Minute40);
                        //set selected time on text view


                        timeE20 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime20.setText(timeE20);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog40.updateTime(t40Hour40, t40Minute40);
                //show dialog
                timePickerDialog40.show();
            }
        });

        buttSTime21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog41 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t41Hour41 = hourOfDay1;
                        t41Minute41 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t41Hour41, t41Minute41);
                        //set selected time on text view


                        timeS21 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime21.setText(timeS21);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog41.updateTime(t41Hour41, t41Minute41);
                //show dialog
                timePickerDialog41.show();
            }
        });

        buttETime21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog42 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t42Hour42 = hourOfDay1;
                        t42Minute42 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t42Hour42, t42Minute42);
                        //set selected time on text view


                        timeE21 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime21.setText(timeE21);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog42.updateTime(t42Hour42, t42Minute42);
                //show dialog
                timePickerDialog42.show();
            }
        });

        buttSTime22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog43 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t43Hour43 = hourOfDay1;
                        t43Minute43 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t43Hour43, t43Minute43);
                        //set selected time on text view


                        timeS22 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime22.setText(timeS22);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog43.updateTime(t43Hour43, t43Minute43);
                //show dialog
                timePickerDialog43.show();
            }
        });

        buttETime22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog44 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t44Hour44 = hourOfDay1;
                        t44Minute44 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t44Hour44, t44Minute44);
                        //set selected time on text view


                        timeE22 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime22.setText(timeE22);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog44.updateTime(t44Hour44, t44Minute44);
                //show dialog
                timePickerDialog44.show();
            }
        });

        buttSTime23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog45 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t45Hour45 = hourOfDay1;
                        t45Minute45 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t45Hour45, t45Minute45);
                        //set selected time on text view


                        timeS23 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime23.setText(timeS23);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog45.updateTime(t45Hour45, t45Minute45);
                //show dialog
                timePickerDialog45.show();
            }
        });

        buttETime23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog46 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t46Hour46 = hourOfDay1;
                        t46Minute46 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t46Hour46, t46Minute46);
                        //set selected time on text view


                        timeE23 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime23.setText(timeE23);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog46.updateTime(t46Hour46, t46Minute46);
                //show dialog
                timePickerDialog46.show();
            }
        });

        buttSTime24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog47 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t47Hour47 = hourOfDay1;
                        t47Minute47 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t47Hour47, t47Minute47);
                        //set selected time on text view


                        timeS24 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime24.setText(timeS24);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog47.updateTime(t47Hour47, t47Minute47);
                //show dialog
                timePickerDialog47.show();
            }
        });

        buttETime24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog48 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t48Hour48 = hourOfDay1;
                        t48Minute48 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t48Hour48, t48Minute48);
                        //set selected time on text view


                        timeE24 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime24.setText(timeE24);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog48.updateTime(t48Hour48, t48Minute48);
                //show dialog
                timePickerDialog48.show();
            }
        });

        buttSTime25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog49 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t49Hour49 = hourOfDay1;
                        t49Minute49 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t49Hour49, t49Minute49);
                        //set selected time on text view


                        timeS25 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editSTime25.setText(timeS25);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog49.updateTime(t49Hour49, t49Minute49);
                //show dialog
                timePickerDialog49.show();
            }
        });

        buttETime25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize time picker dialog

                TimePickerDialog timePickerDialog50 = new TimePickerDialog(add_sched.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay1, int minute1) {
                        //initialize hour and minute

                        t50Hour50 = hourOfDay1;
                        t50Minute50 = minute1;

                        Calendar calendar = Calendar.getInstance();

                        //set hour and minute
                        calendar.set(0, 0, 0, t50Hour50, t50Minute50);
                        //set selected time on text view


                        timeE25 = String.valueOf((DateFormat.format("hh:mm aa", calendar)));
                        editETime25.setText(timeE25);
                    }
                }, 12, 0, false
                );
                // displayed previous selected time

                timePickerDialog50.updateTime(t50Hour50, t50Minute50);
                //show dialog
                timePickerDialog50.show();
            }
        });


        backadd_sched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFacultyAdmin =new Intent(add_sched.this,faculty_admin.class);
                startActivity(toFacultyAdmin);
            }
        });

        save_sched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               newSection1 = selectedSection1;
               newSubject1 = editSubject1.getText().toString().trim();
               newSTime1 = timeS1;
               newETime1 = timeE1;

                newSection2 = selectedSection2;
                newSubject2 = editSubject2.getText().toString().trim();
                newSTime2 = timeS2;
                newETime2 = timeE2;

                newSection3 = selectedSection3;
                newSubject3 = editSubject3.getText().toString().trim();
                newSTime3 = timeS3;
                newETime3 = timeE3;

                newSection4 = selectedSection4;
                newSubject4 = editSubject4.getText().toString().trim();
                newSTime4 = timeS4;
                newETime4 = timeE4;

                newSection5 = selectedSection5;
                newSubject5 = editSubject5.getText().toString().trim();
                newSTime5 = timeS5;
                newETime5 = timeE5;

                newSection6 = selectedSection6;
                newSubject6 = editSubject6.getText().toString().trim();
                newSTime6 = timeS6;
                newETime6 = timeE6;

                newSection7 = selectedSection7;
                newSubject7 = editSubject7.getText().toString().trim();
                newSTime7 = timeS7;
                newETime7 = timeE7;

                newSection8 = selectedSection8;
                newSubject8 = editSubject8.getText().toString().trim();
                newSTime8 = timeS8;
                newETime8 = timeE8;

                newSection9 = selectedSection9;
                newSubject9 = editSubject9.getText().toString().trim();
                newSTime9 = timeS9;
                newETime9 = timeE9;

                newSection10 = selectedSection10;
                newSubject10 = editSubject10.getText().toString().trim();
                newSTime10 = timeS10;
                newETime10 = timeE10;

                newSection11 = selectedSection11;
                newSubject11 = editSubject11.getText().toString().trim();
                newSTime11 = timeS11;
                newETime11 = timeE11;

                newSection12 = selectedSection12;
                newSubject12 = editSubject12.getText().toString().trim();
                newSTime12 = timeS12;
                newETime12 = timeE12;

                newSection13 = selectedSection13;
                newSubject13 = editSubject13.getText().toString().trim();
                newSTime13 = timeS13;
                newETime13 = timeE13;

                newSection14 = selectedSection14;
                newSubject14 = editSubject14.getText().toString().trim();
                newSTime14 = timeS14;
                newETime14 = timeE14;

                newSection15 = selectedSection15;
                newSubject15 = editSubject15.getText().toString().trim();
                newSTime15 = timeS15;
                newETime15 = timeE15;

                newSection16 = selectedSection16;
                newSubject16 = editSubject16.getText().toString().trim();
                newSTime16 = timeS16;
                newETime16 = timeE16;

                newSection17 = selectedSection17;
                newSubject17 = editSubject17.getText().toString().trim();
                newSTime17 = timeS17;
                newETime17 = timeE17;

                newSection18 = selectedSection18;
                newSubject18 = editSubject18.getText().toString().trim();
                newSTime18 = timeS18;
                newETime18 = timeE18;

                newSection19 = selectedSection19;
                newSubject19 = editSubject19.getText().toString().trim();
                newSTime19 = timeS19;
                newETime19 = timeE19;

                newSection20 = selectedSection20;
                newSubject20 = editSubject20.getText().toString().trim();
                newSTime20 = timeS20;
                newETime20 = timeE20;

                newSection21 = selectedSection21;
                newSubject21 = editSubject21.getText().toString().trim();
                newSTime21 = timeS21;
                newETime21 = timeE21;

                newSection22 = selectedSection22;
                newSubject22 = editSubject22.getText().toString().trim();
                newSTime22 = timeS22;
                newETime22 = timeE22;

                newSection23 = selectedSection23;
                newSubject23 = editSubject23.getText().toString().trim();
                newSTime23 = timeS23;
                newETime23 = timeE23;

                newSection24 = selectedSection24;
                newSubject24 = editSubject24.getText().toString().trim();
                newSTime24 = timeS24;
                newETime24 = timeE24;

                newSection25 = selectedSection25;
                newSubject25 = editSubject25.getText().toString().trim();
                newSTime25 = timeS25;
                newETime25 = timeE25;

                uID = getIntent().getStringExtra("userID");
                DocumentReference updateSched = fbaseFstore.collection("teachers").document(uID);
                updateSched.update("amSubject1", newSubject1, "amSection1", newSection1, "amSTime1", newSTime1, "amETime1", newETime1,"amSubject2", newSubject2, "amSection2", newSection2,
                        "amSTime2", newSTime2, "amETime2", newETime2, "amSubject3", newSubject3, "amSection3", newSection3, "amSTime3", newSTime3, "amETime3", newETime3, "pmSubject4", newSubject4,
                        "pmSection4", newSection4, "pmSTime4", newSTime4, "pmETime4", newETime4, "pmSubject5", newSubject5, "pmSection5", newSection5, "pmSTime5", newSTime5, "pmETime5", newETime5,
                        "amSubject6", newSubject6, "amSection6", newSection6, "amSTime6", newSTime6, "amETime6", newETime6, "amSubject7", newSubject7, "amSection7", newSection7, "amSTime7", newSTime7,
                        "amETime7", newETime7, "amSubject8", newSubject8, "amSection8", newSection8, "amSTime8", newSTime8, "amETime8", newETime8, "pmSubject9", newSubject9, "pmSection9", newSection9,
                        "pmSTime9", newSTime9, "pmETime9", newETime9,"pmSubject10", newSubject10, "pmSection10", newSection10, "pmSTime10", newSTime10, "pmETime10", newETime10,"amSubject11", newSubject11,
                        "amSection11", newSection11, "amSTime11", newSTime11, "amETime11", newETime11, "amSubject12", newSubject12, "amSection12", newSection12, "amSTime12", newSTime12, "amETime12",
                        newETime12, "amSubject13", newSubject13, "amSection13", newSection13, "amSTime13", newSTime13, "amETime13", newETime13, "pmSubject14", newSubject14, "pmSection14", newSection14,
                        "pmSTime14", newSTime14, "pmETime14", newETime14, "pmSubject15", newSubject15, "pmSection15", newSection15, "pmSTime15", newSTime15, "pmETime15", newETime15,"amSubject16", newSection16,
                        "amSection16", newSection16, "amSTime16", newSTime16, "amETime16", newETime16, "amSubject17", newSubject17, "amSection17", newSection17, "amSTime17", newSTime17, "amETime17", newETime17,
                        "amSubject18", newSubject18, "amSection18", newSection18, "amSTime18", newSTime18, "amETime18", newETime18, "pmSubject19", newSubject19, "pmSection19", newSection19, "pmSTime19", newSTime19,
                        "pmETime19", newETime19, "pmSubject20", newSubject20, "pmSection20", newSection20, "pmSTime20", newSTime20, "pmETime20", newETime20, "amSubject21", newSubject21, "amSection21", newSection21,
                        "amSTime21", newSTime21, "amETime21", newETime21, "amSubject22", newSubject22, "amSection22", newSection22, "amSTime22", newSTime22, "amETime22", newETime22, "amSubject23", newSubject23,
                        "amSection23", newSection23, "amSTime23", newSTime23, "amETime23", newETime23, "pmSubject24", newSubject24, "pmSection24", newSection24, "pmSTime24", newSTime24, "pmETime24", newETime24,
                        "pmSubject25", newSubject25, "pmSection25", newSection25, "pmSTime25", newSTime25, "pmETime25", newETime25
                        ).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(add_sched.this, "Schedule Successfully Updated!", Toast.LENGTH_SHORT).show();

                            editSubject1.setText("");
                            editSTime1.setText("");
                            editETime1.setText("");

                            editSubject2.setText("");
                            editSTime2.setText("");
                            editETime2.setText("");

                            editSubject3.setText("");
                            editSTime3.setText("");
                            editETime3.setText("");

                            editSubject4.setText("");
                            editSTime4.setText("");
                            editETime4.setText("");

                            editSubject5.setText("");
                            editSTime5.setText("");
                            editETime5.setText("");

                            editSubject6.setText("");
                            editSTime6.setText("");
                            editETime6.setText("");

                            editSubject7.setText("");
                            editSTime7.setText("");
                            editETime7.setText("");

                            editSubject8.setText("");
                            editSTime8.setText("");
                            editETime8.setText("");

                            editSubject9.setText("");
                            editSTime9.setText("");
                            editETime9.setText("");

                            editSubject10.setText("");
                            editSTime10.setText("");
                            editETime10.setText("");

                            editSubject11.setText("");
                            editSTime11.setText("");
                            editETime11.setText("");

                            editSubject12.setText("");
                            editSTime12.setText("");
                            editETime12.setText("");

                            editSubject13.setText("");
                            editSTime13.setText("");
                            editETime13.setText("");

                            editSubject14.setText("");
                            editSTime14.setText("");
                            editETime14.setText("");

                            editSubject15.setText("");
                            editSTime15.setText("");
                            editETime15.setText("");

                            editSubject16.setText("");
                            editSTime16.setText("");
                            editETime16.setText("");

                            editSubject17.setText("");
                            editSTime17.setText("");
                            editETime17.setText("");

                            editSubject18.setText("");
                            editSTime18.setText("");
                            editETime18.setText("");

                            editSubject19.setText("");
                            editSTime19.setText("");
                            editETime19.setText("");

                            editSubject20.setText("");
                            editSTime20.setText("");
                            editETime20.setText("");

                            editSubject21.setText("");
                            editSTime21.setText("");
                            editETime21.setText("");

                            editSubject22.setText("");
                            editSTime22.setText("");
                            editETime22.setText("");

                            editSubject23.setText("");
                            editSTime23.setText("");
                            editETime23.setText("");

                            editSubject24.setText("");
                            editSTime24.setText("");
                            editETime24.setText("");

                            editSubject25.setText("");
                            editSTime25.setText("");
                            editETime25.setText("");
                        }
                        else{
                            Toast.makeText(add_sched.this, "Failed on Updating User's Schedule, Please Try again!", Toast.LENGTH_SHORT).show();
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
            }
        });
    }

}