package com.example.databinding.model;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.widget.TextView;

public class User {
    public String firstName;
    public String lastName;
    public String alamat;
    public int nomorHp;

    public User (String firstName, String lastName,String alamat,int nomorHp){
        this.firstName = firstName;
        this.lastName = lastName;
        this.alamat = alamat;
        this.nomorHp = nomorHp;


    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getNomorHp() {
        return nomorHp;
    }

//    untuk mengatasi yang type data nya integer
    @BindingAdapter("android:text")
    public static void setText(TextView view, int value) {
        view.setText(Integer.toString(value));
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static int getText(TextView view) {
        return Integer.parseInt(view.getText().toString());
    }
}
