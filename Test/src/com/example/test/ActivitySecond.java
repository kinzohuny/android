package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivitySecond extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		TextView textView = (TextView)findViewById(R.id.textView2_1);
		textView.setText(getIntent().getStringExtra("text"));
		
		Button button2_1 = (Button)findViewById(R.id.button2_1);
		button2_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View paramView) {
				finish();
			}
		});
	}
	
}
