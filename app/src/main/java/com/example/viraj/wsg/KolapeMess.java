package com.example.viraj.wsg;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class KolapeMess extends ExtendForEveryActivityWithDrawer{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolape_mess);


        ET_comment=(EditText)(findViewById(R.id.ET_comment));

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageView im = (ImageView)(findViewById(R.id.image_3_dp));
        im.setVisibility(View.GONE);

        TextView text1 = (TextView)(findViewById(R.id.text_3_messCat));
        text1.setText(R.string.kolape_cat);

        TextView text2 = (TextView)(findViewById(R.id.text_3_address_info));
        text2.setText(R.string.kolape_add);

        TextView text3 = (TextView)(findViewById(R.id.text_3_phone_no));
        text3.setText(R.string.kolape_phone);

        TextView text4 = (TextView)(findViewById(R.id.text_3_extraHeader));
        text4.setVisibility(View.GONE);

        TextView text5 = (TextView)(findViewById(R.id.text_3_extraText));
        text5.setVisibility(View.GONE);

        View line1 = (View)(findViewById(R.id.line_3_5));
        line1.setVisibility(View.GONE);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        jsonFetch();

        showComments("Kolape Mess");


    }

    public void jsonFetch(){
        JsonFetchBackgroundTask jsonFetchBackgroundTask = new JsonFetchBackgroundTask();
        jsonFetchBackgroundTask.delegate=this;
        jsonFetchBackgroundTask.execute(getString(R.string.general_query));
    }


    public void Addcomment(View view)
    {
        comment=ET_comment.getText().toString();
        getUserNamePass();
        if (!nameFromShared.equals("N/A"))
        {
            String method="comment";
            BackgroundTask backgroundTask=new BackgroundTask(this);
            backgroundTask.execute(method,nameFromShared,passFromShared,"Kolape Mess",comment);
            ET_comment.setText("");
        }
        else {
            Toast.makeText(KolapeMess.this, "Login First", Toast.LENGTH_SHORT).show();
        }

    }


}
