package com.example.rach.audiobookplayer;

public class Author {

    // Author Title
    private String mAuthorDetails;

    // Number of Books
    private String mNumberOfBooks;


    public Author(String numberofBooks, String authorDetails) {
        mNumberOfBooks = numberofBooks;
        mAuthorDetails = authorDetails;
    }

    public String getNumberOfBooks() {
        return mNumberOfBooks;
    }

    public String getAuthorDetails() {
        return mAuthorDetails;
    }

}
