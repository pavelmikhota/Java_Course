package com.example.pavelmikhota.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8;
    EditText e1, e2, e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);

        b1.setOnClickListener(plus);
        b2.setOnClickListener(minus);
        b3.setOnClickListener(multiple);
        b4.setOnClickListener(divide);
        b5.setOnClickListener(modXY);
        b6.setOnClickListener(xorXY);
        b7.setOnClickListener(binCode);
        b8.setOnClickListener(toX);
    }

    View.OnClickListener plus = new View.OnClickListener() {
        public void onClick(View v) {

            double x = Double.parseDouble(e1.getText().toString());
            double y = Double.parseDouble(e2.getText().toString());

            String result = Double.toString(x+y);
            e3.setText(result);
        }
    };

    View.OnClickListener minus = new View.OnClickListener() {
        public void onClick(View v) {

            double x = Double.parseDouble(e1.getText().toString());
            double y = Double.parseDouble(e2.getText().toString());

            String result = Double.toString(x-y);
            e3.setText(result);
        }
    };

    View.OnClickListener multiple = new View.OnClickListener() {
        public void onClick(View v) {

            double x = Double.parseDouble(e1.getText().toString());
            double y = Double.parseDouble(e2.getText().toString());

            String result = Double.toString(x*y);
            e3.setText(result);
        }
    };

    View.OnClickListener divide = new View.OnClickListener() {
        public void onClick(View v) {

            double x = Double.parseDouble(e1.getText().toString());
            double y = Double.parseDouble(e2.getText().toString());

            String result = Double.toString(x/y);
            e3.setText(result);
        }
    };

    View.OnClickListener modXY = new View.OnClickListener() {
        public void onClick(View v) {

            int X = Integer.parseInt(e1.getText().toString());
            int Y = Integer.parseInt(e2.getText().toString());

            int Res = X % Y;

            String result = Integer.toString(Res);
            e3.setText(result);

        }
    };

    View.OnClickListener xorXY = new View.OnClickListener() {
        public void onClick(View v) {

            int X = Integer.parseInt(e1.getText().toString());
            int Y = Integer.parseInt(e2.getText().toString());

            int Res = X^Y;
            String result = Integer.toString(Res);
            e3.setText(result);
        }
    };

    View.OnClickListener binCode = new View.OnClickListener() {
        public void onClick(View v) {

            int X=Integer.parseInt(e1.getText().toString());
            String s = Integer.toBinaryString(X);

            e3.setText(s);
        }
    };

    View.OnClickListener toX = new View.OnClickListener() {
        public void onClick(View v) {
            e1.setText(e3.getText().toString());
        }
    };
}
