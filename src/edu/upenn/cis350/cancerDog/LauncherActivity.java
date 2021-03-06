package edu.upenn.cis350.cancerDog;

import edu.upenn.cis350.cancerDog.RandomizeActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class LauncherActivity extends Activity {
	
	public static final int ButtonClickActivity_ID = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launcher);
	}
	
	public void onLaunchButtonClick (View v) {
		//setContentView(new WheelView(this));
		Intent i = new Intent(this, PreRandomizeActivity.class);
		
		startActivityForResult(i,ButtonClickActivity_ID);
	}
	
	public void onExitButtonClick (View v) {
		finish();
        System.exit(0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launcher, menu);
		return true;
	}

}
