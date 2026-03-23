package com.example.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyClass extends View {

    private Paint paint;

    public MyClass(Context context) {
        super(context);

        // Initialize paint with anti-alias for smoother shapes
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 🔵 Draw Line
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(20);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(50, 50, 400, 50, paint);

        // 🟦 Draw Rectangle
        paint.setColor(Color.CYAN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(50, 100, 400, 250, paint);

        // 🟢 Draw Circle
        paint.setColor(Color.GREEN);
        canvas.drawCircle(200, 400, 100, paint);

        // 🔵 Draw another Circle
        paint.setColor(Color.BLUE);
        canvas.drawCircle(500, 600, 100, paint);

        // 🟣 Draw Oval
        paint.setColor(Color.MAGENTA);
        canvas.drawOval(50, 550, 400, 700, paint);

        // 📝 Draw Text
        paint.setColor(Color.GRAY);
        paint.setTextSize(40);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("Graphic Primitives", 80, 800, paint);
    }
}