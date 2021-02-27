package com.example.myandroidcalculator;

import androidx.appcompat.app.AppCompatActivity;
 
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // instance variable declarations that refer to the view objects
    TextView textViewNo1;
    TextView textViewNo2;
    TextView textViewResult;

    Button btnPlus;
    Button btnSubtract;
    Button btnMultiply;
    Button btnDivide;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiates instance variables
        textViewNo1 = (TextView) findViewById(R.id.editTextNo1);
        textViewNo2 = (TextView) findViewById(R.id.editTextNo2);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

        btnPlus = (Button) findViewById(R.id.buttonPlus);
        btnSubtract = (Button) findViewById(R.id.buttonSubtract);
        btnMultiply = (Button) findViewById(R.id.buttonMultiply);
        btnDivide = (Button) findViewById(R.id.buttonDivide);
        btnReset = (Button) findViewById(R.id.buttonClear);

        // sets the event handlers
        btnPlus.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);



    } // onCreate

    @Override
    public void onClick(View v) {
        float result = 0.0f;

        // N.B. write a separate method to test if valid numbers are given

        int num1 = Integer.parseInt(textViewNo1.getText().toString());
        int num2 = Integer.parseInt(textViewNo2.getText().toString());

        switch(v.getId()){
            case R.id.buttonPlus:
                result = (num1 + num2);
                break;
            case R.id.buttonSubtract:
                result = (num1 - num2);
                break;
            case R.id.buttonMultiply:
                result = (num1 * num2);
                break;
            case R.id.buttonDivide:
                result = (num1 / num2);
                break;
            case  R.id.buttonClear:
                textViewNo1.setText("");
                textViewNo2.setText("");
                break;

        } // switch

        textViewResult.setText(String.valueOf(result));

    } // onClick


} // class