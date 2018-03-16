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
    public Integer delete(String ssn) {
        PreparedStatement deleteBook;
        String sql = "DELETE FROM books where ssn LIKE ?;";
        try {
            connection.setAutoCommit(false);
            deleteBook = connection.prepareStatement(sql);
            deleteBook.setString(1, ssn);
            Integer result = deleteBook.executeUpdate();
            connection.commit();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }


    @Override
    public Integer updateTitle(String ssn, String title) {
        String sql = "UPDATE books set title = ? where ssn = ?";
        PreparedStatement update;
        try {
            connection.setAutoCommit(false);
            update = connection.prepareStatement(sql);
            update.setString(1, title);
            update.setString(2, ssn);
            Integer result = update.executeUpdate();
            connection.commit();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Book search(String ssn) {
        String sql = "SELECT * FROM books where ssn ='" + ssn +"';";
        try {
            ResultSet resultSet = connection.prepareStatement(sql).executeQuery();
            Book b = new Book();
            while (resultSet.next()){
                b.setSsn(resultSet.getString("ssn"));
                b.setAuthor(resultSet.getString("author"));
                b.setId(resultSet.getInt("id"));
                b.setTitle(resultSet.getString("title"));
                b.setYear(resultSet.getInt("year"));
            }
            return b;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
