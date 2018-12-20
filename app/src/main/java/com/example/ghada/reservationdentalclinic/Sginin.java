package com.example.ghada.reservationdentalclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sginin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sginin);

        Button Loginuser = findViewById(R.id.Loginuser);
        Loginuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Sginin.this,HomeClinic.class);
                startActivity(i);
            }
        });
    }
}
