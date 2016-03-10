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
import android.widget.TextView;
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
				Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
				intent.putExtra("text", ((TextView)findViewById(R.id.textView1)).getText());
				startActivity(intent);
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
		
		Button button3 = (Button)findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View paramView) {
				i++;
				TextView textView = (TextView)findViewById(R.id.textView1);
				textView.setText("you have clicked this button "+i+" times!");
			}
		});
		
		Button button4 = (Button)findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View paramView) {
				Intent intent = new Intent(MainActivity.this, ActivityLifeCycle.class);
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
