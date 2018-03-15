package dao;

import dao.data.Book;
import dao.impl.BookDaoImpl;

public class BookInfo {
    public static void main(String[] args) {
        Book b = new Book(null, "152-2566-522", "A word from a poor child", "Chhatra", 2019);
        BookDaoImpl bookDaoImpl = new BookDaoImpl();
        bookDaoImpl.getConnection();
        bookDaoImpl.insert(b);
    }
}
