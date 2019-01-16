package com.student.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b1,b2;
String stdid="mzc";
String pass="college";
String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.stdid);
        e2=(EditText)findViewById(R.id.Password);
        b1=(Button)findViewById(R.id.loginbutton);
        b2=(Button)findViewById(R.id.registration);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if((s1.equals(stdid)) && (s2.equals(pass)) ){
                    Intent e = new Intent(getApplicationContext(),WelcomeActivity.class);
                    startActivity(e);
                }
                else{
                    Toast.makeText(getApplicationContext(),"You are not Authorized",Toast.LENGTH_LONG).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),RegistrationActivity.class);
                startActivity(i);
            }
        });


    }
}
