package com.example.viraj.wsg;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MedicalStore extends ExtendForEveryActivityWithDrawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_store);

        TextView text1 = (TextView)(findViewById(R.id.text_2_1));
        text1.setText("Nothing to show yet!");

        View item2 = (View)(findViewById(R.id.item_2));
        item2.setVisibility(View.GONE);

        View item3 = (View)(findViewById(R.id.item_3));
        item3.setVisibility(View.GONE);

        View item4 = (View)(findViewById(R.id.item_4));
        item4.setVisibility(View.GONE);

        View item5 = (View)(findViewById(R.id.item_5));
        item5.setVisibility(View.GONE);

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


        ImageView dp = (ImageView)(findViewById(R.id.image_2_dp));
        dp.setImageResource(R.drawable.medical_dp);


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

}
