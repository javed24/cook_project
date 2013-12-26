package com.example.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Desserts extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_desserts);
	}
	public void cheese(View arg0) {
		
		Intent i=new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.jamieoliver.com/recipes/cheese-recipes/my-nyc-cheesecake"));
		
		startActivity(i);
	}
public void cran(View arg0) {
		
		Intent i2=new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.jamieoliver.com/recipes/fruit-recipes/sour-cranberry-bakewell"));
		
		startActivity(i2);
	}
public void sun(View arg0) {
	
	Intent i3=new Intent(Intent.ACTION_VIEW,
			Uri.parse("http://www.jamieoliver.com/recipes/fruit-recipes/christmas-ice-cream-sundae"));
	
	startActivity(i3);
}

public void salad(View arg0) {
	
	Intent i4=new Intent(Intent.ACTION_VIEW,
			Uri.parse("http://www.jamieoliver.com/recipes/fruit-recipes/mojito-fruit-salad"));
	
	startActivity(i4);
}

public void yoga(View arg0) {
	
	Intent i5 = new Intent(Intent.ACTION_VIEW,
			Uri.parse("http://www.jamieoliver.com/recipes/fruit-recipes/strawberries-with-yoghurt-prosecco-and-shortbread"));
	
	startActivity(i5);
}
public void tart(View arg0) {
	
	Intent i6 = new Intent(Intent.ACTION_VIEW,
			Uri.parse("http://www.jamieoliver.com/recipes/fruit-recipes/toffee-apple-tart"));
	
	startActivity(i6);
}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.desserts, menu);
		return true;
	}

}
