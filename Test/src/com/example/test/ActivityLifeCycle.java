package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ActivityLifeCycle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		showToast("onCreate");
		setContentView(R.layout.activity_life_cycle);
		
		Button btn_normal = (Button)findViewById(R.id.button3_1);
		Button btn_dialog = (Button)findViewById(R.id.button3_2);
		
		btn_normal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActivityLifeCycle.this, ActivityLifeCycleNormal.class);
				startActivity(intent);
			}
		});
		
		btn_dialog.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActivityLifeCycle.this, ActivityLifeCycleDialog.class);
				startActivity(intent);
				
			}
		});
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		showToast("onStart");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		showToast("onResume");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		showToast("onPause");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		showToast("onStop");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		showToast("onDestroy");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		showToast("onRestart");
	}
	
	private void showToast(String text){
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
	}
}
