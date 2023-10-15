package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Username = (TextView) findViewById(R.id.Username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbutton);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                if(Username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESFUL", Toast.LENGTH_SHORT).show();
        }else
            //incorrect
            Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
        }
        });

    }
}