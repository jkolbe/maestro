package com.example.onbeatthis;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;


public class HomePage extends Activity {
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		
	}
	
	
	 public void toPlayMode(View view) {	
		Intent intent = new Intent(this, Play.class);		
		startActivity(intent);		
	 }

}
