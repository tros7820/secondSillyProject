package com.example.secondsillyproject;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;

public class WeirdActivity extends Activity
{
	private Button appButton;
	 private Button appButton1;
	private TextView appText;
	private ArrayList<Integer> colorList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);
		
		appButton = (Button) findViewById(R.id.blayum);
		appButton1 = (Button) findViewById(R.id.malaceBanana);
		appText = (TextView) findViewById(R.id.textView1);
		colorList = new ArrayList<Integer>();
		
		fillTheColorList();
		setupListeners();
		
	}
	
	private void fillTheColorList()
	{
		colorList.add(R.color.myBlack);
		colorList.add(R.color.myWhite);
		colorList.add(R.color.myOrange);
		colorList.add(R.color.myBlue);
		colorList.add(R.color.myGreen);
		colorList.add(R.color.myRed);
		colorList.add(R.color.myYellow);
		colorList.add(R.color.myPurple);	
	}
	
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				//Button click stuff goes here
				int randomIndex = (int) (Math.random() * colorList.size());
				
				appButton.setBackgroundResource(colorList.get(randomIndex));
			}
		});
		
		appButton1.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				//Button click stuff goes here
				int randomIndex = (int) (Math.random() * colorList.size());
				
				appButton1.setBackgroundResource(colorList.get(randomIndex));
				appButton1.setBackgroundColor(colorList.get(randomIndex));
			}
		});
	}
	
}
//everything you make in xml goes to R.