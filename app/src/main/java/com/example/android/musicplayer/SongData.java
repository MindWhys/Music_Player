package com.example.android.musicplayer;

/**
 * Created by Dan on 27/02/2018.
 * <p>
 * {@link SongData} represents information about songs from the Album chosen.
 * It contains the title of the song and the duration.
 */

public class SongData {

    /**
     * Title of the song
     */
    private String mSongTitle;

    /**
     * Duration of the song
     */
    private String mSongDuration;

    /**
     * Create a new SongData object.
     *
     * @param songTitle    is the name of the song
     * @param songDuration is how long the song is.
     */
    public SongData(String songTitle, String songDuration) {
        mSongTitle = songTitle;
        mSongDuration = songDuration;
    }

    /**
     * Get the title of the song.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the duration of the song.
     */
    public String getSongDuration() {
        return mSongDuration;
    }
}
