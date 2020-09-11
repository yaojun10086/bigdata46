package com.imti.book;

public class Book implements Comparable<Book>{
    private String author;
    private double price;
    private String publishi;

    public Book(String author, double price, String publishi) {
        this.author = author;
        this.price = price;
        this.publishi = publishi;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getPublishi() {
        return publishi;
    }

    @Override
    public int compareTo(Book book) {
        /*book.price-this.price；*/   //倒排序（另一对象属性值-当前对象属性值）
        return (int)(this.price-book.price);  //正排序(当前对象属性值-另一对象属性值)
    }
}
