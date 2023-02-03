package com.example.mfdgworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class ElectricitySubCategoryActivity extends AppCompatActivity{



    Button fProceed;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electricity_sub_category);
        fProceed=findViewById(R.id.proceed);
    }
}
