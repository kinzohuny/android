package com.example.test;

import android.app.Activity;
import android.os.Bundle;

public class ActivityLifeCycleDialog extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_life_cycle_dialog);
	}
}
