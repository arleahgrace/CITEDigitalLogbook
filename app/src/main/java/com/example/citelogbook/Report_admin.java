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
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class Report_admin extends AppCompatActivity {
    Button backreport_admin;
    private FirebaseFirestore fstore;
    private RecyclerView report_recycler;
    private FirestoreRecyclerAdapter rAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_admin_layout);
        report_recycler = findViewById(R.id.report_recycler);
        fstore = FirebaseFirestore.getInstance();
        backreport_admin = findViewById(R.id.backadmin_report);

        //query
        Query query =fstore.collection("teacherAttendance");
        FirestoreRecyclerOptions<attendModel> roptions = new FirestoreRecyclerOptions.Builder<attendModel>().setQuery(query,attendModel.class).build();
        //recyclerOptions
        rAdapter = new FirestoreRecyclerAdapter<attendModel, adViewHolder>(roptions) {
            @NonNull
            @Override
            public Report_admin.adViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_report,parent,false);
                return new Report_admin.adViewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull Report_admin.adViewHolder holder, int position, @NonNull attendModel attendModel) {
                holder.attend_name.setText(attendModel.getFullname());

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), attend_content.class);
                        intent.putExtra("tname", attendModel.getFullname());
                        intent.putExtra("amSubject1", attendModel.getAmSubject1());
                        intent.putExtra("amDate1", attendModel.getAmDate1());
                        intent.putExtra("amSubject1Stat",attendModel.getAmSubject1Stat());

                        intent.putExtra("amSubject2", attendModel.getAmSubject2());
                        intent.putExtra("amDate2", attendModel.getAmDate2());
                        intent.putExtra("amSubject2Stat",attendModel.getAmSubject2Stat());

                        intent.putExtra("amSubject3", attendModel.getAmSubject3());
                        intent.putExtra("amDate3", attendModel.getAmDate3());
                        intent.putExtra("amSubject3Stat",attendModel.getAmSubject3Stat());

                        intent.putExtra("pmSubject4", attendModel.getPmSubject4());
                        intent.putExtra("pmDate4", attendModel.getPmDate4());
                        intent.putExtra("pmSubject4Stat",attendModel.getPmSubject4Stat());

                        intent.putExtra("pmSubject5", attendModel.getPmSubject5());
                        intent.putExtra("pmDate5", attendModel.getPmDate5());
                        intent.putExtra("pmSubject5Stat",attendModel.getPmSubject5Stat());

                        intent.putExtra("amSubject6", attendModel.getAmSubject6());
                        intent.putExtra("amDate6", attendModel.getAmDate6());
                        intent.putExtra("amSubject6Stat",attendModel.getAmSubject6Stat());

                        intent.putExtra("amSubject7", attendModel.getAmSubject7());
                        intent.putExtra("amDate7", attendModel.getAmDate7());
                        intent.putExtra("amSubject7Stat",attendModel.getAmSubject7Stat());

                        intent.putExtra("amSubject8", attendModel.getAmSubject8());
                        intent.putExtra("amDate8", attendModel.getAmDate8());
                        intent.putExtra("amSubject8Stat",attendModel.getAmSubject8Stat());

                        intent.putExtra("pmSubject9", attendModel.getPmSubject9());
                        intent.putExtra("pmDate9", attendModel.getPmDate9());
                        intent.putExtra("pmSubject9Stat",attendModel.getPmSubject9Stat());

                        intent.putExtra("pmSubject10", attendModel.getPmSubject10());
                        intent.putExtra("pmDate10", attendModel.getPmDate10());
                        intent.putExtra("pmSubject10Stat",attendModel.getPmSubject10Stat());

                        intent.putExtra("amSubject11", attendModel.getAmSubject11());
                        intent.putExtra("amDate11", attendModel.getAmDate11());
                        intent.putExtra("amSubject11Stat",attendModel.getAmSubject11Stat());

                        intent.putExtra("amSubject12", attendModel.getAmSubject12());
                        intent.putExtra("amDate12", attendModel.getAmDate12());
                        intent.putExtra("amSubject12Stat",attendModel.getAmSubject12Stat());

                        intent.putExtra("amSubject13", attendModel.getAmSubject13());
                        intent.putExtra("amDate13", attendModel.getAmDate13());
                        intent.putExtra("amSubject13Stat",attendModel.getAmSubject13Stat());

                        intent.putExtra("pmSubject14", attendModel.getPmSubject14());
                        intent.putExtra("pmDate14", attendModel.getPmDate14());
                        intent.putExtra("pmSubject14Stat",attendModel.getPmSubject14Stat());

                        intent.putExtra("pmSubject15", attendModel.getPmSubject15());
                        intent.putExtra("pmDate15", attendModel.getPmDate15());
                        intent.putExtra("pmSubject15Stat",attendModel.getPmSubject15Stat());

                        intent.putExtra("amSubject16", attendModel.getAmSubject16());
                        intent.putExtra("amDate16", attendModel.getAmDate16());
                        intent.putExtra("amSubject16Stat",attendModel.getAmSubject16Stat());

                        intent.putExtra("amSubject17", attendModel.getAmSubject17());
                        intent.putExtra("amDate17", attendModel.getAmDate17());
                        intent.putExtra("amSubject17Stat",attendModel.getAmSubject17Stat());

                        intent.putExtra("amSubject18", attendModel.getAmSubject18());
                        intent.putExtra("amDate18", attendModel.getAmDate18());
                        intent.putExtra("amSubject18Stat",attendModel.getAmSubject18Stat());

                        intent.putExtra("pmSubject19", attendModel.getPmSubject19());
                        intent.putExtra("pmDate19", attendModel.getPmDate19());
                        intent.putExtra("pmSubject19Stat",attendModel.getPmSubject19Stat());

                        intent.putExtra("pmSubject20", attendModel.getPmSubject20());
                        intent.putExtra("pmDate20", attendModel.getPmDate20());
                        intent.putExtra("pmSubject20Stat",attendModel.getPmSubject20Stat());

                        intent.putExtra("amSubject21", attendModel.getAmSubject21());
                        intent.putExtra("amDate21", attendModel.getAmDate21());
                        intent.putExtra("amSubject21Stat",attendModel.getAmSubject21Stat());

                        intent.putExtra("amSubject22", attendModel.getAmSubject22());
                        intent.putExtra("amDate22", attendModel.getAmDate22());
                        intent.putExtra("amSubject22Stat",attendModel.getAmSubject22Stat());

                        intent.putExtra("amSubject23", attendModel.getAmSubject23());
                        intent.putExtra("amDate23", attendModel.getAmDate23());
                        intent.putExtra("amSubject23Stat",attendModel.getAmSubject23Stat());

                        intent.putExtra("pmSubject24", attendModel.getPmSubject24());
                        intent.putExtra("pmDate24", attendModel.getPmDate24());
                        intent.putExtra("pmSubject24Stat",attendModel.getPmSubject24Stat());

                        intent.putExtra("pmSubject25", attendModel.getPmSubject25());
                        intent.putExtra("pmDate25", attendModel.getPmDate25());
                        intent.putExtra("pmSubject25Stat",attendModel.getPmSubject25Stat());

                        /*SCHEDULING ENDS*/
                        v.getContext().startActivity(intent);
                    }
                });

            }
        };
        report_recycler.setHasFixedSize(true);
        report_recycler.setLayoutManager(new LinearLayoutManager(this));
        report_recycler.setAdapter(rAdapter);


        backreport_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDash=new Intent(Report_admin.this,dash_admin.class);
                startActivity(toDash);
            }
        });
    }
    private class adViewHolder extends RecyclerView.ViewHolder {
        private TextView attend_name;
        public adViewHolder(@NonNull View itemView) {
            super(itemView);

            attend_name = itemView.findViewById(R.id.attend_name);

        }
    }
    @Override
    protected void onStop(){
        super.onStop();
        rAdapter.stopListening();
    }
    @Override
    protected void onStart(){
        super.onStart();
        rAdapter.startListening();
    }

}