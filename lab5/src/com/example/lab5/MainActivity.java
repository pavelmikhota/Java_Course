package com.example.lab5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

	TextView txt;
	Button btn;
	
	int count;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.textView1);
        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(obrabotka);       
    }
    
    OnClickListener obrabotka = new OnClickListener() {
    	public void onClick(View v) {
    		if(btn instanceof Button){
                count++;
                txt.setText("Увеличено на " + count*10 + " px");
                btn.setWidth(count*10);
        		btn.setHeight(count*10);
        		btn.setTextSize(count);
            } 		
    		
    	}
    	};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
