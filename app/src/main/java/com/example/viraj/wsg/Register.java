package com.example.viraj.wsg;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends Activity {

    EditText ET_name,ET_username,ET_password;
    String name,username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ET_name=(EditText)(findViewById(R.id.name_reg));
        ET_username=(EditText)(findViewById(R.id.user_reg));
        ET_password=(EditText)(findViewById(R.id.pass_reg));
    }
    public void createAccount(View view)
    {
        name=ET_name.getText().toString();
        username=ET_username.getText().toString();
        password=ET_password.getText().toString();
        String method="register";
        BackgroundTask backgroundTask=new BackgroundTask(this);
        backgroundTask.execute(method,name,username,password);
        finish();

    }
}

