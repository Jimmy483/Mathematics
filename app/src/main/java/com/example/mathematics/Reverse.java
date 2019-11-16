package com.example.mathematics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Reverse extends AppCompatActivity {
private EditText number;
private Button btnReverse;
private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        number=findViewById(R.id.number);
        btnReverse=findViewById(R.id.btnReverse);
        result=findViewById(R.id.reverView);

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(number.getText()))
                {
                    number.setError("Please enter number");
                    number.requestFocus();
                    return;
                }

                int num,rev=0;
                num= Integer.parseInt(number.getText().toString());

                ReverseArith reve=new ReverseArith(num,rev);
                rev=reve.rev();
                result.setText(Integer.toString(rev));

            }
        });
    }
}
