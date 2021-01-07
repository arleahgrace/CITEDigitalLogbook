package com.example.citelogbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;

public class Leave_user extends AppCompatActivity {
    Button backleave_user;
    private Button mDatePickerBtn;
    private TextView mSelectedDateText;
    FirebaseFirestore mFireStore;
    private EditText reason_text ,faculty_name, faculty_email;
    private TextView selected_date;
    Button mSaveBtn;
    boolean valid = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leave_user_layout);

        mFireStore = FirebaseFirestore.getInstance();
        selected_date = findViewById(R.id.SelectedDate);
        mDatePickerBtn = findViewById(R.id.date_picker_btn);
        mSelectedDateText = findViewById(R.id.SelectedDate);
        backleave_user = findViewById(R.id.backuser_leave);
        reason_text = (EditText) findViewById(R.id.reason_text);
        mSaveBtn = (Button) findViewById(R.id.submitrequest);
        faculty_name = (EditText) findViewById(R.id.faculty_name);
        faculty_email = (EditText) findViewById(R.id.faculty_email);

        backleave_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDashUser=new Intent(Leave_user.this,dash_user.class);
                startActivity(toDashUser);
            }
        });

        //materialdatepicker

        MaterialDatePicker.Builder<Pair<Long, Long>> builder = MaterialDatePicker.Builder.dateRangePicker();
        builder.setTitleText("Select a Date");
        final MaterialDatePicker materialDatePicker = builder.build();


        mDatePickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(getSupportFragmentManager(),"DATE_PICKER");
            }
        });

        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                mSelectedDateText.setText("Selected Date: " + materialDatePicker.getHeaderText());
            }
        });

        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkInput(reason_text);
                checkInput(faculty_name);
                checkInput(faculty_email);

                DocumentReference leaveUID = mFireStore.collection("leave_requests").document();

                Map<String, String> requestMap = new HashMap<>();

                requestMap.put("faculty_name", faculty_name.getText().toString());
                requestMap.put("faculty_email", faculty_email.getText().toString());
                requestMap.put("date_leave", selected_date.getText().toString());
                requestMap.put("reason_req", reason_text.getText().toString());
                requestMap.put("status","pending");
                requestMap.put("leaveUID",leaveUID.getId());
                leaveUID.set(requestMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Leave_user.this, "Request Submitted", Toast.LENGTH_SHORT).show();
                            faculty_name.setText("");
                            faculty_email.setText("");
                            selected_date.setText("");
                            reason_text.setText("");
                        }
                        else{
                            Toast.makeText(Leave_user.this, "Failed Submitting Request", Toast.LENGTH_SHORT).show();
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        String error = e.getMessage();
                        Toast.makeText(Leave_user.this,"Error: "+ error,Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }
    public boolean checkInput(EditText editfield){
        if(editfield.getText().toString().isEmpty()){
            editfield.setError("Error");
            valid = false;
        }
        else{
            valid = true;
        }
        return valid;
    }
}