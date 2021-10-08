package org.softwire.training.bookish.models.database;

import java.util.Date;

public class Book {

    int ID;
    String Name;
    String ISBN;
    Date PublishDate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(Date publishDate) {
        PublishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", PublishDate=" + PublishDate +
                '}';
    }
}
