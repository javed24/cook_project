package com.example.internal;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Popular extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);
    }
    public void onClickBurger(View v1) {
		
		Intent bur=new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.foodnetwork.com/recipes/giada-de-laurentiis/chicken-burgers-with-garlic-rosemary-mayonnaise-recipe/index.html"));
		
		startActivity(bur);
		
	}
	public void doner(View v2) {
		
		Intent don=new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.taste.com.au/recipes/16732/home+style+doner+kebab"));
		
		startActivity(don);
		
	}
public void dosa(View v3) {
		
		Intent dosa=new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.spicytasty.com/breakfast-menu/mutta-dosa-egg-dosa/"));
		
		startActivity(dosa);
		
	}
public void tikiya(View v4) {
	
	Intent tik=new Intent(Intent.ACTION_VIEW,
			Uri.parse("http://www.virtualbangladesh.com/ranna/kabab/tikya-kabab/"));
	
	startActivity(tik);
	
}
public void shwarma(View v5) {
	
	Intent shw=new Intent(Intent.ACTION_VIEW,
			Uri.parse("http://www.wikihow.com/Make-Chicken-Shawarma-(Arabic-Style)"));
	
	startActivity(shw);
	
}
public void tuna(View v6) {
	
	Intent tun=new Intent(Intent.ACTION_VIEW,
			Uri.parse("http://www.taste.com.au/recipes/7269/spaghetti+with+tuna+sauce"));
	
	startActivity(tun);
	
}





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.popular, menu);
        return true;
    }
    
}
