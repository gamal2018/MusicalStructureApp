package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Restore the current Song Name and display it
        TextView song_Text_View=(TextView)findViewById(R.id.songName);
        String song = getIntent().getStringExtra("Song Name");
        song_Text_View.setText("Song Name : "+song);

        //Restore the current Artist Name and display it
        TextView artist_Text_View=(TextView)findViewById(R.id.ArtistName);
        String artist = getIntent().getStringExtra("Artist Name");
        artist_Text_View.setText("Artist Name : "+artist);


    }
}
