package com.example.slideshow;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    private final int[] images = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4
    };

    private int currentIndex = 0;

    // Use main looper (recommended)
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final Runnable slideshowRunnable = new Runnable() {
        @Override
        public void run() {
            // Set image
            imageView.setImageResource(images[currentIndex]);

            // Move to next image
            currentIndex = (currentIndex + 1) % images.length;

            // Repeat every 3 seconds
            handler.postDelayed(this, 3000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        // Start slideshow
        handler.post(slideshowRunnable);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Stop slideshow to prevent memory leaks
        handler.removeCallbacks(slideshowRunnable);
    }
}
