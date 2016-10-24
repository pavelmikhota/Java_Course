package com.example.pavelmikhota.touch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    TextView result;

    double x,y;
    String down, move, up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.textView);
        result.setOnTouchListener(this);
        result = new TextView(this);
        result.setOnTouchListener(this);
        setContentView(result);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        x = event.getX();
        y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                down = "Down: X:" + x + ", Y:" + y;
                move = "";
                up = "";
                break;
            case MotionEvent.ACTION_MOVE:
                move = "Move: X:" + x + ", Y:" + y;
                break;
            case MotionEvent.ACTION_UP:
                move = "";
                up = "Up: X" + x + ", Y:" + y;
                break;
            case MotionEvent.ACTION_CANCEL:
                break;
        }
        result.setText(down + "\n" + up + "\n" + move);
        return true;
    }
}
