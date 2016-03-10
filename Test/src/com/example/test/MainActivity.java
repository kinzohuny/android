package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	int i;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Log.d("MainActivity", "onCreate is running!");
		i=0;
		
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				i++;
				Toast.makeText(MainActivity.this, "you have clicked this button "+i+" times!", Toast.LENGTH_SHORT).show();
				if(i%3==0){
					Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
					startActivity(intent);
				}
			}
		});
		
		Button button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View paramView) {
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));
				startActivity(intent);
				
			}
		});
	}

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
		switch (id) {
		case R.id.item_add:
			Toast.makeText(MainActivity.this, "you have selected \"add\"!", Toast.LENGTH_SHORT).show();
			break;
		case R.id.item_remove:
			Toast.makeText(MainActivity.this, "you have selected \"remove\"!", Toast.LENGTH_SHORT).show();
			break;
		case R.id.item_exit:
			finish();
			break;
		default:
			break;
		}
		
		return true;
	}
}
