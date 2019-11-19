package com.nimesh.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText etfirst, etsecond;
    Button add, subtract, multiply;
    Button btnCal;
    TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        etfirst = findViewById(R.id.etfirst);
        etsecond = findViewById(R.id.etsecond);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        btnCal = findViewById(R.id.btnCal);
        tvresult = findViewById(R.id.tvresult);


         btnCal.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                    if (TextUtils.isEmpty(etfirst.getText().toString())) {
            etfirst.setError("Enter first number");
            etfirst.requestFocus();
            return;
        } else if
                    (TextUtils.isEmpty(etsecond.getText().toString())) {
                        etsecond.setError("Enter second number");
                        etsecond.requestFocus();
                        return;
                    }
             }
         });

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int first, second, result1,result2,result3;

            first = Integer.parseInt(etfirst.getText().toString());
            second = Integer.parseInt(etsecond.getText().toString());
            Arithmetic arthmetic = new Arithmetic(first, second);
            result1 = arthmetic.add();
            result2 = arthmetic.subtract();
            result3 = arthmetic.multiply();
            tvresult.setText(Integer.toString(result1));
                tvresult.setText(Integer.toString(result2));
                tvresult.setText(Integer.toString(result3));
        }

    });
}}