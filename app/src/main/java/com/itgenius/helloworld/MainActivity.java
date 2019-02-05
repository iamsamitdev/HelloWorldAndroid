package com.itgenius.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // การ Find View
        Button btnSubmit = findViewById(R.id.btnSubmit);

        // Event handle btnSubmit =================================
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //System.out.println("Hello Android");
                // Popup
                Toast.makeText(getApplicationContext(),"Hello Android",Toast.LENGTH_LONG).show();
            }
        });
        // ===================================================

        // การ Find View btnSawadee
        Button btnSawadee = findViewById(R.id.btnSawadee);

        // Event handle =========================================
        btnSawadee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //System.out.println("Hello Android");
                // Popup
                Toast.makeText(getApplicationContext(),"สวัสดีแอนดรอยด์",Toast.LENGTH_LONG).show();
            }
        });
        // ====================================================


    }
}
