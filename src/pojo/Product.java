/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo;

import java.time.LocalDate;


public class Product {
    
    private int id;
    private String description;
    private String category;
    private int price;
    private int unitsInStock;
    private int minimum;
    private LocalDate resgistrationDate;

    public Product(int id, String description, String category, int price, int unitsInStock, int minimum, LocalDate resgistrationDate) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.price = price;
        this.unitsInStock = unitsInStock;
        this.minimum = minimum;
        this.resgistrationDate = resgistrationDate;
    }

    public Product() {
        this.id = 0;
        this.description = "";
        this.category = "";
        this.price = 0;
        this.unitsInStock = 0;
        this.minimum = 0;
        this.resgistrationDate = null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public LocalDate getResgistrationDate() {
        return resgistrationDate;
    }

    public void setResgistrationDate(LocalDate resgistrationDate) {
        this.resgistrationDate = resgistrationDate;
    }

    public int getPrice(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


    
    
}
