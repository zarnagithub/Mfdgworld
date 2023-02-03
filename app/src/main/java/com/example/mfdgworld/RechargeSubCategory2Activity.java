package com.example.mfdgworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class RechargeSubCategory2Activity extends AppCompatActivity{


    EditText fNumber2;
    Button fRecharge;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recharge_sub_category2);
        fNumber2=findViewById(R.id.number2);
        fRecharge=findViewById(R.id.recharge_btn);

    }
}
