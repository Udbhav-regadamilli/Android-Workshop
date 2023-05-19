package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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

        Button button = (Button) findViewById(R.id.button);
        boolean[] a = {true};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) findViewById(R.id.t1);
                EditText r = (EditText) findViewById(R.id.red);
                EditText g = (EditText) findViewById(R.id.green);
                EditText b = (EditText) findViewById(R.id.blue);
                if(a[0]){
                    t.setText("Changed Text");
                    a[0] = false;
                    t.setTextColor(Color.rgb(Integer.parseInt(r.getText().toString()), Integer.parseInt(g.getText().toString()),Integer.parseInt(b.getText().toString())));
                }else{
                    t.setText("Hello Udbhav");
                    a[0] = true;
                    t.setTextColor(Color.rgb(Integer.parseInt(r.getText().toString()), Integer.parseInt(g.getText().toString()),Integer.parseInt(b.getText().toString())));
                }
                Toast.makeText(getApplicationContext(), "Button Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}