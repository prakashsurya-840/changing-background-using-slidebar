package com.example.changeofbgwithseekbar;

import android.os.Bundle;
import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.view.Menu;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
   SeekBar sk1,sk2,sk3;
   RelativeLayout rl;
   int red,blue,green;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sk1=(SeekBar) findViewById(R.id.seekBar1);
		sk1.setMax(255);
		sk2=(SeekBar) findViewById(R.id.seekBar2);
		sk2.setMax(255);
		sk3=(SeekBar) findViewById(R.id.seekBar3);
		sk3.setMax(255);
		rl=(RelativeLayout) findViewById(R.id.layout);
		sk1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, "Stop changing color", Toast.LENGTH_SHORT).show();	
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Start changing color", Toast.LENGTH_SHORT).show();	
					
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				// TODO Auto-generated method stub
	         red=progress;
	         rl.setBackgroundColor(Color.rgb(red,green,blue));
				
			}
		});
      sk2.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, "Stop changing color", Toast.LENGTH_SHORT).show();	
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Start changing color", Toast.LENGTH_SHORT).show();	
					
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				// TODO Auto-generated method stub
	         blue=progress;
	         rl.setBackgroundColor(Color.rgb(red,green,blue));
				
			}
		});
    sk3.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
	
	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
	Toast.makeText(MainActivity.this, "Stop changing color", Toast.LENGTH_SHORT).show();	
	}
	
	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		Toast.makeText(MainActivity.this, "Start changing color", Toast.LENGTH_SHORT).show();	
			
	}
	
	@Override
	public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
		// TODO Auto-generated method stub
     green=progress;
     rl.setBackgroundColor(Color.rgb(red,green,blue));
		
	}
});
		}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
