package com.example.viraj.wsg;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class College extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);


    }

    @Override
    public void onBackPressed() {

            Intent intent = new Intent(College.this, StartScreen.class);
       
        startActivity(intent);


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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void collegeweb(View view)
    {

        String url = "http://www.walchandsangli.ac.in/Index.asp";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }
    public void moodle(View view)
    {

        String url = "http://112.133.242.241/moodle/login/index.php";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);


    }
    public void about_departments(View view)
    {
        Intent intent = new Intent(College.this, about_departments.class);
        startActivity(intent);
    }
    public void aboutwce(View view)
    {
        Intent intent = new Intent(College.this, About_wce.class);
        startActivity(intent);
    }
    public void facilities(View view)
    {
        Intent intent = new Intent(College.this, facilities.class);
        startActivity(intent);
    }



}
