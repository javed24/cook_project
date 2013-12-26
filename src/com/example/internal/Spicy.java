package com.example.internal;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Spicy extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spicy);
    }
    public void korma(View v){
    	Intent k=new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://www.spicytasty.com/breakfast-menu/tomato-korma-thakkali-kuruma/"));
		
		startActivity(k);
	}
    public void three(View v){
    	Intent t=new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://chinese.food.com/recipe/three-cup-chicken-83475"));
		
		startActivity(t);
	}
    public void steam(View v){
    	Intent steamed=new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://www.virtualbangladesh.com/ranna/fish/bhapa-chingri-steamed-shrimp-with-mustard-and-green-chili/"));
		
		startActivity(steamed);
	}
    public void sau(View v){
    	Intent kosha=new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://www.virtualbangladesh.com/ranna/meats-beef-lamb-etc/kosha-mansho-sauteed-mutton/"));
		
		startActivity(kosha);
	}
    public void rui(View v){
    	Intent rui=new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://www.virtualbangladesh.com/ranna/fish/rui-fish-in-a-spicy-tomato-and-onion-sauce/"));
		
		startActivity(rui);
	}
    public void beef(View v){
    	Intent goru=new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://www.virtualbangladesh.com/ranna/meats-beef-lamb-etc/bengali-beef-cabernet/"));
		
		startActivity(goru);
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.spicy, menu);
        return true;
    }
    
}
