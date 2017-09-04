package com.kimjinhwan.android.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OffScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Ofscreen ofscreen = new Ofscreen(this);
        setContentView(ofscreen);


    }

    class Ofscreen extends View {

        public Ofscreen(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.LTGRAY);
            Paint paint = new Paint();

            Bitmap BackBit = Bitmap.createBitmap(300, 200, Bitmap.Config.ARGB_8888);
            Canvas offScreenCanvas = new Canvas(BackBit);
            offScreenCanvas.drawColor(Color.GREEN);
            paint.setColor(Color.RED);
            for(int x = 0; x < 300; x += 10) {
                offScreenCanvas.drawLine(x,0,300-x,200,paint);
            }
            canvas.drawBitmap(BackBit, 10, 10, null);
        }


    }
}
