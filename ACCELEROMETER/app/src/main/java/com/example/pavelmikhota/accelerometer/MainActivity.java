package com.example.pavelmikhota.accelerometer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager SM;
    Sensor accel;
    TextView result, maxResult;
    Button reset;

    float x,y,z,maxX,maxY,maxZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.angry_bird);
        SM = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accel = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        reset = (Button) findViewById(R.id.button);
        reset.setOnClickListener(res);
        result = (TextView) findViewById(R.id.textView);
        maxResult = (TextView) findViewById(R.id.textView2);


    }

    View.OnClickListener res = new View.OnClickListener() {
        public void onClick(View v) {
            maxX = 0;
            maxY = 0;
            maxZ = 0;
        }
    };

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        x = event.values[0];
        y = event.values[1];
        z = event.values[2];

        result.setText(String.valueOf(x)+" "+(y)+" "+(z));

        if (x > maxX) maxX = x; maxResult.setText(String.valueOf(maxX)+" "+(maxY)+" "+(maxZ));
        if (y > maxY) maxY = y; maxResult.setText(String.valueOf(maxX)+" "+(maxY)+" "+(maxZ));
        if (z > maxZ) maxZ = z; maxResult.setText(String.valueOf(maxX)+" "+(maxY)+" "+(maxZ));

    }

    @Override
    protected void onResume() {
        super.onResume();
        SM.registerListener(this, accel, SensorManager.SENSOR_DELAY_NORMAL);
    }

}
