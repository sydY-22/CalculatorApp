package edu.cse470.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAddButton();
        initSubtractButton();
        initMultiplyButton();
        initDivideButton();
    }

    private void initAddButton() {
        Button displayButton = findViewById(R.id.addButton);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editNumber1 = (EditText)findViewById(R.id.editTextNumberDecimal);
                EditText editNumber2 = (EditText)findViewById(R.id.editTextNumberDecimal2);
                TextView resultDisplay = findViewById(R.id.resultText);
                float num1 = Float.parseFloat(editNumber1.getText().toString());
                float num2 = Float.parseFloat(editNumber2.getText().toString());
                //float result = num1 + num2;
                String resultString = Float.toString(num1 + num2);
                resultDisplay.setText(resultString);
            }
        });
    }

    private void initSubtractButton() {
        Button displayButton = findViewById(R.id.subtractButton);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editNumber1 = (EditText)findViewById(R.id.editTextNumberDecimal);
                EditText editNumber2 = (EditText)findViewById(R.id.editTextNumberDecimal2);
                TextView resultDisplay = findViewById(R.id.resultText);
                float num1 = Float.parseFloat(editNumber1.getText().toString());
                float num2 = Float.parseFloat(editNumber2.getText().toString());
                //float result = num2 - num1;
                String resultString = Float.toString(num2 - num1);
                resultDisplay.setText(resultString);
            }
        });
    }

    private void initMultiplyButton() {
        Button displayButton = findViewById(R.id.multiplyButton);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editNumber1 = (EditText)findViewById(R.id.editTextNumberDecimal);
                EditText editNumber2 = (EditText)findViewById(R.id.editTextNumberDecimal2);
                TextView resultDisplay = findViewById(R.id.resultText);
                float num1 = Float.parseFloat(editNumber1.getText().toString());
                float num2 = Float.parseFloat(editNumber2.getText().toString());
                //float result = num1 * num2;
                String resultString = Float.toString(num1 * num2);
                resultDisplay.setText(resultString);

            }
        });
    }

    private void initDivideButton() {
        Button displayButton = findViewById(R.id.divideButton);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText editNumber1 = (EditText)findViewById(R.id.editTextNumberDecimal);
                EditText editNumber2 = (EditText)findViewById(R.id.editTextNumberDecimal2);
                TextView resultDisplay = findViewById(R.id.resultText);
                float num1 = Float.parseFloat(editNumber1.getText().toString());
                float num2 = Float.parseFloat(editNumber2.getText().toString());
                try {
                    String resultString = Float.toString(divide(num1,num2));
                    resultDisplay.setText(resultString);
                }
                catch (ArithmeticException e) {
                    resultDisplay.setText("Not Possible");
                }
            }
            public float divide(float num1, float num2) {
                if (num2 == 0.0f) {
                    throw new ArithmeticException("Not Possible");
                }
                return num1 / num2;
            }
        });
    }
}