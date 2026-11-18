/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author kabel
 */
public class Product implements IProduct {
    // 1D array for product names
    private String[] productNames;
    // 2D array
    private int[][] salesData;
    
    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int totalProducts = GetTotalProductsSold();
        int totalEntries = 0;
        for (int i = 0; i < salesData.length; i++) {
            totalEntries += salesData[i].length;
        }
        // Returns the average product sales per product/month entry
        return totalEntries > 0 ? (double) totalProducts / totalEntries : 0.0;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        String mostPopular = "";
        
        for (int i = 0; i < salesData.length; i++) {
            int currentProductTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                currentProductTotal += salesData[i][j];
            }
            if (currentProductTotal > maxSales) {
                maxSales = currentProductTotal;
                mostPopular = productNames[i] + " (" + maxSales + ")";
            }
        }
        return mostPopular;
    }
}
