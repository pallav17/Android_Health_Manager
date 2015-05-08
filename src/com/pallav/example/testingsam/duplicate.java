package com.pallav.example.testingsam;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;


public class duplicate extends ActionBarActivity implements OnClickListener, android.view.View.OnClickListener
{
    private Button btnStart;
    static final int DATE_START_DIALOG_ID = 0;
    private int startYear=1970;
    private int startMonth=6;
    private int startDay=15;
    private AgeCalculation age = null;
    private TextView currentDate;
    private TextView birthDate;
    private TextView result;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duplicate);
        
        age=new AgeCalculation();
        currentDate=(TextView) findViewById(R.id.textView1);
        currentDate.setText("Current Date(DD/MM/YY) : "+age.getCurrentDate());
        birthDate=(TextView) findViewById(R.id.textView2);
        result=(TextView) findViewById(R.id.textView3);
        btnStart=(Button) findViewById(R.id.button1);
        btnStart.setOnClickListener(this);
      
    }
   
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
        case DATE_START_DIALOG_ID:
            return new DatePickerDialog(this,
                        mDateSetListener,
                        startYear, startMonth, startDay);
         }
        return null;
     }
   
    private DatePickerDialog.OnDateSetListener mDateSetListener 
    = new DatePickerDialog.OnDateSetListener() {
    	public void onDateSet(DatePicker view, int selectedYear,
				int selectedMonth, int selectedDay) {
    		     startYear=selectedYear;
    		 	 startMonth=selectedMonth;
    		 	 startDay=selectedDay;
    		 	 age.setDateOfBirth(startYear, startMonth, startDay);
    		     birthDate.setText("Date of Birth(DD/MM/YY): "+selectedDay+":"+(startMonth+1)+":"+startYear); 		 	 
    	         calculateAge();
    	}
    };
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
		showDialog(DATE_START_DIALOG_ID);
			break;
        
		default:
			break;
		}
	}
	private void calculateAge()
	{       
		age.calcualteYear();
		age.calcualteMonth();
	    age.calcualteDay();
	  	Toast.makeText(getBaseContext(), "click the resulted button"+age.getResult() , Toast.LENGTH_SHORT).show();
	    result.setText("AGE (DD/MM/YY) :"+age.getResult());
	}

	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
}
