package com.example.b217063675;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sarah extends AppCompatActivity {

    EditText user, password;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarah);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logout) {
            Toast.makeText(getApplicationContext(), "logout succefully", Toast.LENGTH_LONG).show();
        } else if (id == android.R.id.home) {
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}