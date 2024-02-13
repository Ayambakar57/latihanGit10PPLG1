package com.example.instagramlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class aritmatikaKalkulator extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Spinner dropdown;
    Button calculate;

    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aritmatika_kalkulator);

        number1 = findViewById(R.id.inputNum1);
        number2 = findViewById(R.id.inputNum2);
        dropdown = findViewById(R.id.spinner);
        calculate = findViewById(R.id.btnCalculate);
        hasil = findViewById(R.id.result);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                String operator = dropdown.getSelectedItem().toString();
                double result = 0;

                if (number1.getText().toString().isEmpty() && number2.getText().toString().isEmpty()) {

                    Toast.makeText(aritmatikaKalkulator.this, "kosong!", Toast.LENGTH_LONG).show();

                }
                else {

                switch (operator) {
                    case "Tambah +":
                        result = num1 + num2;
                        int resultint = (int) result;
                        hasil.setText(resultint + "");
                        break;

                    case "Kurang -":
                        result = num1 - num2;
                        resultint = (int) result;
                        hasil.setText(resultint + "");
                        break;

                    case "Kali x":
                        result = num1 * num2;
                        resultint = (int) result;
                        hasil.setText(resultint + "");
                        break;
                    case "Bagi /":
                        if (num1 == 0 || num2 == 0) {
                            Toast.makeText(aritmatikaKalkulator.this, "Tidak bisa Nol", Toast.LENGTH_LONG).show();
                        } else {
                            result = num1 / num2;
                            hasil.setText(Double.toString(result));
                            break;
                        }
                }



                }
                hasil.setText("Hasil = "+result);
            }
            });




    }




}