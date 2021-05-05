package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        TextView songName = findViewById(R.id.tv_song_name);
        ImageView songImage = findViewById(R.id.iv_image);
        TextView artist = findViewById(R.id.tv_artist);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            int position = bundle.getInt("position");

            Song song = MainActivity.songData.get(position);
            songName.setText(song.getSongName());
            songImage.setImageResource(song.getImageId());
            artist.setText(song.getArtistName());

        }

    }
}