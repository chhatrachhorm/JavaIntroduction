package dao.interfaces;

import dao.data.Book;

import java.sql.Connection;

public interface BookDAO {
    Connection getConnection();
    Integer insert(Book book);
    Integer delete(String ssn);
    Integer updateTitle(String ssn, String title);
    Book search(String ssn);
}
