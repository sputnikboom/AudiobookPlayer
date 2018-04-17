package com.example.rach.audiobookplayer;

public class Book {

    // Book Title
    private String mBookTitle;

    // Author Name
    private String mAuthorName;

    // Audio book length (as String for purposes of app)
    private String mChapterTotal;

    public Book(String bookTitle, String authorName, String chapterTotal) {
        mBookTitle = bookTitle;
        mAuthorName = authorName;
        mChapterTotal = chapterTotal;
    }

    public String getBookTitle() {
        return mBookTitle;
    }

    public String getAuthorName() {
        return mAuthorName;
    }

    public String getChapterTotal() {
        return mChapterTotal;
    }
}
