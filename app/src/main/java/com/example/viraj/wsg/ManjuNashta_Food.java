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

public class ManjuNashta_Food extends ExtendForEveryActivityWithDrawer{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manju_nashta__food);

        ET_comment=(EditText)(findViewById(R.id.ET_comment));

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView im = (ImageView)(findViewById(R.id.image_3_dp));
        im.setImageResource(R.drawable.hotel_dp);

        TextView text1 = (TextView)(findViewById(R.id.text_3_messCat));
        text1.setVisibility(View.GONE);

        TextView text2 = (TextView)(findViewById(R.id.text_3_address_info));
        text2.setText(R.string.manju_add);

        TextView text3 = (TextView)(findViewById(R.id.text_3_phone_no));
        text3.setText(R.string.manju_phone);

        TextView text4 = (TextView)(findViewById(R.id.text_3_fees_header));
        text4.setVisibility(View.GONE);

        TextView text5 = (TextView)(findViewById(R.id.text_3_fees));
        text5.setVisibility(View.GONE);



        View line=(View)(findViewById(R.id.line_3_1));
        line.setVisibility(View.GONE);

        View line1=(View)(findViewById(R.id.line_3_2));
        line1.setVisibility(View.GONE);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        jsonFetch();

      showComments("ManjuNashta Food");

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
            backgroundTask.execute(method,nameFromShared,passFromShared,"ManjuNashta Food",comment);

        }
        else {
            Toast.makeText(ManjuNashta_Food.this, "Login First", Toast.LENGTH_SHORT).show();
        }

    }

}
