package com.example.mathematics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Palindrome extends AppCompatActivity {

    private EditText num;
    private Button btnCheck;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        num=findViewById(R.id.palin);
        btnCheck=findViewById(R.id.palinbutton);
        result=findViewById(R.id.palResult);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(num.getText()))
                {
                    num.setError("Please enter number");
                    num.requestFocus();
                    return;
                }

                int number,check=0,n;
                number= Integer.parseInt(num.getText().toString());
                n=number;

                PalindromeArith pa=new PalindromeArith(number,check,n);
                check=pa.checkPal();
                if(check==0)
                {
                    result.setText("The number isn't palindrome");
                }
                else
                {
                    result.setText("The number is palindrome");
                }

            }
        });



    }





}
