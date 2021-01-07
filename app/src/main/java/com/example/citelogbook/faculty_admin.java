package com.example.citelogbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class faculty_admin extends AppCompatActivity {
Button backfaculty_admin;
private FirebaseFirestore firebaseFirestore;
private RecyclerView mFirestoreList;
private FirestoreRecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty_admin_layout);

        backfaculty_admin = findViewById(R.id.backadmin_faculty);
        mFirestoreList = findViewById(R.id.recycler_faculty);
        firebaseFirestore = FirebaseFirestore.getInstance();

        //query
        Query query = firebaseFirestore.collection("teachers");
        FirestoreRecyclerOptions<teacherModel> options = new FirestoreRecyclerOptions.Builder<teacherModel>().setQuery(query,teacherModel.class).build();
        //recyclerOptions
         adapter = new FirestoreRecyclerAdapter<teacherModel, facultyViewHolder>(options) {
            @NonNull
            @Override
            public facultyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
                return new facultyViewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull facultyViewHolder holder, int position, @NonNull teacherModel teacherModel) {
                holder.list_idnumber.setText(teacherModel.getIdNumber());
                holder.list_name.setText(teacherModel.getFullname());
                holder.edit_sched.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), add_sched.class);
                       intent.putExtra("fullname", teacherModel.getFullname());
                        intent.putExtra("idNumber", teacherModel.getIdNumber());
                        intent.putExtra("userID", teacherModel.getUserID());
                        intent.putExtra("day1",teacherModel.getDay1());
                        intent.putExtra("day2", teacherModel.getDay2());
                        intent.putExtra("day3", teacherModel.getDay3());
                        intent.putExtra("day4", teacherModel.getDay4());
                        intent.putExtra("day5", teacherModel.getDay5());
                        intent.putExtra("day6", teacherModel.getDay6());
                        intent.putExtra("day7", teacherModel.getDay7());
                        intent.putExtra("day8", teacherModel.getDay8());
                        intent.putExtra("day9", teacherModel.getDay9());
                        intent.putExtra("day10", teacherModel.getDay10());
                        intent.putExtra("day11", teacherModel.getDay11());
                        intent.putExtra("day12", teacherModel.getDay12());
                        intent.putExtra("day13", teacherModel.getDay13());
                        intent.putExtra("day14", teacherModel.getDay14());
                        intent.putExtra("day15", teacherModel.getDay15());
                        intent.putExtra("day16", teacherModel.getDay16());
                        intent.putExtra("day17", teacherModel.getDay17());
                        intent.putExtra("day18", teacherModel.getDay18());
                        intent.putExtra("day19", teacherModel.getDay19());
                        intent.putExtra("day20", teacherModel.getDay20());
                        intent.putExtra("day21", teacherModel.getDay21());
                        intent.putExtra("day22", teacherModel.getDay22());
                        intent.putExtra("day23", teacherModel.getDay23());
                        intent.putExtra("day24", teacherModel.getDay24());
                        intent.putExtra("day25", teacherModel.getDay25());
                        //monday am
                        intent.putExtra("amSubject1", teacherModel.getAmSubject1());
                        intent.putExtra("amSection1", teacherModel.getAmSubject1());
                        intent.putExtra("amSTime1", teacherModel.getAmSTime1());
                        intent.putExtra("amETime1", teacherModel.getAmETime1());
                        intent.putExtra("amSubject2", teacherModel.getAmSubject2());
                        intent.putExtra("amSection2", teacherModel.getAmSection2());
                        intent.putExtra("amSTime2", teacherModel.getAmSTime2());
                        intent.putExtra("amETime2", teacherModel.getAmETime2());
                        intent.putExtra("amSubject3", teacherModel.getAmSubject3());
                        intent.putExtra("amSection3", teacherModel.getAmSection3());
                        intent.putExtra("amSTime3", teacherModel.getAmSTime3());
                        intent.putExtra("amETime3", teacherModel.getAmETime3());
                        //monday pm
                        intent.putExtra("pmSubject4", teacherModel.getPmSubject4());
                        intent.putExtra("pmSection4", teacherModel.getPmSection4());
                        intent.putExtra("pmSTime4", teacherModel.getPmSTime4());
                        intent.putExtra("pmETime4", teacherModel.getPmETime4());
                        intent.putExtra("pmSubject5", teacherModel.getPmSubject5());
                        intent.putExtra("pmSection5", teacherModel.getPmSection5());
                        intent.putExtra("pmSTime5", teacherModel.getPmSTime5());
                        intent.putExtra("pmETime5", teacherModel.getPmETime5());
                        //tuesday am
                        intent.putExtra("amSubject6", teacherModel.getAmSubject6());
                        intent.putExtra("amSection6", teacherModel.getAmSection6());
                        intent.putExtra("amSTime6", teacherModel.getAmSTime6());
                        intent.putExtra("amETime6", teacherModel.getAmETime6());
                        intent.putExtra("amSubject7", teacherModel.getAmSubject7());
                        intent.putExtra("amSection7", teacherModel.getAmSection7());
                        intent.putExtra("amSTime7", teacherModel.getAmSTime7());
                        intent.putExtra("amETime7", teacherModel.getAmETime7());
                        intent.putExtra("amSubject8", teacherModel.getAmSubject8());
                        intent.putExtra("amSection8", teacherModel.getAmSection8());
                        intent.putExtra("amSTime8", teacherModel.getAmSTime8());
                        intent.putExtra("amETime8", teacherModel.getAmETime8());
                        //tuesday pm
                        intent.putExtra("pmSubject9",teacherModel.getPmSubject9());
                        intent.putExtra("pmSection9", teacherModel.getPmSection9());
                        intent.putExtra("pmSTime9", teacherModel.getPmSTime9());
                        intent.putExtra("pmETime9", teacherModel.getPmETime9());
                        intent.putExtra("pmSubject10", teacherModel.getPmSubject10());
                        intent.putExtra("pmSection10", teacherModel.getPmSection10());
                        intent.putExtra("pmSTime10", teacherModel.getPmSTime10());
                        intent.putExtra("pmETime10", teacherModel.getPmETime10());
                        //wednesday am
                        intent.putExtra("amSubject11", teacherModel.getAmSubject11());
                        intent.putExtra("amSection11", teacherModel.getAmSection11());
                        intent.putExtra("amSTime11", teacherModel.getAmSTime11());
                        intent.putExtra("amETime11", teacherModel.getAmETime11());
                        intent.putExtra("amSubject12", teacherModel.getAmSubject12());
                        intent.putExtra("amSection12", teacherModel.getAmSection12());
                        intent.putExtra("amSTime12", teacherModel.getAmSTime12());
                        intent.putExtra("amETime12", teacherModel.getAmETime12());
                        intent.putExtra("amSubject13", teacherModel.getAmSubject13());
                        intent.putExtra("amSection13", teacherModel.getAmSection13());
                        intent.putExtra("amSTime13", teacherModel.getAmSTime13());
                        intent.putExtra("amETime13", teacherModel.getAmETime13());
                        //wednesday pm
                        intent.putExtra("pmSubject14", teacherModel.getPmSubject14());
                        intent.putExtra("pmSection14", teacherModel.getPmSection14());
                        intent.putExtra("pmSTime14", teacherModel.getPmSTime14());
                        intent.putExtra("pmETime14", teacherModel.getPmETime14());
                        intent.putExtra("pmSubject15", teacherModel.getPmSubject15());
                        intent.putExtra("pmSection15", teacherModel.getPmSection15());
                        intent.putExtra("pmSTime15", teacherModel.getPmSTime15());
                        intent.putExtra("pmETime15", teacherModel.getPmETime15());
                        //thursday am
                        intent.putExtra("amSubject16", teacherModel.getAmSubject16());
                        intent.putExtra("amSection16", teacherModel.getAmSection16());
                        intent.putExtra("amSTime16", teacherModel.getAmSTime16());
                        intent.putExtra("amETime16", teacherModel.getAmETime16());
                        intent.putExtra("amSubject17", teacherModel.getAmSubject17());
                        intent.putExtra("amSection17", teacherModel.getAmSection17());
                        intent.putExtra("amSTime17", teacherModel.getAmSTime17());
                        intent.putExtra("amETime17", teacherModel.getAmETime17());
                        intent.putExtra("amSubject18", teacherModel.getAmSubject18());
                        intent.putExtra("amSection18", teacherModel.getAmSection18());
                        intent.putExtra("amSTime18", teacherModel.getAmSTime18());
                        intent.putExtra("amETime18", teacherModel.getAmETime18());
                        //thursday pm
                        intent.putExtra("pmSubject19", teacherModel.getPmSubject19());
                        intent.putExtra("pmSection19", teacherModel.getPmSection19());
                        intent.putExtra("pmSTime19", teacherModel.getPmSTime19());
                        intent.putExtra("pmETime19",teacherModel.getPmETime19());
                        intent.putExtra("pmSubject20", teacherModel.getPmSubject20());
                        intent.putExtra("pmSection20", teacherModel.getPmSection20());
                        intent.putExtra("pmSTime20", teacherModel.getPmSTime20());
                        intent.putExtra("pmETime20", teacherModel.getPmETime20());
                        //friday am
                        intent.putExtra("amSubject21", teacherModel.getAmSubject21());
                        intent.putExtra("amSection21", teacherModel.getAmSection21());
                        intent.putExtra("amSTime21", teacherModel.getAmSTime21());
                        intent.putExtra("amETime21", teacherModel.getAmETime21());
                        intent.putExtra("amSubject22", teacherModel.getAmSubject22());
                        intent.putExtra("amSection22", teacherModel.getAmSection22());
                        intent.putExtra("amSTime22", teacherModel.getAmSTime22());
                        intent.putExtra("amETime22", teacherModel.getAmETime22());
                        intent.putExtra("amSubject23", teacherModel.getAmSubject23());
                        intent.putExtra("amSection23", teacherModel.getAmSection23());
                        intent.putExtra("amSTime23", teacherModel.getAmSTime23());
                        intent.putExtra("amETime23", teacherModel.getAmETime23());
                        //friday pm
                        intent.putExtra("pmSubject24", teacherModel.getPmSubject24());
                        intent.putExtra("pmSection24", teacherModel.getPmSection24());
                        intent.putExtra("pmSTime24", teacherModel.getPmSTime24());
                        intent.putExtra("pmETime24", teacherModel.getPmETime24());
                        intent.putExtra("pmSubject25", teacherModel.getPmSubject25());
                        intent.putExtra("pmSection25", teacherModel.getPmSection25());
                        intent.putExtra("pmSTime25", teacherModel.getPmSTime25());
                        intent.putExtra("pmETime25", teacherModel.getPmETime25());
                        /*SCHEDULING ENDS*/
                        v.getContext().startActivity(intent);
                    }
                });

            }
        };
        mFirestoreList.setHasFixedSize(true);
        mFirestoreList.setLayoutManager(new LinearLayoutManager(this));
        mFirestoreList.setAdapter(adapter);



        backfaculty_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDash=new Intent(faculty_admin.this,dash_admin.class);
                startActivity(toDash);
            }
        });
    }

    private class facultyViewHolder extends RecyclerView.ViewHolder {
        private TextView list_name;
        private TextView list_idnumber;
        private Button edit_sched;
        public facultyViewHolder(@NonNull View itemView) {
            super(itemView);

            list_name = itemView.findViewById(R.id.list_name);
            list_idnumber = itemView.findViewById(R.id.list_idnumber);
            edit_sched = itemView.findViewById(R.id.edit_schedbutt);

        }
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