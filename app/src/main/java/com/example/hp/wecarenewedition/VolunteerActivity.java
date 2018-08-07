package com.example.hp.wecarenewedition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.hp.ikurenewedition.AfterSplash;
import com.example.hp.ikurenewedition.NetworkActivity;
import com.example.hp.ikurenewedition.R;
import com.google.zxing.integration.android.IntentIntegrator;

public class VolunteerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);

        Button buttonprescription = findViewById(R.id.submit5);
        buttonprescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VolunteerActivity.this, VolunteerActivity.class);
                startActivity(intent);

            }
        });
        Button buttonbp = findViewById(R.id.submit2);
        buttonbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VolunteerActivity.this, BloodPressure.class);
                startActivity(intent);

            }
        });
        Button buttonsugar = findViewById(R.id.submit3);
        buttonsugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VolunteerActivity.this, BloodSugar.class);
                startActivity(intent);

            }
        });
        Button buttonvital = findViewById(R.id.submit4);
        buttonvital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VolunteerActivity.this, VitalReports.class);
                startActivity(intent);

            }
        });
        Button buttonecg = findViewById(R.id.submit1);
        buttonecg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VolunteerActivity.this, VolunteerActivity.class);
                startActivity(intent);

            }
        });
    }
}
