package com.example.travellayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EstimationActivity extends AppCompatActivity {
private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimation);
        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPaymentActivity();
            }
        });

    }

   public void openPaymentActivity(){
       Intent intent1=new Intent(this,PaymentActivity.class);
       startActivity(intent1);
    }
 }
