package com.example.pondibrian.nairobiparks;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mActionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled( true);
        getSupportActionBar().setDisplayHomeAsUpEnabled( true);

        mDrawerLayout =  findViewById(R.id.drawer_layout);
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.drawer_opened,R.string.drawer_closed){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if(getSupportActionBar() != null)
                    getSupportActionBar().setTitle(R.string.drawer_opened);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                if(getSupportActionBar() != null)
                    getSupportActionBar().setTitle(R.string.drawer_closed);

            }
        };
        mDrawerLayout.addDrawerListener( mActionBarDrawerToggle);
    }


}
