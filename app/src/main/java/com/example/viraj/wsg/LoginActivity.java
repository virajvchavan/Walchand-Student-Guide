package com.example.viraj.wsg;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends ExtendForEveryActivityWithDrawer implements AsyncResponse{
  public static EditText ET_username,ET_password;
    String login_name,login_pass;
    public static final String DEFAULT="N/A";

    public static boolean a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sharedPreferences = getSharedPreferences("LoginData", Context.MODE_PRIVATE);
        name = sharedPreferences.getString("username", DEFAULT);
        pass = sharedPreferences.getString("password", DEFAULT);
      if (name.equals("N/A") && pass.equals("N/A")) {
           loggedIn = false;

        } else {
           loggedIn = true;
        }
        setContentView(R.layout.activity_login);




        ET_username=(EditText)(findViewById(R.id.edit_user_login));
        ET_password=(EditText)(findViewById(R.id.edit_pass_login));


        if(loggedIn)
        {
            TextView t1 = (TextView)(findViewById(R.id.welcome_user));
            t1.setText("Welcome " + name + "!");
            t1.setVisibility(View.VISIBLE);

            Button b1 = (Button)(findViewById(R.id.login_button));
            b1.setVisibility(View.GONE);

            Button b2 = (Button)(findViewById(R.id.Sign_out_button));
            b2.setVisibility(View.VISIBLE);

            EditText e1 = (EditText)(findViewById(R.id.edit_pass_login));
            EditText e2 = (EditText)(findViewById(R.id.edit_user_login));

            e1.setVisibility(View.GONE);
            e2.setVisibility(View.GONE);

            TextView t2 = (TextView)(findViewById(R.id.register_login));
            t2.setVisibility(View.GONE);
        }
        else
        {
            TextView t1 = (TextView)(findViewById(R.id.welcome_user));
            t1.setText("Wrong password");
            t1.setVisibility(View.GONE);

            Button b1 = (Button)(findViewById(R.id.login_button));
            b1.setVisibility(View.VISIBLE);

            Button b2 = (Button)(findViewById(R.id.Sign_out_button));
            b2.setVisibility(View.GONE);

            EditText e1 = (EditText)(findViewById(R.id.edit_pass_login));
            EditText e2 = (EditText)(findViewById(R.id.edit_user_login));

            e1.setVisibility(View.VISIBLE);
            e2.setVisibility(View.VISIBLE);

            TextView t2 = (TextView)(findViewById(R.id.register_login));
            t2.setVisibility(View.VISIBLE);
        }

    }

    public void onBackPressed() {
        finish();
    }


    public void openregister(View view){
        startActivity(new Intent(this, Register.class));
    }

    public void login (View view) {

        login_name = ET_username.getText().toString();
        login_pass = ET_password.getText().toString();
        String method = "login";
        SharedPreferences sharedPreferences = getSharedPreferences("LoginData", Context.MODE_PRIVATE);
        name = sharedPreferences.getString("username", DEFAULT);
        pass = sharedPreferences.getString("password", DEFAULT);
        if (name.equals("N/A") && pass.equals("N/A")) {
            BackgroundTask backgroundTask = new BackgroundTask(this);
            backgroundTask.execute(method, login_name, login_pass);

        } else {
            Toast.makeText(getApplicationContext(),"You Have already login..", Toast.LENGTH_LONG).show();
            return;
        }
        loggedIn = true;

    }



    @Override
    public void processFinish(String output) {
    }

}
