package com.example.girish.e_scheduler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_acc);
        login=(Button)findViewById(R.id.btnlogin);
        username=(EditText)findViewById(R.id.txtuser);
        password=(EditText)findViewById(R.id.txtpass);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();

            }
        } );
    }
    public void login(){
        String user=username.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if(user.equals("ipg_2016027")|| user.equals("IPG_2016027")&& pass.equals("qwerty12"))
            openactivity_main();

          else
            Toast.makeText(this,"Invalid Credentials!",Toast.LENGTH_LONG).show();


    }
    public void openactivity_main(){
        Intent Intent = new Intent(login.this, MainActivity.class);
        startActivity(Intent);
    }
}
