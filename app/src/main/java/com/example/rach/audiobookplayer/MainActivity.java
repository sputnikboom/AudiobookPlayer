package com.example.rach.audiobookplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // checks for clicks on now playing textView
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // checks for clicks on books textView
        TextView books = (TextView) findViewById(R.id.all_books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent booksIntent = new Intent(MainActivity.this, BooksActivity.class);
                startActivity(booksIntent);
            }
        });

        // checks for clicks on authors textView
        TextView authors = (TextView) findViewById(R.id.all_authors);
        authors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent authorsIntent = new Intent(MainActivity.this, AuthorsActivity.class);
                startActivity(authorsIntent);
            }
        });
    }

}
