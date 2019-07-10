package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText numOne,numTwo;
    Button add,subtract,divide,multiply;
    int num1,num2;
    double jibu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.result);
        numOne=findViewById(R.id.numOne);
        numTwo=findViewById(R.id.numTwo);
        add=findViewById(R.id.btnAdd);
        subtract=findViewById(R.id.btnSubtract);
        divide=findViewById(R.id.btnDivide);
        multiply=findViewById(R.id.btnMultuply);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numOne.getText().length()!=0 &&numTwo.getText().length()!=0){
                num1=Integer.parseInt(numOne.getText().toString());
                num2=Integer.parseInt(numTwo.getText().toString());

                jibu= num1 + num2;
               result.setText(String.valueOf(jibu));

                // Ndo zirudi kwa default after umeinput data
               numOne.setText("");
               numTwo.setText("");}
                else {
                    Toast.makeText(MainActivity.this, "Enter Numbers correctly!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numOne.getText().length()!=0 &&numTwo.getText().length()!=0){
                    num1=Integer.parseInt(numOne.getText().toString());
                    num2=Integer.parseInt(numTwo.getText().toString());

                    jibu= num1 - num2;
                    result.setText(String.valueOf(jibu));

                    // Ndo zirudi kwa default after umeinput data
                    numOne.setText("");
                    numTwo.setText("");}
                else {
                    Toast.makeText(MainActivity.this, "Enter Numbers correctly!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numOne.getText().length()!=0 &&numTwo.getText().length()!=0){
                    num1=Integer.parseInt(numOne.getText().toString());
                    num2=Integer.parseInt(numTwo.getText().toString());

                    jibu= num1 * num2;
                    result.setText(String.valueOf(jibu));

                    // Ndo zirudi kwa default after umeinput data
                    numOne.setText("");
                    numTwo.setText("");}
                else {
                    Toast.makeText(MainActivity.this, "Enter Numbers correctly!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numOne.getText().length()!=0 &&numTwo.getText().length()!=0){
                    num1=Integer.parseInt(numOne.getText().toString());
                    num2=Integer.parseInt(numTwo.getText().toString());

                    jibu= num1 / num2;
                    result.setText(String.valueOf(jibu));

                    // Ndo zirudi kwa default after umeinput data
                    numOne.setText("");
                    numTwo.setText("");}
                else {
                    Toast.makeText(MainActivity.this, "Enter Numbers correctly!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
