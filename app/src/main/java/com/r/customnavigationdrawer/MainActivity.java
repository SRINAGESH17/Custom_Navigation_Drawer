package com.r.customnavigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationview);
        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.openNavDrawer,
                R.string.closeNavDrawer
        );

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    /**
     * Called when an item in the navigation menu is selected.
     *
     * @param item The selected item
     * @return true to display the item as the selected item
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Intent aboutus = new Intent(getApplicationContext(), AboutScreen.class);
                startActivity(aboutus);
                break;
            case R.id.profile:
                Intent profile = new Intent(getApplicationContext(), AboutScreen.class);
                startActivity(profile);
                break;
            case R.id.orders:
                Intent orders = new Intent(getApplicationContext(), AboutScreen.class);
                startActivity(orders);
                break;
            case R.id.share:
                Intent share = new Intent(getApplicationContext(), AboutScreen.class);
                startActivity(share);
                break;
            case R.id.rate:
                Intent rate = new Intent(getApplicationContext(), AboutScreen.class);
                startActivity(rate);
                break;
            default:
                break;


        }
        drawerLayout.closeDrawers();
        return false;

    }

}
