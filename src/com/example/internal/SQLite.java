package com.example.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SQLite extends Activity implements OnClickListener {

	Button sqlUpdate, sqlView, sqlModify, sqlGetInfo, sqlDelete;
	EditText sqlName, sqlPoriman, sqlRow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sqliteexample);
		sqlUpdate = (Button) findViewById(R.id.bSQLUpdate);
		sqlName = (EditText) findViewById(R.id.etSQLName);
		sqlPoriman = (EditText) findViewById(R.id.etSQLPoriman);

		sqlView = (Button) findViewById(R.id.bSQLopenView);
		sqlView.setOnClickListener(this);
		sqlUpdate.setOnClickListener(this);

		sqlRow = (EditText) findViewById(R.id.etSQLrowInfo);
		sqlModify = (Button) findViewById(R.id.bSQLmodify);
		sqlGetInfo = (Button) findViewById(R.id.bgetInfo);
		sqlDelete = (Button) findViewById(R.id.bSQLdelete);
		sqlDelete.setOnClickListener(this);
		sqlModify.setOnClickListener(this);
		sqlGetInfo.setOnClickListener(this);

	}

	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		switch (arg0.getId()) {
		case R.id.bSQLUpdate:

			boolean didItWork = true;
			try {
				String name = sqlName.getText().toString();
				String poriman = sqlPoriman.getText().toString();

				Poriman entry = new Poriman(SQLite.this);
				entry.open();
				entry.createEntry(name, poriman);
				entry.close();

			} catch (Exception e) {
				didItWork = false;
				String error = e.toString();
				Dialog d = new Dialog(this);
				d.setTitle("Failed!");
				TextView tv = new TextView(this);
				tv.setText(error);
				d.setContentView(tv);
				d.show();
			} finally {
				if (didItWork) {
					Dialog d = new Dialog(this);
					d.setTitle("Perfect!");
					TextView tv = new TextView(this);
					tv.setText("Successfully updated the database!");
					d.setContentView(tv);
					d.show();
				}
			}

			break;
		case R.id.bSQLopenView:
			Intent i = new Intent(this, SQLView.class);
			startActivity(i);
			break;
		case R.id.bgetInfo:
			try {
				String s = sqlRow.getText().toString();
				long l = Long.parseLong(s);
				Poriman hon = new Poriman(this);
				hon.open();
				String returnedName = hon.getName(l);
				String returnedPoriman = hon.getPoriman(l);
				hon.close();

				sqlName.setText(returnedName);
				sqlPoriman.setText(returnedPoriman);
			} catch (Exception e) {

				String error = e.toString();
				Dialog d = new Dialog(this);
				d.setTitle("Failed!!");
				TextView tv = new TextView(this);
				tv.setText(error);
				d.setContentView(tv);
				d.show();
			}
			break;

		case R.id.bSQLmodify:
			try {
				String mName = sqlName.getText().toString();
				String mPoriman = sqlPoriman.getText().toString();
				String sRow = sqlRow.getText().toString();
				long lRow = Long.parseLong(sRow);

				Poriman ex = new Poriman(this);
				ex.open();
				ex.updateEntry(lRow, mName, mPoriman);
				ex.close();
			} catch (Exception e) {

				String error = e.toString();
				Dialog d = new Dialog(this);
				d.setTitle("Error");
				TextView tv = new TextView(this);
				tv.setText(error);
				d.setContentView(tv);
				d.show();
			}
			break;
		case R.id.bSQLdelete:
			try {
				String sRow1 = sqlRow.getText().toString();
				long lRow1 = Long.parseLong(sRow1);
				Poriman ex1 = new Poriman(this);
				ex1.open();
				ex1.deleteEntry(lRow1);
				ex1.close();
			} catch (Exception e) {
				
				String error = e.toString();
				Dialog d = new Dialog(this);
				d.setTitle("Error");
				TextView tv = new TextView(this);
				tv.setText(error);
				d.setContentView(tv);
				d.show();
			}
			break;
		}
	}
}

