package com.springboot.repository;

import com.springboot.domain.Book;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    private List<Book> listOfBooks = new ArrayList<>();
    public BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setName("Book 1");
        book1.setUnitPrice(new BigDecimal(30000));
        book1.setAuthor("Book 1");
        book1.setDescription("Book 2");
        book1.setPublisher("길벗");
        book1.setCategory("IT전문가");
        book1.setUnitsInStock(new BigDecimal(1000));
        Book book2 = new Book();
        book2.setName("Book 2");
        book2.setUnitPrice(new BigDecimal(30000));
        book2.setAuthor("Book 2");
        book2.setDescription("Book 3");
        book2.setPublisher("길벗");
        book2.setCategory("IT교육교재");
        book2.setUnitsInStock(new BigDecimal(1000));
        listOfBooks.add(book1);
        listOfBooks.add(book2);


    }


    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }
}
