/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Books implements Serializable{
    
  private String ISBN;
    private String Title;
    private String Author;
    private String Location;
//    private int numberOfCopies;
    boolean rent;
    private String Genre;
    private double Price;

    public Books() {
        ISBN = null;
        Title = null;
        Author = null;
        Location = null;
//        numberOfCopies=0;
        rent = false;
        Genre = null;
        Price = 0;

    }

    public Books(String ISBN, String Title, String Author, String Location, String Genre, double Price, boolean rent) {

        this.ISBN = ISBN;
        this.Title = Title;
        this.Author = Author;
        this.Location = Location;
//        this.numberOfCopies = numberOfCopies;
        this.rent = rent;
        this.Genre = Genre;
        this.Price = Price;

    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getTitle() {
        return Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getLocation() {
        return Location;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getGenre() {
        return Genre;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public double getPrice() {
        return Price;
    }

}
