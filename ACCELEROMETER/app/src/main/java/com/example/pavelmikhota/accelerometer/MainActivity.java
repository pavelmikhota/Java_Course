package com.example.pavelmikhota.accelerometer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager SM;
    Sensor accel;
    TextView X, Y, Z, maxX, maxY, maxZ;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.angry_bird);
        SM = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accel = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        X = (TextView)findViewById(R.id.textView);
        Y = (TextView)findViewById(R.id.textView2);
        Z = (TextView)findViewById(R.id.textView3);
        maxX = (TextView)findViewById(R.id.textView9);
        maxY = (TextView)findViewById(R.id.textView11);
        maxZ = (TextView)findViewById(R.id.textView13);
        reset = (Button)findViewById(R.id.button);

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        double x = sensorEvent.values[0];
        double y = sensorEvent.values[1];
        double z = sensorEvent.values[2];

        String formattedX = new DecimalFormat("#0.00").format(x);
        String formattedY = new DecimalFormat("#0.00").format(y);
        String formattedZ = new DecimalFormat("#0.00").format(z);

        X.setText(formattedX);
        Y.setText(formattedY);
        Z.setText(formattedZ);

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        SM.registerListener(this, accel, SensorManager.SENSOR_DELAY_NORMAL);
    }

}
