package com.example.rach.audiobookplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rach.audiobookplayer.Book;
import com.example.rach.audiobookplayer.R;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * custom constructor
     */

    public BookAdapter(Activity context, ArrayList<Book> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // checks if the existing view is being reused, otherwise inflates the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_item, parent, false);
        }
        // gets the Book object located at this position
        Book currentBook = getItem(position);

        // finds the TextView in the book_item.xml layout with the id book_title
        TextView bookTitleTextView = (TextView) listItemView.findViewById(R.id.book_title);
        // Get the miwok translation from the current Word object and
        // sets this text on the book_title TextView
        bookTitleTextView.setText(currentBook.getBookTitle());

        // finds the TextView in the book_item.xml layout with the id author_name
        TextView authorNameTextView = (TextView) listItemView.findViewById(R.id.author_name);
        // get the default translation from the current Word object and
        // sets this text on the author_name TextView
        authorNameTextView.setText(currentBook.getAuthorName());

        // finds the TextView in the book_item.xml layout with the id chapter_total
        TextView chapterTotalTextView = (TextView) listItemView.findViewById(R.id.chapter_total);
        // get the default translation from the current Word object and
        // sets this text on the chapter_total TextView
        chapterTotalTextView.setText(currentBook.getChapterTotal());

        //Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
