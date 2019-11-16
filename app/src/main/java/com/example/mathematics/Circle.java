package com.example.mathematics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {

private EditText radius;
private Button btnCalculate;
private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        radius=findViewById(R.id.Radius);
        btnCalculate=findViewById(R.id.btnCalculate);
        result=findViewById(R.id.resultarea);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(radius.getText()))
                {
                    radius.setError("Please Enter the radius");
                    radius.requestFocus();
                    return;
                }

                float r,area;
                r=Integer.parseInt(radius.getText().toString());
                CircleArith circ=new CircleArith(r);
                area=circ.area();
                result.setText((String.valueOf(area)));





            }
        });







    }

}
