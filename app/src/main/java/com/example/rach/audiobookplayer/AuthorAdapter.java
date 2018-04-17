package com.example.rach.audiobookplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AuthorAdapter extends ArrayAdapter<Author> {

    /**
     * custom constructor
     */

    public AuthorAdapter(Activity context, ArrayList<Author> authors) {
        super(context, 0, authors);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // checks if the existing view is being reused, otherwise inflates the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.author_item, parent, false);
        }
        // gets the Author object located at this position
        Author currentAuthor = getItem(position);

        // finds the TextView in the author_item.xml layout with the id author_details
        TextView authorDetailsTextView = (TextView) listItemView.findViewById(R.id.author_details);
        // Get the author name from the current Word object and
        // sets this text on the author_details TextView
        authorDetailsTextView.setText(currentAuthor.getAuthorDetails());

        // finds the TextView in the author_item.xml layout with the id number_of_books
        TextView numberOfBooksTextView = (TextView) listItemView.findViewById(R.id.number_of_books);
        // get the default translation from the current Word object and
        // sets this text on the author_name TextView
        numberOfBooksTextView.setText(currentAuthor.getNumberOfBooks());

        //Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
