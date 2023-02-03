package com.example.mfdgworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {


    EditText fName,fEmail,fMobile,fPassword;
    Button fSignupbutton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        fName=findViewById(R.id.name);
        fEmail=findViewById(R.id.email);
        fMobile=findViewById(R.id.mobile);
        fPassword=findViewById(R.id.password);
        fSignupbutton=findViewById(R.id.sign_up_btn);
    }
}
