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

public class profile_admin extends AppCompatActivity {
    Button backprofile_admin, changepass_admin;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    TextView fullName, email, idnumber;
    String adminId;
    FirebaseUser admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_admin_layout);
        fullName = findViewById(R.id.name_admin);
        email = findViewById(R.id.email);
        idnumber = findViewById(R.id.idnumber);
        backprofile_admin = findViewById(R.id.backadmin_profile);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        changepass_admin = findViewById(R.id.changepass_admin);
        admin = fAuth.getCurrentUser();

        adminId = fAuth.getCurrentUser().getUid();
        DocumentReference documentReference = fStore.collection("users").document(adminId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                idnumber.setText(documentSnapshot.getString("idNumber"));
                fullName.setText(documentSnapshot.getString("fullname"));
                email.setText(documentSnapshot.getString("email"));
            }
        });

     changepass_admin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             final EditText resetPassword= new EditText(v.getContext());
             final AlertDialog.Builder passwordResetDialog = new AlertDialog.Builder(v.getContext());
             passwordResetDialog.setTitle("Change Password?");
             passwordResetDialog.setMessage("Enter new password (Atleast 6 characters)");
             passwordResetDialog.setView(resetPassword);

             passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     String newPassword = resetPassword.getText().toString();
                     admin.updatePassword(newPassword).addOnSuccessListener(new OnSuccessListener<Void>() {
                         @Override
                         public void onSuccess(Void aVoid) {
                             Toast.makeText(profile_admin.this,"Password Changed Successfully",Toast.LENGTH_SHORT).show();
                         }
                     }).addOnFailureListener(new OnFailureListener() {
                         @Override
                         public void onFailure(@NonNull Exception e) {
                             Toast.makeText(profile_admin.this, "Failed Changing Password", Toast.LENGTH_SHORT).show();
                         }
                     });
                 }
             });

             passwordResetDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {

                 }
             });

             passwordResetDialog.create().show();
         }
     });

        backprofile_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDash=new Intent(profile_admin.this,dash_admin.class);
                startActivity(toDash);
            }
        });

    }
}