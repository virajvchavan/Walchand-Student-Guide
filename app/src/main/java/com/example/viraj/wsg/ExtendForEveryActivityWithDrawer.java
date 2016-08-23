package com.example.viraj.wsg;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Viraj on 3/25/2016.
 */
public class ExtendForEveryActivityWithDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,AsyncResponse{


    String name;
    String pass;

    public String nameFromShared,passFromShared,DEFAULT="N/A",comment;
    EditText ET_comment;
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    public void getUserNamePass()
    {

        SharedPreferences sharedPreferences = getSharedPreferences("LoginData", Context.MODE_PRIVATE);
         nameFromShared = sharedPreferences.getString("username", DEFAULT);
         passFromShared = sharedPreferences.getString("password", DEFAULT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.options_for_all, menu);
        return true;
    }

    boolean loggedIn = false;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if (id == R.id.action_login) {
            Intent intent = new Intent(this, LoginActivity.class);

            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void logOut(View view)
    {

        SharedPreferences sharedPreferences=getSharedPreferences("LoginData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("username",DEFAULT);
        editor.putString("password",DEFAULT);
        editor.putBoolean("status", true);
        editor.commit();
        Toast.makeText(getApplicationContext(),"Successfully Logout..",Toast.LENGTH_LONG).show();
        finish();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_colleges) {

            Intent intent = new Intent(this, College.class);

            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.nav_banks) {
            Intent intent = new Intent(this, Banks.class);

            startActivity(intent);

        } else if (id == R.id.nav_hospitals) {
            Intent intent = new Intent(this, Hospitals.class);

            startActivity(intent);

        } else if (id == R.id.nav_mess) {
            Intent intent = new Intent(this, Mess.class);

            startActivity(intent);

        } else if (id == R.id.nav_atms) {
            Intent intent = new Intent(this, ATM.class);

            startActivity(intent);

        } else if (id == R.id.nav_medicals) {
            Intent intent = new Intent(this, MedicalStore.class);

            startActivity(intent);

        }
        else if (id == R.id.nav_food) {
            Intent intent = new Intent(this, Restaurants.class);

            startActivity(intent);

        }
        else if (id == R.id.hostels) {
            Intent intent = new Intent(this, PrivateHostels.class);

            startActivity(intent);

        }
        else if (id == R.id.shopping) {

            Intent intent = new Intent(this, Shopping.class);

            startActivity(intent);
        }
        else if (id == R.id.travelling) {
            Intent intent = new Intent(this, Travelling.class);

            startActivity(intent);

        }

        else if (id == R.id.nav_login) {
            Intent intent = new Intent(this, LoginActivity.class);

            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    ListAdapter adapter;
String loadedString = "";
    public void showComments(String cat)
    {
        ArrayList<HashMap<String, String>> commentsList;
        commentsList = new ArrayList<HashMap<String, String>>();
        String name = "", comment = "";

            SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
            loadedString = sharedPref.getString("savedString", theJson);


        try {
            JSONObject item = new JSONObject(loadedString);
            JSONArray contactsArray = item.getJSONArray("server_data");
            for(int i = 0; i<contactsArray.length(); i++)
            {
                JSONObject c = contactsArray.getJSONObject(i);
                name = c.getString("username");
                comment = c.getString("reviews");


                HashMap<String, String> oneComment = new HashMap<String, String>();
                if(c.getString("mess_name").equals(cat)) {
                    oneComment.put("username", name);
                    oneComment.put("reviews", comment);

                    commentsList.add(oneComment);
                }

            }
        } catch (Exception e) {
            Toast.makeText(this, "No Internet Connection", Toast.LENGTH_SHORT).show();


        }

       adapter = new SimpleAdapter(this, commentsList, R.layout.list_item, new String[]{"username", "reviews"}, new int[]{R.id.list_item_name, R.id.list_item_comment});

        ListView lv = (ListView)(findViewById(R.id.theList));
        lv.setAdapter(adapter);
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }

    static String theJson = "";
    @Override
    public void processFinish(String output) {


        theJson = output;
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_APPEND);
        if(isNetworkAvailable())
        {
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("savedString", output);
            editor.commit();
        }
        else
        {
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("savedString",loadedString );
            editor.commit();
        }


    }
}
