package com.pallav.example.testingsam;

import android.R.integer;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class duplicate1 extends ActionBarActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.duplicate1);

		Button b5 = (Button)findViewById(R.id.btn5);

		b5.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub


				TextView tv1 = (TextView) findViewById(R.id.txt2);
				TextView tv2 = (TextView) findViewById(R.id.txt4);
				TextView tv3 = (TextView) findViewById(R.id.txt6);

				EditText height = (EditText) findViewById(R.id.txt3);
				EditText weight = (EditText) findViewById(R.id.txt5);
				EditText ans = (EditText) findViewById(R.id.txt7);  

				//String Strheight = height.getText().toString();
				//String Strweight = height.getText().toString();
				
				String strheight = height.getText().toString();
				String strweight = weight.getText().toString();

	              if(height.getText().toString().equals("")||weight.getText().toString().equals(""))
					{
						Toast.makeText(getApplicationContext(), "Please Enter the required values", Toast.LENGTH_LONG).show();
					}	
					else
					{
 
				int bmi1 = Integer.parseInt(height.getText().toString());

				int bmi2 =  Integer.parseInt(weight.getText().toString());
				
				
				ans.setTextSize(20);
				ans.setTextColor(Color.RED);
				
		       // float bmi3  = Float.parseFloat(ans.getText().toString());
		        
		        
                 
				
                 ans.setText(" " +String.valueOf(bmi2/(bmi1*bmi1)));
			}
		};
	});




}}









