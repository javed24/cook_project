package com.example.internal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class InternalStore extends Activity implements OnClickListener {
	
	Button save;
	EditText filename, note;
	String file,body;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_internal_store);
		save = (Button)findViewById(R.id.button1);
		save.setOnClickListener(this);
		filename = (EditText)findViewById(R.id.editText1);
		note = (EditText)findViewById(R.id.editText2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.internal_store, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		file = filename.getText().toString();
		if(file.contentEquals("")){
			file = "untitled";
		}
		body = note.getText().toString();
		
		try {
			FileOutputStream fos = openFileOutput(file, Context.MODE_PRIVATE);
			fos.write(body.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

