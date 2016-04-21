package com.example.stllpt017.simple_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResistorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistor);

        final TextView name = (TextView) findViewById(R.id.rname);
        final TextView email = (TextView) findViewById(R.id.lpassword);
        final TextView password = (TextView) findViewById(R.id.lpassword);

        final Button rbutton = (Button) findViewById(R.id.rbutton);

    }
    public void gotoLogin(View view){
        Intent i_gotoLogin =new Intent(ResistorActivity.this, LoginActivity.class);
        startActivity(i_gotoLogin);
    }
}
