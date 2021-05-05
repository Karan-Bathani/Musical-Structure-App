package com.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyArrayAdapter extends ArrayAdapter<Song> {

    public MyArrayAdapter(@NonNull Context context, int resource, @NonNull List<Song> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        }
        
        Song song = getItem(position);

        ImageView imageView = itemView.findViewById((R.id.iv_image));
        imageView.setImageResource(song.getImageId());

        TextView textView = itemView.findViewById(R.id.tv_song_name);
        textView.setText(song.getSongName());

        textView = itemView.findViewById(R.id.tv_artist);
        textView.setText(song.getArtistName());

        return itemView;

    }
}
