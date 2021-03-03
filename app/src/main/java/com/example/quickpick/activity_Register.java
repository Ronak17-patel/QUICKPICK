package com.example.quickpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class activity_Register extends AppCompatActivity {


    EditText email_v,password_v,name_v;
    Button re,login;
    String email_string,password_string,name_string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email_v=findViewById(R.id.email);
        password_v=findViewById(R.id.password);
        name_v=findViewById(R.id.name);
        re=findViewById(R.id.reg);
        login=findViewById(R.id.login);

        click();
    }

    private void click() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(activity_Register.this,activity_mainpage.class);
                startActivity(move);
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }

            private void validate() {
                email_string=email_v.getText().toString();
                password_string=password_v.getText().toString();
                name_string=name_v.getText().toString();

                if(email_string.isEmpty())
                {
                    email_v.setError("please Enter a email");
                }
                if(password_string.isEmpty())
                {
                    password_v.setError("please enter a password");

                }
                if(name_string.isEmpty())
                {
                    name_v.setError("please enter a name");
                }
                else
                {
                    Intent move=new Intent(activity_Register.this,MainActivity_Dash.class);
                    startActivity(move);

                }

            }
        });
    }



}