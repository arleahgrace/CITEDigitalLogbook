package com.example.citelogbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class Leave_admin extends AppCompatActivity {
    Button backleave_admin;
    private FirebaseFirestore fbFStore;
    private RecyclerView firestoreRecyler;
    private FirestoreRecyclerAdapter fStoreAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leave_admin_layout);

        firestoreRecyler = findViewById(R.id.recycler_leave);
        fbFStore = FirebaseFirestore.getInstance();
        backleave_admin = findViewById(R.id.backadmin_leave);

        //query
        Query query = fbFStore.collection("leave_requests");

        FirestoreRecyclerOptions<leave_recycler> options = new FirestoreRecyclerOptions.Builder<leave_recycler>().setQuery(query,leave_recycler.class).build();
        //recyclerOptions


        fStoreAdapter = new FirestoreRecyclerAdapter<leave_recycler, leaveViewHolder>(options) {
            @NonNull
            @Override
            public leaveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_leave, parent, false);
                return new leaveViewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull leaveViewHolder holder, int i, @NonNull leave_recycler leave_recycler) {

                holder.leave_name.setText(leave_recycler.getFaculty_name());
                holder.leave_date.setText(leave_recycler.getDate_leave());
                holder.leave_reason.setText(leave_recycler.getReason_req());
                holder.leave_email.setText(leave_recycler.getFaculty_email());


                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(),leave_content.class);
                        i.putExtra("name", leave_recycler.getFaculty_name());
                        i.putExtra("email", leave_recycler.getFaculty_email());
                        i.putExtra("date", leave_recycler.getDate_leave());
                        i.putExtra("reason", leave_recycler.getReason_req());
                        i.putExtra("leaveUID", leave_recycler.getLeaveUID());
                        v.getContext().startActivity(i);
                    }
                });


            }


        };


        firestoreRecyler.setHasFixedSize(true);
        firestoreRecyler.setLayoutManager(new LinearLayoutManager(this));
        firestoreRecyler.setAdapter(fStoreAdapter);



        backleave_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDash = new Intent(Leave_admin.this, dash_admin.class);
                startActivity(toDash);
            }
        });
    }
        private class leaveViewHolder extends RecyclerView.ViewHolder {
            private TextView leave_name;
            private TextView leave_email;
            private TextView leave_date;
            private TextView leave_reason;


            public leaveViewHolder(@NonNull View itemView) {
                super(itemView);

                leave_name = itemView.findViewById(R.id.text_date);
                leave_email = itemView.findViewById(R.id.leave_email);
                leave_date = itemView.findViewById(R.id.leave_date);
                leave_reason = itemView.findViewById(R.id.leave_reason);
            }
        }



        @Override
        protected void onStop(){
            super.onStop();
            fStoreAdapter.stopListening();
        }
        @Override
        protected void onStart(){
            super.onStart();
            fStoreAdapter.startListening();
        }


    }

