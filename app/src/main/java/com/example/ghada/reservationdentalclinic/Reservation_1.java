package com.example.ghada.reservationdentalclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reservation_1 extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_1);

        Button Signup =  findViewById(R.id.Signup);
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                intent = new Intent(Reservation_1.this,Signup.class);
                startActivity(intent);
            }
        });

        Button Sign_in =  findViewById(R.id.Signin);
        Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                intent = new Intent(Reservation_1.this,Sginin.class);
                startActivity(intent);
            }
        });

    }
    }




