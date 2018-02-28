package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class GorillazActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        // my_child_toolbar is defined in the layout file
        Toolbar myChildToolbar = (Toolbar) findViewById(R.id.my_child_toolbar);
        setSupportActionBar(myChildToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        ArrayList<SongData> songInfo = new ArrayList<SongData>();

        songInfo.add(new SongData(getString(R.string.re_hash), getString(R.string.re_hash_l)));
        songInfo.add(new SongData(getString(R.string.five_four), getString(R.string.five_four_l)));
        songInfo.add(new SongData(getString(R.string.tomorrow_comes_today), getString(R.string.tomorrow_comes_today_l)));
        songInfo.add(new SongData(getString(R.string.new_genious), getString(R.string.new_genious_l)));
        songInfo.add(new SongData(getString(R.string.clint_eastwood), getString(R.string.clint_eastwood_l)));
        songInfo.add(new SongData(getString(R.string.man_research), getString(R.string.man_research_l)));
        songInfo.add(new SongData(getString(R.string.punk), getString(R.string.punk_l)));
        songInfo.add(new SongData(getString(R.string.sound_check), getString(R.string.sound_check_l)));
        songInfo.add(new SongData(getString(R.string.double_bass), getString(R.string.double_bass_l)));
        songInfo.add(new SongData(getString(R.string.rock_the_house), getString(R.string.rock_the_house_l)));
        songInfo.add(new SongData(getString(R.string.nineteen_two_thousand), getString(R.string.nineteen_two_thousand_l)));
        songInfo.add(new SongData(getString(R.string.latin_simone), getString(R.string.latin_simone_l)));
        SongAdapter adapter = new SongAdapter(this, songInfo, R.color.colorPrimary);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GorillazActivity.this, "Playing Track: " + (position + 1),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
