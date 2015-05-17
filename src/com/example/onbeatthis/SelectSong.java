package com.example.onbeatthis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class SelectSong extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_song);
	}
	
	public void goUserProfile(View view) {	
			Intent intent = new Intent(this, UserAccount.class);		
			startActivity(intent);		
		}
	 
	 public void toPlayMode(View view){
	    	Intent intent = new Intent(this, Play.class);		
			startActivity(intent);  
	    }


}
