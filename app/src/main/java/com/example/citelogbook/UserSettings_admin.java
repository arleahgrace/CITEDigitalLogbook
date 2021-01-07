package com.example.citelogbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.auth.User;

import java.util.ArrayList;
import java.util.List;

public class UserSettings_admin extends AppCompatActivity {
    Button backsettings_admin, adduserbutton;
    private FirebaseFirestore firebaseFirestore;
    private RecyclerView mFirestoreList;
    String uniqueID, selectedName, selectedEmail, selectedPhone, selectedId;
    private FirestoreRecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usersettings_admin_layout);
        mFirestoreList = findViewById(R.id.recycler_usersettings);
        firebaseFirestore = FirebaseFirestore.getInstance();
        backsettings_admin = findViewById(R.id.backadmin_userset);
        adduserbutton = findViewById(R.id.addusers);

        //query
        Query query = firebaseFirestore.collection("teachers");
        FirestoreRecyclerOptions<faculty> options = new FirestoreRecyclerOptions.Builder<faculty>().setQuery(query,faculty.class).build();
        //recyclerOptions
        adapter = new FirestoreRecyclerAdapter<faculty, UserSettings_admin.facultyViewHolder>(options) {


            @NonNull
            @Override
            public UserSettings_admin.facultyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_user,parent,false);
                return new UserSettings_admin.facultyViewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull UserSettings_admin.facultyViewHolder holder, int i, @NonNull faculty faculty) {
                holder.list_name.setText(faculty.getFullname());

                holder.edit_user.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                      /*  openDialog();
                      Intent intent = new Intent(v.getContext(), edit_user.class);
                        intent.putExtra("fullname", faculty.getFullname());
                        intent.putExtra("email", faculty.getEmail());
                        intent.putExtra("idNumber", faculty.getIdNumber());
                        intent.putExtra("phone", faculty.getPhonenumber());
                        intent.putExtra("userID", faculty.getUserID());
                        v.getContext().startActivity(intent);*/
                        AlertDialog.Builder builder = new AlertDialog.Builder(UserSettings_admin.this);
                        LayoutInflater inflater = getLayoutInflater();
                        View customLayout = inflater.inflate(R.layout.edit_user_layout, null);
                            builder.setView(customLayout);
                            builder.setTitle("Edit User");

                        EditText editName = customLayout.findViewById(R.id.editName);
                        EditText editEmail = customLayout.findViewById(R.id.editEmail);
                        EditText editPhone = customLayout.findViewById(R.id.editPhone);
                        EditText editId = customLayout.findViewById(R.id.editId);

                        uniqueID = (faculty.getUserID());
                        selectedName = faculty.getFullname();
                        selectedEmail = faculty.getEmail();
                        selectedId = faculty.getIdNumber();
                        selectedPhone = faculty.getPhonenumber();

                        editName.setText(selectedName);
                        editEmail.setText(selectedEmail);
                        editId.setText(selectedId);
                        editPhone.setText(selectedPhone);

                            builder.setPositiveButton("Save Changes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    String newName = editName.getText().toString().trim();
                                    String newEmail = editEmail.getText().toString().trim();
                                    String newIdNumber = editId.getText().toString().trim();
                                    String newPhone = editPhone.getText().toString().trim();


                                    firebaseFirestore = FirebaseFirestore.getInstance();
                                    DocumentReference userRef = firebaseFirestore.collection("users").document(uniqueID);
                                    DocumentReference teacherRef = firebaseFirestore.collection("teachers").document(uniqueID);
                                    userRef.update("fullname", newName, "email", newEmail, "idNumber", newIdNumber, "phonenumber", newPhone);
                                    teacherRef.update("fullname", newName, "email", newEmail, "idNumber", newIdNumber, "phonenumber", newPhone).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if (task.isSuccessful()){
                                                Toast.makeText(UserSettings_admin.this, "Sucessfully Updated the User", Toast.LENGTH_SHORT).show();
                                            }
                                            else{
                                                Toast.makeText(UserSettings_admin.this, "Failed Updating User", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    }).addOnFailureListener(new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull Exception e) {
                                            Toast.makeText(UserSettings_admin.this, "Failed Updating User", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                }
                            });
                            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            AlertDialog dialog = builder.create();
                            dialog.show();
                    }
                });
                holder.delete_user.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        TextView users = new TextView(v.getContext());
                        uniqueID = (faculty.getUserID());
                        selectedName = (faculty.getFullname());
                        AlertDialog.Builder deleteUserDialog = new AlertDialog.Builder(v.getContext());
                        deleteUserDialog.setTitle("Delete User");
                        deleteUserDialog.setMessage("Are you sure you want to delete" + " " + selectedName + "?");
                        deleteUserDialog.setView(users);
                        deleteUserDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                firebaseFirestore = FirebaseFirestore.getInstance();
                                firebaseFirestore.collection("users").document(uniqueID).delete();
                                firebaseFirestore.collection("teachers").document(uniqueID).delete()
                                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if(task.isSuccessful()){
                                                    Toast.makeText(UserSettings_admin.this, "User Deleted", Toast.LENGTH_SHORT).show();
                                                    finish();
                                                }
                                                else{
                                                    Toast.makeText(UserSettings_admin.this,"Failed Deleting User", Toast.LENGTH_SHORT).show();
                                                }
                                            }
                                        });
                            }
                        });

                        deleteUserDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        deleteUserDialog.create().show();

                    }


                });
            }

        };
        mFirestoreList.setHasFixedSize(true);
        mFirestoreList.setLayoutManager(new LinearLayoutManager(this));
        mFirestoreList.setAdapter(adapter);


        backsettings_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDash=new Intent(UserSettings_admin.this,dash_admin.class);
                startActivity(toDash);
            }
        });

        adduserbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toAdd=new Intent(UserSettings_admin.this,add_user.class);
                startActivity(toAdd);
            }
        });
    }



    private class facultyViewHolder extends RecyclerView.ViewHolder {
        private TextView list_name;
        private Button edit_user;
        private Button delete_user;

        public facultyViewHolder(@NonNull View itemView) {
            super(itemView);
            edit_user = itemView.findViewById(R.id.edit_userbutt);
            list_name = itemView.findViewById(R.id.list_name);
            delete_user = itemView.findViewById(R.id.del_userbutt);  
        }
    }
/*public void openDialog(){
        editDialog EditDialog = new editDialog();
        EditDialog.show(getSupportFragmentManager(), "edit dialog");
}*/
    public interface UserSettings{
        void onUserSelected(User user);
    }
    @Override
    protected void onStop(){
        super.onStop();
        adapter.stopListening();
    }
    @Override
    protected void onStart(){
        super.onStart();
        adapter.startListening();
    }
}