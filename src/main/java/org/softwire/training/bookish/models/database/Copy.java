package org.softwire.training.bookish.models.database;

public class Copy {

    int CopyID;
    int BookID;

    public int getCopyID() {
        return CopyID;
    }

    public void setCopyID(int copyID) {
        CopyID = copyID;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    @Override
    public String toString() {
        return "Copy{" +
                "CopyID=" + CopyID +
                ", BookID=" + BookID +
                '}';
    }
}
