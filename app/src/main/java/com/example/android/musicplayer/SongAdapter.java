package com.example.android.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dan on 27/02/2018.
 */

public class SongAdapter extends ArrayAdapter<SongData> {

    /**
     * Resource ID for the background color for this list of songs
     */
    private int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate in the lists.
     *
     * @param context  The current context. Used to inflate the layout file.
     * @param songInfo A list of SongData objects to display the list.
     */
    public SongAdapter(Activity context, ArrayList<SongData> songInfo, int colorResourceId) {
        // Here we initialise the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews the adapter is not
        // going ot use this second argument, so it can be any value.  Here, we used 0.
        super(context, 0, songInfo);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, gridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position of the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link SongData} object located at this position in the list
        SongData currentSong = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID songTitle
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.songTitle);
        // Get the title from the current SongData object and
        // set this text to the titletextView.
        titleTextView.setText(currentSong.getSongTitle());

        //Find the TextView in the list_item.xml layout with the ID songDuration
        TextView durationTextView = (TextView) listItemView.findViewById(R.id.songDuration);
        // Get the duration from the current SongData object and
        // set this text to the durationTextView.
        durationTextView.setText(currentSong.getSongDuration());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
