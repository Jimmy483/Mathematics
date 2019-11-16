package com.example.mathematics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class Swap extends AppCompatActivity {

    private EditText first;
    private EditText second;
    private Button btnswap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);

        first = findViewById(R.id.txtfirst);
        second = findViewById(R.id.txtSecond);
        btnswap = findViewById(R.id.swap);

        btnswap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(first.getText()))
                {
                    first.setError("Please enter first number");
                }
                else if(TextUtils.isEmpty(second.getText()))
                {
                    second.setError("Please enter second number");
                }

                int a,b;
                a=Integer.parseInt(first.getText().toString());
                b=Integer.parseInt(second.getText().toString());

                SwapArith sa=new SwapArith(a,b);
                a=sa.swapA();
                b=sa.swapB();

                first.setText(Integer.toString(a));
                second.setText(Integer.toString(b));

            }
        });


    }
}
