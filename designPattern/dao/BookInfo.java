package dao;

import dao.data.Book;
import dao.impl.BookDaoImpl;

public class BookInfo {
    public static void main(String[] args) {

        /*Get DB Connection via BookDaoImpl*/
        BookDaoImpl bookDaoImpl = new BookDaoImpl();
        bookDaoImpl.getConnection();

        /*Insert A BOOK*/
        Book b = new Book(null, "152-2566-122", "A word from a poor child", "Chhatra", 2019);
        bookDaoImpl.insert(b);

        /*Insert Another BOOK*/
        Book c = new Book(null, "152-2566-125", "The opposite Me", "Chhatra Chhorm", 2019);
        bookDaoImpl.insert(c);
        /*SEARCH For A Book via SSN*/
        Book result = bookDaoImpl.search(c.getSsn());
        System.out.println("Result From Search" + result);
        /*DELETE a BOOK*/
        bookDaoImpl.delete(c.getSsn());
    }
}
