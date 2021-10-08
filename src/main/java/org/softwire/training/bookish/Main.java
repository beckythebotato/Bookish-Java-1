package org.softwire.training.bookish;

import org.jdbi.v3.core.Jdbi;
import org.softwire.training.bookish.models.database.Book;
import org.softwire.training.bookish.models.database.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;


public class Main {

    public static void main(String[] args) throws SQLException{
        
        String hostname = "localhost";
        String database = "bookish";
        String user = "bookish";
        String password = "bookish";
        String connectionString = "jdbc:mysql://" + hostname + "/" + database + "?user=" + user + "&password=" + password + "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT&useSSL=false";

        ReadEvaluatePrint.Loop();
  
        //jdbcMethod(connectionString);
        getUsers(jdbiMethod(connectionString)).forEach(u->{System.out.println(u);} );
        //getUsers(jdbiMethod(connectionString))

    }

    /*private static void jdbcMethod(String connectionString) throws SQLException {
        System.out.println("JDBC method...");

        // TODO: print out the details of all the books (using JDBC)
        // See this page for details: https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html

        Connection connection = DriverManager.getConnection(connectionString);


    }*/

    private static Jdbi jdbiMethod(String connectionString) throws SQLException {
        System.out.println("JDBI method...");


        Connection connection = DriverManager.getConnection(connectionString);

        Jdbi jdbi = Jdbi.create(connectionString);

        return jdbi;
    }



     static List<User> getUsers(Jdbi jdbi) {



        return jdbi.withHandle(handle ->

                handle.createQuery("Select * FROM users")
                        .mapToBean(User.class)
                        .list()


        );



    }

    static List<Book> getBooks(Jdbi jdbi) {



        return jdbi.withHandle(handle ->

                handle.createQuery("Select * FROM books")
                        .mapToBean(Book.class)
                        .list()


        );



    }



}




