package com.example.mfdgworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class ElectricitySubclass2Activity extends AppCompatActivity{



    EditText fCustomername,fAmount;
    Button fValidate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electricity_sub_category2);
        fCustomername=findViewById(R.id.name);
        fAmount=findViewById(R.id.amount);
        fValidate=findViewById(R.id.validate);
    }
}
