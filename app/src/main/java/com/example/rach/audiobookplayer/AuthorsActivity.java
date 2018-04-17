package com.example.rach.audiobookplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.rach.audiobookplayer.Author;
import com.example.rach.audiobookplayer.AuthorAdapter;
import com.example.rach.audiobookplayer.R;

import java.util.ArrayList;

public class AuthorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authors);

        // Creates a list of authors
        ArrayList<Author> authors = new ArrayList<Author>();

        authors.add(new Author("2 Books", "William Shakespeare"));
        authors.add(new Author("1 Book", "Jane Austen"));
        authors.add(new Author("3 Books", "Andrew Kaufman"));
        authors.add(new Author("3 Books", "Jeff Vandermeer"));


        AuthorAdapter adapter = new AuthorAdapter(this, authors);

        ListView listView = (ListView) findViewById(R.id.author_list);
        listView.setAdapter(adapter);
    }
}
