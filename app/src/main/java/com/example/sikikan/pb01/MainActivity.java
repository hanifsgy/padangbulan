package com.example.sikikan.pb01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar= (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // if action bar click, action bar show
        // automatically handle clicks
        // parent di AndroidManifest.xml

        int id = item.getItemId();


        if (id == R.id.add) {

            startActivity(new Intent(this, ActivityAmbilPeran.class));


        }

        return super.onOptionsItemSelected(item);
    }


    @Override

    //search bar






    }

