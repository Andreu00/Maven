/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jakarta;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="catalog")
public class Catalog {
    
    @XmlElement(name="book")
    private List<Book>books=null;
    
    public List<Book> getBook(){
        return books;
    }
    
    public void setBook(List<Book> catalog){
        this.books=catalog;
    }
}

class Book{
    private String title;
    private String id;
    private String author;
    private String genre;
    private double price;
    private String publish_date;
    private String description;

    public Book(String title, String id, String author, String genre, double price, String publish_date, String description) {
        this.title = title;
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.publish_date = publish_date;
        this.description = description;
    }

    public Book() {
        super();
    }
    
    @XmlAttribute (name="id")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    @XmlElement (name="author")
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    @XmlElement (name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @XmlElement (name="genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @XmlElement (name="price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @XmlElement (name="publish_date")
    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }
    
    @XmlElement (name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }    
}



