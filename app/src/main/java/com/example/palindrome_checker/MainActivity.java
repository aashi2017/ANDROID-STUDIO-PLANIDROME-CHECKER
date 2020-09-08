package com.example.palindrome_checker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button myButton;
    private EditText stringInput;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        stringInput = findViewById(R.id.stringInput);
        answer = findViewById(R.id.answer);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(stringInput.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Input can not be empty",Toast.LENGTH_SHORT).show();
                }
                else{
                    String reverse = "";
                    int length = stringInput.length();

                    for(int i=length-1; i>=0; i--){
                        reverse =  reverse + stringInput.getText().charAt(i);
                    }

                    if(stringInput.getText().toString().trim().toLowerCase().equals(reverse.trim().toLowerCase())){
                        answer.setText("String is Palindrome");
                    }
                    else{
                        answer.setText("String is not Palindrome");
                    }
                }
            }
        });
    }
}
