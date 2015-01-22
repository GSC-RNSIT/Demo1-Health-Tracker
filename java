package com.example.helloworld;


import android.support.v7.app.ActionBarActivity;


import android.os.Bundle;


import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;



public class MainActivity extends ActionBarActivity
 {
	
	EditText edit;
    
	TextView text;
    
	@Override
   
	 protected void onCreate(Bundle savedInstanceState)
	 {	
        
		super.onCreate(savedInstanceState);
       
 		setContentView(R.layout.activity_main);
        
      
 		 edit = (EditText) findViewById(R.id.editText);
      
		  text = (TextView) findViewById(R.id.textView1);
    
    		Button b = (Button) findViewById(R.id.button_show);
      
  		b.setOnClickListener(new OnClickListener(){

		
		@Override
			
		public void onClick(View v) {
	
			
		
			String name = edit.getText().toString();
	
			
				
			text.append(name);
			
		}
        	
   
   	  });
 
   	}


  
  
}
