package com.example.stllpt017.simple_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView name = (TextView) findViewById(R.id.rname);
        final TextView email = (TextView) findViewById(R.id.lpassword);
        final TextView password = (TextView) findViewById(R.id.lpassword);

        final Button rbutton = (Button) findViewById(R.id.rbutton);

    }

    public void gotoResistor(View view){
        Intent nextPage = new Intent(LoginActivity.this, ResistorActivity.class);
        startActivity(nextPage);
    }
}

