package com.example.viraj.wsg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Mess extends ExtendForEveryActivityWithDrawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess);

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
        Intent intent = new Intent(Mess.this,JainMess.class);
        startActivity(intent);
    }

    public void clicked_on_item_2(View view)
    {
        Intent intent = new Intent(Mess.this,PotobaMess.class);
        startActivity(intent);
    }

    public void clicked_on_item_3(View view)
    {
        Intent intent = new Intent(Mess.this,YesSirMess.class);
        startActivity(intent);
    }

    public void clicked_on_item_4(View view)
    {
        Intent intent = new Intent(Mess.this,AgatyaBhojanalay.class);
        startActivity(intent);
    }

    public void clicked_on_item_5(View view)
    {
        Intent intent = new Intent(Mess.this,BalajiMess.class);
        startActivity(intent);
    }

    public void clicked_on_item_6(View view)
    {
        Intent intent = new Intent(Mess.this,AshirwadMess.class);
        startActivity(intent);
    }

    public void clicked_on_item_7(View view)
    {
        Intent intent = new Intent(Mess.this,ChintamaniMess.class);
        startActivity(intent);
    }

    public void clicked_on_item_8(View view)
    {
        Intent intent = new Intent(Mess.this,GaneshMess.class);
        startActivity(intent);
    }


    public void clicked_on_item_9(View view)
    {
        Intent intent = new Intent(Mess.this,KolapeMess.class);
        startActivity(intent);
    }


    public void clicked_on_item_10(View view)
    {
        Intent intent = new Intent(Mess.this,SaiMess.class);
        startActivity(intent);
    }

    public void clicked_on_item_11(View view)
    {
        Intent intent = new Intent(Mess.this,MavshiMess.class);
        startActivity(intent);
    }

    public void clicked_on_item_12(View view)
    {
        Intent intent = new Intent(Mess.this,SachinBhojanalay.class);
        startActivity(intent);
    }


}
