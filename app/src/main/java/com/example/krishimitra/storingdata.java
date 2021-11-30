package com.example.krishimitra;

public class storingdata {
    String username, fullname, Aadharnumber, phonenumber, password;

    public storingdata() {
    }

    public storingdata(String username, String fullname, String aadharnumber, String phonenumber, String password) {
        this.username = username;
        this.fullname = fullname;
        this.Aadharnumber = aadharnumber;
        this.phonenumber = phonenumber;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAadharnumber() {
        return Aadharnumber;
    }

    public void setAadharnumber(String aadharnumber) {
        Aadharnumber = aadharnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
