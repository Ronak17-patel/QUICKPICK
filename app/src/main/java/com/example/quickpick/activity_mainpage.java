package com.example.quickpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class activity_mainpage extends AppCompatActivity {

    Button register;
    EditText email_var,password_var;
    Button submit;
    String e_s, p_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        init();
        click();
    }


    private void init() {
        email_var = findViewById(R.id.E1);
        password_var = findViewById(R.id.E2);
        submit = findViewById(R.id.materialButton2);
        register = findViewById(R.id.materialButton3);
    }

    private void click() {
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(activity_mainpage.this, activity_Register.class);
                startActivity(move);

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();


            }

        });
    }

    private void validate() {
        e_s = email_var.getText().toString();
        p_s = password_var.getText().toString();

        if (e_s.isEmpty()) {
            email_var.setError(" enter a email");

        }

         if (p_s.isEmpty())
        {
            password_var.setError("enter a password");
        }
         else
        {
            Intent move=new Intent(activity_mainpage.this,MainActivity_Dash.class);
            startActivity(move);
        }
        }

    }



