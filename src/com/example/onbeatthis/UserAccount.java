package com.example.onbeatthis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class UserAccount extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_profile);
	}

	 public void goSongSelection(View view) {	
			Intent intent = new Intent(this, SelectSong.class);		
			startActivity(intent);		
		}
	 public void goMain(View view) {	
			Intent intent = new Intent(this, MainActivity.class);		
			startActivity(intent);		
		}
	 public void goMusicStore(View view) {	
			Intent intent = new Intent(this, SelectSong.class);		
			startActivity(intent);		
		}
	 

}
