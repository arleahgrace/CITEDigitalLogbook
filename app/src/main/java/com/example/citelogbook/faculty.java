package com.example.citelogbook;

public class faculty {
    private String fullname, email, idNumber, phonenumber, userID;

    private faculty(){}

    private faculty(String fullname, String email, String idNumber, String phonenumber, String userID){
        this.fullname = fullname;
        this.email = email;
        this.idNumber = idNumber;
        this.phonenumber = phonenumber;
        this.userID = userID;

    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
