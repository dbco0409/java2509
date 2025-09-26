package com.springboot.domain;

import java.math.BigDecimal;

public class Book {
    private String bookId;
    private String name;
    private String author;
    private BigDecimal unitPrice;
    private String description;
    private String publisher;
    private String category;
    private BigDecimal unitsInStock;
    private String releaseDate;
    private String condition;
    public Book() {
        super();
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getBookId() {
        return bookId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setUnitsInStock(BigDecimal unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
    public BigDecimal getUnitsInStock() {
        return unitsInStock;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public String getCondition() {
        return condition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String s) {
        this.author = s;
    }
}
