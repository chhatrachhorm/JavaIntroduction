package dao.impl;

import dao.data.Book;
import dao.interfaces.BookDAO;

import java.sql.*;

public class BookDaoImpl implements BookDAO{
    private Connection connection;
    @Override
    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/library", "libuser", "123");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer insert(Book b) {
        PreparedStatement insertBook;
        String sql = "INSERT INTO books (ssn, title, author, year) VALUE (?, ?, ?, ?);";
        try {
            connection.setAutoCommit(false);
            insertBook = connection.prepareStatement(sql);
            insertBook.setString(1, b.getSsn());
            insertBook.setString(2, b.getTitle());
            insertBook.setString(3, b.getAuthor());
            insertBook.setInt(4, b.getYear());
            Integer result = insertBook.executeUpdate();
            connection.commit();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer delete() {
        return null;
    }

    @Override
    public Integer update() {
        return null;
    }

    @Override
    public Book search() {
        return null;
    }
}
