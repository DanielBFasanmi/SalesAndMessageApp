/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smpro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 *
 * @author 1412625
 * the sales class object hold the information of all the sales made on a particular type of product
 */
public class Sale {
    private String productName; 
    private double total;
    private int quantity;   
    private List<Double> priceRecord = new ArrayList();
    public Sale(){
    productName = "";
    total = 0.0;
    quantity = 0;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotal() {
        return total;
    }
/**
 * the setTotal method is a synchronized that locks on a 
 * thread and keeps other thread from invoking it
 * it is responsible for the processing of every possible transactional operation (add, subtract, multiply and insert) 
 * that can be performed.
 * 
     * @param price
     * @param operation
     * @param qty
 */
    
    public synchronized void setTotal(double price, Operation operation, int qty) {
        double x = 0;
        switch (operation) {
            case Add:
        // this method takes care of Addition
                priceRecord.forEach((c) -> {
                    c +=price;                   
                });
                total = 0.0;
                 priceRecord.forEach((c) -> {
                    total +=c;                   
                });               
                break;
                    
            case Subtract:
                // this method takes care of subtraction
                priceRecord.forEach((c) -> {
                    if(c >= price){
                    c -=price;   
                    }
                });
                total = 0.0;
                 priceRecord.forEach((c) -> {
                    total +=c;                   
                });
             
                break;
                         
            case Multiply:  
                // this method takes care of multiplication 
                priceRecord.forEach((c) -> {
                    c *=price;                   
                });
                total = 0.0;
                 priceRecord.forEach((c) -> {
                    total +=c;                   
                });
                break;
                        
            default:   
                // this methoid takes care of new sales.
                priceRecord.add(price * qty);
                total = 0.0;
                 priceRecord.forEach((c) -> {
                    total +=c;                   
                });                
                
                break;
        }
        setQuantity(qty);
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }
}
