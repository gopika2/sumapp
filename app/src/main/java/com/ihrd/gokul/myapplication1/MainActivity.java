package com.ihrd.gokul.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,tres;
    Button b,a;
    String getnum1,getnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.num1);
        ed2=(EditText)findViewById(R.id.num2);
        tres=(EditText)findViewById(R.id.tres);
        b=(Button)findViewById(R.id.res);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getnum1=getnum1

            }
        });
        a=(Button)findViewById(R.id.nt);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"next",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),WelcomeActivity.class);
                startActivity(i);
            }
        });


    }
}
