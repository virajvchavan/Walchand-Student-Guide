package com.example.viraj.wsg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Restaurants extends ExtendForEveryActivityWithDrawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        TextView text1 = (TextView)(findViewById(R.id.text_2_1));
        text1.setText("Domino's Pizza");

        TextView text2 = (TextView)(findViewById(R.id.text_2_2));
        text2.setText("Rahamatullah Restaurant");

        TextView text3 = (TextView)(findViewById(R.id.text_2_3));
        text3.setText("Mirchi Food Mall");

        TextView text4 = (TextView)(findViewById(R.id.text_2_4));
        text4.setText("Ganesh Nashta Center");

        TextView text5 = (TextView)(findViewById(R.id.text_2_5));
        text5.setText("Rolls Mania");

        TextView text6 = (TextView)(findViewById(R.id.text_2_6));
        text6.setText("Manju Nashta Center");

        TextView text7 = (TextView)(findViewById(R.id.text_2_7));
        text7.setText("Ice Berg");

        TextView text8 = (TextView)(findViewById(R.id.text_2_8));
        text8.setText("Safa Bakers");

        TextView text9 = (TextView)(findViewById(R.id.text_2_9));
        text9.setText("Cafe Cofee Day");


        TextView text10 = (TextView)(findViewById(R.id.text_2_10));
        text10.setText("Hotel Pai Prakash");

        View item11 = (View)(findViewById(R.id.item_11));
        item11.setVisibility(View.GONE);

        View item12 = (View)(findViewById(R.id.item_12));
        item12.setVisibility(View.GONE);

        //set the color for all the logos

        TextView logo1 = (TextView)(findViewById(R.id.logo_2_1));
        logo1.setText("D  ");
        logo1.setBackground(getResources().getDrawable(R.drawable.bg_green));


        TextView logo2 = (TextView)(findViewById(R.id.logo_2_2));
        logo2.setText("R  ");
        logo2.setBackground(getResources().getDrawable(R.drawable.bg_green));

        TextView logo3 = (TextView)(findViewById(R.id.logo_2_3));
        logo3.setText("M  ");
        logo3.setBackground(getResources().getDrawable(R.drawable.bg_green));

        TextView logo4 = (TextView)(findViewById(R.id.logo_2_4));
        logo4.setText("G  ");
        logo4.setBackground(getResources().getDrawable(R.drawable.bg_green));

        TextView logo5 = (TextView)(findViewById(R.id.logo_2_5));
        logo5.setText("R  ");
        logo5.setBackground(getResources().getDrawable(R.drawable.bg_green));

        TextView logo6 = (TextView)(findViewById(R.id.logo_2_6));
        logo6.setText("M  ");
        logo6.setBackground(getResources().getDrawable(R.drawable.bg_green));

        TextView logo7 = (TextView)(findViewById(R.id.logo_2_7));
        logo7.setText("I  ");
        logo7.setBackground(getResources().getDrawable(R.drawable.bg_green));

        TextView logo8 = (TextView)(findViewById(R.id.logo_2_8));
        logo8.setText("S  ");
        logo8.setBackground(getResources().getDrawable(R.drawable.bg_green));

        TextView logo9 = (TextView)(findViewById(R.id.logo_2_9));
        logo9.setText("C  ");
        logo9.setBackground(getResources().getDrawable(R.drawable.bg_green));

        TextView logo10 = (TextView)(findViewById(R.id.logo_2_10));
        logo10.setText("P  ");
        logo10.setBackground(getResources().getDrawable(R.drawable.bg_green));



        ImageView dp = (ImageView)(findViewById(R.id.image_2_dp));
        dp.setImageResource(R.drawable.food_dp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //set the sub-content of all items

        TextView content1 = (TextView)(findViewById(R.id.content_2_1));
        content1.setText(R.string.dominos_content);

        TextView content2 = (TextView)(findViewById(R.id.content_2_2));
        content2.setText(R.string.rahmatulla_content);

        TextView content3 = (TextView)(findViewById(R.id.content_2_3));
        content3.setText(R.string.mirchi_food_content);

        TextView content4 = (TextView)(findViewById(R.id.content_2_4));
        content4.setText(R.string.ganesh_nashta_content);

        TextView content5 = (TextView)(findViewById(R.id.content_2_5));
        content5.setText(R.string.rolls_mania_conent);

        TextView content6 = (TextView)(findViewById(R.id.content_2_6));
        content6.setText(R.string.manju_nashta_content);

        TextView content7 = (TextView)(findViewById(R.id.content_2_7));
        content7.setText(R.string.ice_berg_content);

        TextView content8 = (TextView)(findViewById(R.id.content_2_8));
        content8.setText(R.string.safa_bakery_content);

        TextView content9 = (TextView)(findViewById(R.id.content_2_9));
        content9.setText(R.string.cafe_cofee_day_content);

        TextView content10 = (TextView)(findViewById(R.id.content_2_9));
        content10.setText(R.string.pai_prakash_contnt);



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
        Intent intent = new Intent(this,Dominos_Food.class);
        startActivity(intent);
    }

    public void clicked_on_item_2(View view)
    {
        Intent intent = new Intent(this,Rahmatulla_Food.class);
        startActivity(intent);
    }

    public void clicked_on_item_3(View view)
    {
        Intent intent = new Intent(this,MirchiFood.class);
        startActivity(intent);
    }

    public void clicked_on_item_4(View view)
    {
        Intent intent = new Intent(this,GaneshNashta_Food.class);
        startActivity(intent);
    }

    public void clicked_on_item_5(View view)
    {
        Intent intent = new Intent(this,RollsMania_Food.class);
        startActivity(intent);
    }
    public void clicked_on_item_6(View view)
    {
        Intent intent = new Intent(this,ManjuNashta_Food.class);
        startActivity(intent);
    }

    public void clicked_on_item_7(View view)
    {
        Intent intent = new Intent(this,IceBerg_Food.class);
        startActivity(intent);
    }
    public void clicked_on_item_8(View view)
    {
        Intent intent = new Intent(this,SafaBakers_Food.class);
        startActivity(intent);
    }

    public void clicked_on_item_9(View view)
    {
        Intent intent = new Intent(this,CCD_Food.class);
        startActivity(intent);
    }

    public void clicked_on_item_10(View view)
    {
        Intent intent = new Intent(this,PaiPrakash_Hotel.class);
        startActivity(intent);
    }
}
