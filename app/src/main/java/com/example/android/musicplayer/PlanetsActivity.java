package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlanetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        ArrayList<SongData> songInfo = new ArrayList<SongData>();

        songInfo.add(new SongData(getString(R.string.mars), getString(R.string.marsLength)));
        songInfo.add(new SongData(getString(R.string.venus), getString(R.string.venusLength)));
        songInfo.add(new SongData(getString(R.string.mercury), getString(R.string.mercuryLength)));
        songInfo.add(new SongData(getString(R.string.jupiter), getString(R.string.jupiterLength)));
        songInfo.add(new SongData(getString(R.string.saturn), getString(R.string.saturnLength)));
        songInfo.add(new SongData(getString(R.string.uranus), getString(R.string.uranusLength)));
        songInfo.add(new SongData(getString(R.string.neptune), getString(R.string.neptuneLength)));

        SongAdapter adapter = new SongAdapter(this, songInfo, R.color.colorAccent);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
