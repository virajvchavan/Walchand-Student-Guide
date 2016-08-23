package com.example.viraj.wsg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_login) {
            Intent intent = new Intent(this, LoginActivity.class);

            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
    
    public void college(View view)
    {

        Intent intent = new Intent(StartScreen.this, College.class);
        startActivity(intent);
    }

    public void mess(View view)
    {

        Intent intent = new Intent(StartScreen.this, Mess.class);
        startActivity(intent);
    }

    public void bank(View view)
    {


        Intent intent = new Intent(StartScreen.this, Banks.class);
        startActivity(intent);
    }

    public void ATM(View view)
    {


        Intent intent = new Intent(StartScreen.this, ATM.class);
        startActivity(intent);
    }

    public void hospital(View view)
    {

        Intent intent = new Intent(StartScreen.this, Hospitals.class);
        startActivity(intent);
    }

    public void medicalStore(View view)
    {

        Intent intent = new Intent(StartScreen.this, MedicalStore.class);
        startActivity(intent);
    }

    public void restaurant(View view)
    {
        Intent intent = new Intent(StartScreen.this, Restaurants.class);
        startActivity(intent);
    }
    public void privateHostel(View view)
    {
        Intent intent = new Intent(StartScreen.this, PrivateHostels.class);
        startActivity(intent);
    }

    public void shopping(View view)
    {
        Intent intent = new Intent(StartScreen.this, Shopping.class);
        startActivity(intent);
    }

    public void travelling(View view)
    {
        Intent intent = new Intent(StartScreen.this, Travelling.class);
        startActivity(intent);
    }
}
