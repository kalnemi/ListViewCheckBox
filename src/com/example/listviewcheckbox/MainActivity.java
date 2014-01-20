package com.example.listviewcheckbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity 
{
	String[] countries = new String[]{
			"India",
			"Pakistan",
			"Sri Lanka",
			"China",
			"Bangladesh",
			"Nepal",
			"Afghanistan",
			"North Korea",
			"South Korea",
			"Japan"
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String> ( this, android.R.layout.simple_list_item_multiple_choice, countries );
		ListView listView = (ListView) findViewById( R.id.listView ); 
		listView.setAdapter(adapter);
	}
}