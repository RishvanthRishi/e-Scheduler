package com.example.girish.e_scheduler;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Anupam extends AppCompatActivity  {

    String mes1;
    String nam;
    String Roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anupam);
    }
    public void schedule(View view)
    {
        CheckBox box1= (CheckBox)findViewById(R.id.box1);
        CheckBox box2= (CheckBox)findViewById(R.id.box2);
        EditText others= (EditText)findViewById(R.id.box3);
        String other= others.getText().toString();


        if(box1.isChecked())
        {
            mes1= "Hostel related issues";
        }
        else if(box2.isChecked())
        {
            mes1= "Ragging Issues";
        }


        else if (other!=null)
        {
            mes1 = other;
        }
        if(box1.isChecked()&&box2.isChecked())
        {
            mes1= "1.Hostel related issues \n 2.Ragging Issues"  ;

        }


        EditText edittext= (EditText)findViewById(R.id.editText);
        String time= edittext.getText().toString();
        EditText name= (EditText)findViewById(R.id.name);
        nam= name.getText().toString();
        EditText roll= (EditText)findViewById(R.id.rollno);
        Roll= roll.getText().toString();


        String message= "Sir, I want to schedule an appointment with you because i want to discuss with you about the " +
                "following issue/problems:\n" + mes1;
        String mes2 = "Time of appointment : " + time +"\n";
        String mes3 = "Please reply if you are free to schedule the appointment at the specified time.\n";
        String mes4= "Name : " + nam + "\n";
        String mes5 = "Date: " + Roll;
        if((box1.isChecked()||box2.isChecked())|| other!=null) {

            Intent inten = new Intent(Intent.ACTION_SENDTO);
            inten.setData(Uri.parse("mailto:"));
            inten.putExtra(Intent.EXTRA_EMAIL, new String[]{"anupamshukla@gmail.com"});
            inten.putExtra(Intent.EXTRA_SUBJECT, "APPOINTMENT SCHEDULER");
            inten.putExtra(Intent.EXTRA_TEXT, message + "\n\n" + mes3 + mes4 + mes2 + mes5);


            if (inten.resolveActivity(getPackageManager()) != null) {
                startActivity(inten);
            }

        }
        else
        {
            Toast.makeText(this, "Please check the checkboxes and enter the time", Toast.LENGTH_SHORT).show();
        }

    }
}
