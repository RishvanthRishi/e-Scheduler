package com.example.girish.e_scheduler;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        TextView authority = (TextView) findViewById(R.id.a);
        authority.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AuthoirtyActivity.class);
                startActivity(i);

            }
        });
        TextView pankaj = (TextView) findViewById(R.id.b);
        pankaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Pankaj.class);
                startActivity(i);

            }
        });
        TextView tapaswi = (TextView) findViewById(R.id.c);
        tapaswi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Tapaswi.class);
                startActivity(i);

            }
        });
        TextView anupam = (TextView) findViewById(R.id.d);
        anupam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Anupam.class);
                startActivity(i);

            }
        });
        TextView raj = (TextView) findViewById(R.id.k);
        raj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Rajendra.class);
                startActivity(i);

            }
        });
        TextView wilfred = (TextView) findViewById(R.id.m);
        wilfred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Wilfred.class);
                startActivity(i);

            }
        });


    }
}


