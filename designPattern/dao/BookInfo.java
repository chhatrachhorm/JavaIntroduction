package dao;

import dao.data.Book;
import dao.impl.BookDaoImpl;

public class BookInfo {
    public static void main(String[] args) {
        Book b = new Book(null, "152-2566-122", "A word from a poor child", "Chhatra", 2019);
        BookDaoImpl bookDaoImpl = new BookDaoImpl();
        bookDaoImpl.getConnection();
        bookDaoImpl.insert(b);

        Book c = new Book(null, "152-2566-125", "The opposite Me", "Chhatra Chhorm", 2019);
        bookDaoImpl.insert(c);
        Book result = bookDaoImpl.search(c.getSsn());
        System.out.println("Result From Search" + result);
        Integer value = bookDaoImpl.delete(c.getSsn());
        System.out.println(value);


    }
}
