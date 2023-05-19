package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        EditText et = (EditText) findViewById(R.id.et);
        TextView tv = (TextView) findViewById(R.id.tv);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name = et.getText().toString();
                if(name.trim().length() > 0){
                    Intent intent = new Intent(MainActivity.this, welcomeScreen.class);
                    intent.putExtra("Name", name);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "The input should not be empty", Toast.LENGTH_SHORT).show();
                }
                et.setText("");
            }
        });
    }
}