package com.kimjinhwan.android.customview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DrawBitmap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoadBitmap bitmap = new LoadBitmap(this);

        setContentView(bitmap);
    }

    class LoadBitmap extends View {

        public LoadBitmap(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.LTGRAY);
            Paint paint = new Paint();

            Resources res = getResources();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) res.getDrawable(R.drawable.test);
            Bitmap bit = bitmapDrawable.getBitmap();

            canvas.drawBitmap(bit, 10, 10, null);
        }
    }
}
