package com.example.mfdgworld;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class LayoutActivity extends AppCompatActivity{



    Button fRecharge,fElectricity,fWater,fRental,fHousingsociety,fGas,fClubsandassociations,fLandline,fMobilepostpaid,fEducation,fJobs,fDth,fBills,fCreditcards,fMunicipleservice,fComplaint,fPaymenthistory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        fRecharge=findViewById(R.id.recharge);
        fElectricity=findViewById(R.id.electricity);
        fWater=findViewById(R.id.water);
        fRental=findViewById(R.id.rental);
        fHousingsociety=findViewById(R.id.housing_society);
        fGas=findViewById(R.id.gas);
        fClubsandassociations=findViewById(R.id.clubs_n_association);
        fLandline=findViewById(R.id.landline);
        fMobilepostpaid=findViewById(R.id.mobile_postpaid);
        fEducation=findViewById(R.id.education);
        fJobs=findViewById(R.id.jobs);
        fDth=findViewById(R.id.dth);
        fBills=findViewById(R.id.bills);
        fCreditcards=findViewById(R.id.credit_card);
        fMunicipleservice=findViewById(R.id.municipal_service);
        fComplaint=findViewById(R.id.complaint);
        fPaymenthistory=findViewById(R.id.payment_history);
    }
}
