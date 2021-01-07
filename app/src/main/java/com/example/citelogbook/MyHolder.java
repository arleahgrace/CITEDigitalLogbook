package com.example.citelogbook;


import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyHolder extends RecyclerView.ViewHolder {


    TextView date_leave;
    EditText faculty_name, reason_req;

    public MyHolder(@NonNull View itemView){
        super(itemView);

        this.date_leave = itemView.findViewById(R.id.SelectedDate);
        this.faculty_name = itemView.findViewById(R.id.faculty_name);
        this.reason_req = itemView.findViewById(R.id.reason_text);
    }
}
