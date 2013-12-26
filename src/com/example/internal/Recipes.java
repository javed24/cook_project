package com.example.internal ;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Recipes extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
    }
    public void onClickSpice(View v){
        Intent s=new Intent(this, Spicy.class);
		
		startActivity(s);
	}
    public void OnClickPop(View v){
        Intent pop=new Intent(this, Popular.class);
		
		startActivity(pop);
	}
    public void onClickDes(View v){
        Intent pop=new Intent(this, Desserts.class);
		
		startActivity(pop);
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.recipes, menu);
        return true;
    }
    
}
