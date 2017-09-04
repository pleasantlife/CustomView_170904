package com.kimjinhwan.android.customview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CustomView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView vw = new MyView(this);
        setContentView(vw);

    }



    //View를 상속받았으며, 생성자와 onDraw 메서드를 재정의해야 함.
    //대부분의 초기화는 부모 클래스가 수행하므로, 생성자는 super 키워드로 부모의 생성자만 호출하면 된다.
    class MyView extends View {
        public MyView(Context context) {
            super(context);
        }

        // 그리기에 필요한 캔버스 객체가 인수로 전달.
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.LTGRAY);
            Paint paint = new Paint();
            canvas.drawPoint(1000, 1000, paint);
            paint.setColor(Color.BLUE);
            canvas.drawLine(20,10,200,50,paint);
            paint.setColor(Color.RED);
            paint.setAntiAlias(true);
            canvas.drawCircle(400,400,300,paint);
            paint.setAntiAlias(false);
            canvas.drawCircle(800,800,300,paint);
            paint.setColor(0x80000ff);
            canvas.drawRect(10,100,200,170,paint);
            paint.setColor(Color.BLACK);
            canvas.drawText("Canvas Text Out", 10, 200, paint);
        }
    }
}
