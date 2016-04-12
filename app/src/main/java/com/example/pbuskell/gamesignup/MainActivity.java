package com.example.pbuskell.gamesignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLogout;
    EditText Name,Username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText) findViewById(R.id.Name);
        Username=(EditText) findViewById(R.id.Username);
        btnLogout=(Button)   findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(this);

    }

}

