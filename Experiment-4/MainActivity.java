package com.example.addition;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button buttonAdd, buttonReset;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonReset = findViewById(R.id.buttonReset);
        textResult = findViewById(R.id.textResult);

        // Add button logic
        buttonAdd.setOnClickListener(v -> {
            String num1 = editText1.getText().toString().trim();
            String num2 = editText2.getText().toString().trim();

            if (!num1.isEmpty() && !num2.isEmpty()) {
                try {
                    double sum = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("Result: " + sum);
                } catch (NumberFormatException e) {
                    textResult.setText("Invalid input!");
                }
            } else {
                textResult.setText("Enter valid numbers");
            }
        });

        // Reset button logic
        buttonReset.setOnClickListener(v -> {
            editText1.setText("");
            editText2.setText("");
            textResult.setText("");
        });
    }
}
