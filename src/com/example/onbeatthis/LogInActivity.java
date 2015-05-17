package com.example.onbeatthis;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;

public class LogInActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log_in);
		// Show the Up button in the action bar.
	}

	
	 public void logUserIn(View view) {	
			Intent intent = new Intent(this, UserAccount.class);		
			startActivity(intent);		
		}
	 public void goHome(View view) {	
			Intent intent = new Intent(this, MainActivity.class);		
			startActivity(intent);		
		}

}

