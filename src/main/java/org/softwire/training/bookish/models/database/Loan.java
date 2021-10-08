package org.softwire.training.bookish.models.database;

import java.util.Date;

public class Loan {

    int ID;
    int UserID;
    int BookID;
    Date CheckoutDate;
    Date ExpectedReturnDate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public Date getCheckoutDate() {
        return CheckoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        CheckoutDate = checkoutDate;
    }

    public Date getExpectedReturnDate() {
        return ExpectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
        ExpectedReturnDate = expectedReturnDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "ID=" + ID +
                ", UserID=" + UserID +
                ", BookID=" + BookID +
                ", CheckoutDate=" + CheckoutDate +
                ", ExpectedReturnDate=" + ExpectedReturnDate +
                '}';
    }
}
