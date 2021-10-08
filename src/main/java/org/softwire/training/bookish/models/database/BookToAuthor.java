package org.softwire.training.bookish.models.database;

public class BookToAuthor {

    int BookID;
    int AuthorID;

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public int getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(int authorID) {
        AuthorID = authorID;
    }

    @Override
    public String toString() {
        return "BookToAuthor{" +
                "BookID=" + BookID +
                ", AuthorID=" + AuthorID +
                '}';
    }
}
