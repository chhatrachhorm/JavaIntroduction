package dao.interfaces;

import dao.data.Book;

import java.sql.Connection;

public interface BookDAO {
    Connection getConnection();
    Integer insert(Book book);
    Integer delete();
    Integer update();
    Book search();
}
