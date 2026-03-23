package com.example.myview;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable edge-to-edge display
        EdgeToEdge.enable(this);

        // Create custom view
        MyClass view = new MyClass(this);

        // Set the custom view as content
        setContentView(view);

        // If using XML layout instead:
        // setContentView(R.layout.activity_main);
    }
}