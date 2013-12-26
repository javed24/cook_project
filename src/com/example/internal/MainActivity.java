package com.example.internal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void onClickSave(View v){
        Intent i1=new Intent(this, InternalStore.class);
		
		startActivity(i1);

	}
	public void onClickRead(View v){
        Intent i2=new Intent(this, Reading.class);
		
		startActivity(i2);
	}
	public void onClickGro(View v){
		Intent gro = new Intent(this,SQLite.class);
		startActivity(gro);
	}
	public void onClickRecipe(View v){
        Intent r=new Intent(this, Recipes.class);
		
		startActivity(r);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
