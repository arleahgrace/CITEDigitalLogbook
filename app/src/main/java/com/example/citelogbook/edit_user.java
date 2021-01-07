package com.example.citelogbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class edit_user extends AppCompatActivity {
    EditText editName, editEmail, editId, editPhone;
    String currName, currEmail, currIdNumber, currPhone, userID;
    Button backedit_user, saveBtn;
    FirebaseAuth fAuthentication;
    FirebaseFirestore fireStore;
    boolean valid = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_user_layout);


        fAuthentication = FirebaseAuth.getInstance();
        fireStore = FirebaseFirestore.getInstance();

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editId = findViewById(R.id.editId);
        editPhone = findViewById(R.id.editPhone);
     /*   saveBtn = findViewById(R.id.saveBtn);
        backedit_user = findViewById(R.id.backedit_user);*/

       currName = getIntent().getStringExtra("fullname");
        currEmail = getIntent().getStringExtra("email");
        currIdNumber = getIntent().getStringExtra("idNumber");
        currPhone = getIntent().getStringExtra("phone");


        editName.setText(currName);
        editEmail.setText(currEmail);
        editId.setText(currIdNumber);
        editPhone.setText(currPhone);
/*
        backedit_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSettings=new Intent(edit_user.this,UserSettings_admin.class);
                startActivity(toSettings);
            }
        });*/

        if (valid) {
          /*  saveBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkField(editName);
                    checkField(editEmail);
                    checkField(editId);
                    checkField(editPhone);

                    userID = getIntent().getStringExtra("userID");
                    String newName = editName.getText().toString().trim();
                    String newEmail = editEmail.getText().toString().trim();
                    String newIdNumber = editId.getText().toString().trim();
                    String newPhone = editPhone.getText().toString().trim();

                    String userTeacher = fAuthentication.getUid();
                    String userUser = fAuthentication.getUid();
                    fireStore = FirebaseFirestore.getInstance();
                    DocumentReference userRef = fireStore.collection("users").document(userID);
                    DocumentReference teacherRef = fireStore.collection("teachers").document(userID);
                    userRef.update("fullname", newName, "email", newEmail, "idNumber", newIdNumber, "phonenumber", newPhone);
                    teacherRef.update("fullname", newName, "email", newEmail, "idNumber", newIdNumber, "phonenumber", newPhone).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(edit_user.this, "User Updated", Toast.LENGTH_SHORT).show();
                                editName.setText("");
                                editEmail.setText("");
                                editId.setText("");
                                editPhone.setText("");
                            } else {
                                Toast.makeText(edit_user.this, "Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(edit_user.this, "Failed to update", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            });*/
        }
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
    protected void onStart() {
        super.onStart();
        if(FirebaseAuth.getInstance().getCurrentUser()!= null){
            startActivity(new Intent(getApplicationContext(),edit_user.class));
            finish();
        }
    }
}