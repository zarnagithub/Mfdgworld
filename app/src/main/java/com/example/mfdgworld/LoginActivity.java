package com.example.mfdgworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    EditText fUsername,fPassword;
    Button floginbutton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        fUsername=findViewById(R.id.user_name);
        fPassword=findViewById(R.id.password);
        floginbutton=findViewById(R.id.login_btn);

        Toast.makeText(getApplicationContext(),"username:"+fUsername.getText().toString()+", Password:"+fPassword.getText().toString(),Toast.LENGTH_LONG);

    }
}
