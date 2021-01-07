package com.example.citelogbook;

public class approved {
    private String approved_name, approved_date, approved_reason, approvedUID, status;

    private approved(){}

    private approved(String approved_name, String approved_date, String approved_reason, String approvedUID, String status){
        this.approved_name = approved_name;
        this.approved_date = approved_date;
        this.approved_reason = approved_reason;
        this.approvedUID = approvedUID;
        this.status = status;

    }


    public String getApproved_name() {
        return approved_name;
    }

    public void setApproved_name(String approved_name) {
        this.approved_name = approved_name;
    }

    public String getApproved_date() {
        return approved_date;
    }

    public void setApproved_date(String approved_date) {
        this.approved_date = approved_date;
    }

    public String getApproved_reason() {
        return approved_reason;
    }

    public void setApproved_reason(String approved_reason) {
        this.approved_reason = approved_reason;
    }

    public String getApprovedUID() {
        return approvedUID;
    }

    public void setApprovedUID(String approvedUID) {
        this.approvedUID = approvedUID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

