package com.bridgelabz.stock_account_management;

public class Stock {
    String name;
    int noOfShares;
    double sharePrice;

    public Stock(String name, int noOfShares, double sharePrice) {
        this.name = name;
        this.noOfShares = noOfShares;
        this.sharePrice = sharePrice;
    }

    public void printStockReport() {
        double stockValue = this.noOfShares * this.sharePrice;
        System.out.println(name + " stock value is Rs: " + stockValue);
    }

    public double getStockValue() {
        double stockValue = this.noOfShares * this.sharePrice;
        return stockValue;
    }
}
