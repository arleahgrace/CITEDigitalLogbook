package com.example.citelogbook;

public class faculty_user {

    private String fullname, idNumber;

    private faculty_user(){}

    private faculty_user(String fullname, String idNumber){
        this.fullname = fullname;
        this.idNumber = idNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
