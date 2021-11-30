package com.example.krishimitra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    TextInputLayout username_var, fullname_var, Aadhar_var, phonenumber_var, password_var;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        username_var = findViewById(R.id.username_text_field_design);
        fullname_var = findViewById(R.id.full_name_text_field_design);
        Aadhar_var = findViewById(R.id.Aadhar_field_design);
        phonenumber_var = findViewById(R.id.phonenumber_text_field_design);
        password_var = findViewById(R.id.password_text_field_design);


    }

    public void loginbuttonclick(View view) {
        Intent intent = new Intent(getApplicationContext(), login.class);
        startActivity(intent);
        finish();
    }

    public void registerbuttonclick(View view) {
        String username_ = username_var.getEditText().getText().toString();
        String fullname_ = fullname_var.getEditText().getText().toString();
        String Aadhar_ = Aadhar_var.getEditText().getText().toString();
        String phonenumber_ = phonenumber_var.getEditText().getText().toString();
        String password_ = password_var.getEditText().getText().toString();

        if (!username_.isEmpty()) {
            username_var.setError(null);
            username_var.setErrorEnabled(false);
            if (!fullname_.isEmpty()) {
                fullname_var.setError(null);
                fullname_var.setErrorEnabled(false);
                if (!Aadhar_.isEmpty()) {
                    Aadhar_var.setError(null);
                    Aadhar_var.setErrorEnabled(false);
                    if (!phonenumber_.isEmpty()) {
                        phonenumber_var.setError(null);
                        phonenumber_var.setErrorEnabled(false);
                        if (!password_.isEmpty()) {
                            password_var.setError(null);
                            password_var.setErrorEnabled(false);



                        } else {
                            password_var.setError("Please enter username");
                        }
                    } else {
                        phonenumber_var.setError("Please enter phone number");
                    }

                } else {
                    Aadhar_var.setError("Please enter Email Id");
                }
            } else {
                fullname_var.setError("Please enter fullname");
            }
        } else {
            username_var.setError("Please enter username");
        }

        firebaseDatabase = FirebaseDatabase.getInstance();
        reference=firebaseDatabase.getReference("datauser");

        String username_s = username_var.getEditText().getText().toString();
        String fullname_s = fullname_var.getEditText().getText().toString();
        String Aadhar_s = Aadhar_var.getEditText().getText().toString();
        String phonenumber_s = phonenumber_var.getEditText().getText().toString();
        String password_s = password_var.getEditText().getText().toString();


        storingdata storingdatass = new storingdata(username_s,fullname_s,Aadhar_s,phonenumber_s,password_s);
        reference.child(username_s).setValue(storingdatass);

        Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),dashboard.class);
        startActivity(intent);
        finish();
    }
}