package com.example.rach.audiobookplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        // Creates a list of books
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("Romeo and Juliet", "William Shakespeare", "3 Chapters"));
        books.add(new Book("The Tempest", "William Shakespeare", "3 Chapters"));
        books.add(new Book("Pride and Prejudice", "Jane Austen", "25 Chapters"));
        books.add(new Book("Waterproof Bible", "Andrew Kaufman", "12 Chapters"));
        books.add(new Book("Tiny Wife", "Andrew Kaufman", "8 Chapters"));
        books.add(new Book("Born Weird", "Andrew Kaufman", "12 Chapters"));
        books.add(new Book("Borne", "Jeff Vandermeer", "24 Chapters"));
        books.add(new Book("Strange Bird", "Jeff Vandermeer", "13 Chapters"));
        books.add(new Book("Annihilation", "Jeff Vandermeer", "5 Chapters"));


        BookAdapter adapter = new BookAdapter(this, books);

        ListView listView = (ListView) findViewById(R.id.book_list);
        listView.setAdapter(adapter);
    }
}
