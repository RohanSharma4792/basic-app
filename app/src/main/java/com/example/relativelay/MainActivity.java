package com.example.relativelay;
import android.os.Bundle;

import android.app.Activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends Activity {
    EditText input1,input2;
    TextView textView;
    Button button;
    ToggleButton toggle;
    ImageView image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        textView = findViewById(R.id.textView);
        toggle = findViewById(R.id.toggle);
        image2 = findViewById(R.id.image2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = input1.getText().toString();
                String s2 = input2.getText().toString();
                int n = Integer.parseInt(s1);
                int m = Integer.parseInt(s2);
                int result = n + m;
                String str = String.valueOf(result);
                textView.setText("the answer is " + str);
                Toast.makeText(MainActivity.this, "hello there!!", Toast.LENGTH_SHORT).show();

            }
        });
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            image2.setVisibility(View.INVISIBLE);
            }
        });
    }
}