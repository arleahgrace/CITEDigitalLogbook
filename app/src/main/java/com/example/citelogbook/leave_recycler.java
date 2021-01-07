package com.example.citelogbook;

import java.util.List;

public class leave_recycler {

    private String faculty_name, faculty_email, date_leave, reason_req, leaveUID;

    private leave_recycler(){}

    private leave_recycler(String faculty_name, String faculty_email, String date_leave, String reason_req, String leaveUID){
        this.faculty_name = faculty_name;
        this.faculty_email = faculty_email;
        this.date_leave = date_leave;
        this.leaveUID = leaveUID;
        this.reason_req = reason_req;

    }



    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public String getDate_leave() {
        return date_leave;
    }

    public void setDate_leave(String date_leave) {
        this.date_leave = date_leave;
    }

    public String getReason_req() {
        return reason_req;
    }

    public void setReason_req(String reason_req) {
        this.reason_req = reason_req;
    }


    public String getLeaveUID() {
        return leaveUID;
    }

    public void setLeaveUID(String leaveUID) {
        this.leaveUID = leaveUID;
    }

    public String getFaculty_email() {
        return faculty_email;
    }

    public void setFaculty_email(String faculty_email) {
        this.faculty_email = faculty_email;
    }
}
