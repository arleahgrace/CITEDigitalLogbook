package com.example.citelogbook;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class profile_user extends AppCompatActivity {
    Button backprofile_user, changepass_user;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    TextView name_user, email_user, idnumber_user;
    String userId;
    FirebaseUser teacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_user_layout);
        backprofile_user = findViewById(R.id.backuser_profile);
        name_user = findViewById(R.id.name_user);
        email_user = findViewById(R.id.email_user);
        idnumber_user = findViewById(R.id.idnumber_user);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        changepass_user = findViewById(R.id.changepass_user);
        teacher = fAuth.getCurrentUser();

        userId = fAuth.getCurrentUser().getUid();
        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                idnumber_user.setText(documentSnapshot.getString("idNumber"));
                name_user.setText(documentSnapshot.getString("fullname"));
                email_user.setText(documentSnapshot.getString("email"));
            }
        });

        backprofile_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDashUser=new Intent(profile_user.this,dash_user.class);
                startActivity(toDashUser);
            }
        });
        changepass_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText resetPassword_user = new EditText(v.getContext());
                final AlertDialog.Builder passwordResetDialog_user = new AlertDialog.Builder(v.getContext());
                passwordResetDialog_user.setTitle("Change Password?");
                passwordResetDialog_user.setMessage("Enter new password (Atleast 6 characters)");
                passwordResetDialog_user.setView(resetPassword_user);

                passwordResetDialog_user.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String newPassword = resetPassword_user.getText().toString();
                        teacher.updatePassword(newPassword).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(profile_user.this,"Password Changed Successfully",Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(profile_user.this, "Failed Changing Password", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });

                passwordResetDialog_user.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                passwordResetDialog_user.create().show();
            }
        });


    }
}