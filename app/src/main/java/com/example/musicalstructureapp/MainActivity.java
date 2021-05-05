package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Song> songData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateData();

        ListView listView = findViewById(R.id.lv_song_list);
        MyArrayAdapter myArrayAdapter = new MyArrayAdapter(this, 0, songData);
        listView.setAdapter(myArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SongActivity.class);
                intent.putExtra("position", i);
                startActivity(intent);
            }
        });

    }

    private void populateData(){
        songData = new ArrayList<>();
        songData.add(new Song(R.drawable.image1,getString(R.string.song1),getString(R.string.artist1)));
        songData.add(new Song(R.drawable.image2,getString(R.string.song2),getString(R.string.artist2)));
        songData.add(new Song(R.drawable.image3,getString(R.string.song3),getString(R.string.artist3)));
        songData.add(new Song(R.drawable.image4,getString(R.string.song4),getString(R.string.artist4)));
        songData.add(new Song(R.drawable.image5,getString(R.string.song5),getString(R.string.artist5)));
        songData.add(new Song(R.drawable.image6,getString(R.string.song6),getString(R.string.artist6)));
        songData.add(new Song(R.drawable.image7,getString(R.string.song7),getString(R.string.artist7)));
        songData.add(new Song(R.drawable.image8,getString(R.string.song8),getString(R.string.artist8)));
        songData.add(new Song(R.drawable.image9,getString(R.string.song9),getString(R.string.artist9)));
        songData.add(new Song(R.drawable.image10,getString(R.string.song10),getString(R.string.artist10)));
        songData.add(new Song(R.drawable.image11,getString(R.string.song11),getString(R.string.artist11)));

    }
}