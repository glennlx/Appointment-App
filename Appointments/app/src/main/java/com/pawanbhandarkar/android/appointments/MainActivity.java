package com.pawanbhandarkar.android.appointments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /*
    TODO: Homepage
    Doctor's Name and Photograph
    Book appointment button:
    Enter patient details
    Book & Pay button
    Displays pop up to confirm details
    Confirm button
    Takes you to Payment
    */
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton = findViewById(R.id.login_button);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoctorsActivity.class);
                startActivity(intent);
            }
        });
    }
}
