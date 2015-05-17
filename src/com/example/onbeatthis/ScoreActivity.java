package com.example.onbeatthis;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class ScoreActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_score);
		
		Intent myIntent = getIntent(); // gets the previously created intent
		String score = myIntent.getStringExtra("EXTRA_MESSAGE");
		TextView editText = (TextView) findViewById(R.id.StatusTextView);
		editText.setText(score);
	}
	
	public void goUserProfile(View view) {	
		Intent intent = new Intent(this, UserAccount.class);		
		startActivity(intent);		
	}
	
	public void goSongSelection(View view) {	
		Intent intent = new Intent(this, SelectSong.class);		
		startActivity(intent);		
	}
	
	public void playAgain(View view) {	
		Intent intent = new Intent(this, Play.class);		
		startActivity(intent);		
	}
	
	
	
	

}
