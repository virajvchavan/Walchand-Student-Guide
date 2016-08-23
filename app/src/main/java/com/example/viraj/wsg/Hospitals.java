package com.example.viraj.wsg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class Hospitals extends ExtendForEveryActivityWithDrawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

        TextView text1 = (TextView)(findViewById(R.id.text_2_1));
        text1.setText("Dr. C. R. Deshpande Clinic");

        TextView text2 = (TextView)(findViewById(R.id.text_2_2));
        text2.setText("Dr. Abhijeet Joshi");

        TextView text3 = (TextView)(findViewById(R.id.text_2_3));
        text3.setText("Anuradha Eye Clinic");

        TextView text4 = (TextView)(findViewById(R.id.text_2_4));
        text4.setText("Magdum Hospital");

        TextView text5 = (TextView)(findViewById(R.id.text_2_5));
        text5.setText("Magdum Dental Clinic");

        View item6 = (View)(findViewById(R.id.item_6));
        item6.setVisibility(View.GONE);

        View item7 = (View)(findViewById(R.id.item_7));
        item7.setVisibility(View.GONE);

        View item8 = (View)(findViewById(R.id.item_8));
        item8.setVisibility(View.GONE);

        View item9 = (View)(findViewById(R.id.item_9));
        item9.setVisibility(View.GONE);

        View item10 = (View)(findViewById(R.id.item_10));
        item10.setVisibility(View.GONE);

        View item11 = (View)(findViewById(R.id.item_11));
        item11.setVisibility(View.GONE);

        View item12 = (View)(findViewById(R.id.item_12));
        item12.setVisibility(View.GONE);


        //set the color for all the logos

        TextView logo1 = (TextView)(findViewById(R.id.logo_2_1));
        logo1.setText("D  ");
        logo1.setBackground(getResources().getDrawable(R.drawable.bg_purple));


        TextView logo2 = (TextView)(findViewById(R.id.logo_2_2));
        logo2.setText("J  ");
        logo2.setBackground(getResources().getDrawable(R.drawable.bg_purple));

        TextView logo3 = (TextView)(findViewById(R.id.logo_2_3));
        logo3.setText("A  ");
        logo3.setBackground(getResources().getDrawable(R.drawable.bg_purple));

        TextView logo4 = (TextView)(findViewById(R.id.logo_2_4));
        logo4.setText("M  ");
        logo4.setBackground(getResources().getDrawable(R.drawable.bg_purple));

        TextView logo5 = (TextView)(findViewById(R.id.logo_2_5));
        logo5.setText("M  ");
        logo5.setBackground(getResources().getDrawable(R.drawable.bg_purple));


        ImageView dp = (ImageView)(findViewById(R.id.image_2_dp));
        dp.setImageResource(R.drawable.hospital_dp);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    public void clicked_on_item_1(View view)
    {
        Snackbar.make(view, "No More Details!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void clicked_on_item_2(View view)
    {
        Snackbar.make(view, "No More Details!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void clicked_on_item_3(View view)
    {
        Snackbar.make(view, "No More Details!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void clicked_on_item_4(View view)
    {
        Snackbar.make(view, "No More Details!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void clicked_on_item_5(View view)
    {
        Snackbar.make(view, "No More Details!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }


}
