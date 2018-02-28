package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows The Planets
        TextView planets = (TextView) findViewById(R.id.the_planets);

        //Set an OnClickListener on the View
        planets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, PlanetsActivity.class);
                startActivity(songsIntent);
            }
        });

        //Find the View that shows The Planets
        TextView gorillaz = (TextView) findViewById(R.id.gorillaz);

        //Set an OnClickListener on the View
        gorillaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, GorillazActivity.class);
                startActivity(songsIntent);
            }
        });
    }
}
