package com.bridgelabz.oops_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {

    private String stockNames;
    private Double numOfShare;
    private Double sharePrice;

    public StockManagement() {
        super();

    }

    public StockManagement(String stockNames, Double numOfShare, Double sharePrice) {
        super();
        this.stockNames = stockNames;
        this.numOfShare = numOfShare;
        this.sharePrice = sharePrice;
    }

    public String getStockNames() {
        return stockNames;
    }

    public void setStockNames(String stockNames) {
        this.stockNames = stockNames;
    }

    public Double getNumOfShare() {
        return numOfShare;
    }

    public void setNumOfShare(Double numOfShare) {
        this.numOfShare = numOfShare;
    }

    public Double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Double sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "StockAEntity [stockNames=" + stockNames + ", numOfShare=" + numOfShare + ", sharePrice=" + sharePrice
                + "]";
    }
    ArrayList<StockManagement> arrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StockManagement stock = new StockManagement();
        System.out.println("Welcome to stock management");
        while (true) {
            System.out.println("Enter the choice !!! \n1)Enter new stock \n2)Display Stock report " + "\n3)exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 ->stock.addStocks();
                case 2 -> stock.stockReport();
                case 3 -> {
                    System.out.println("exiting");
                    System.exit(0);
                }
                default -> System.out.println("invalid input");
            }
        }
    }

    public void addStocks() {
        StockManagement stock = new StockManagement();
        System.out.println("Enter the stock name");
        stock.setStockNames(scanner.next());

        System.out.println("Enter the number of shares present");
        stock.setNumOfShare(scanner.nextDouble());

        System.out.println("Enter the share price");
        stock.setSharePrice(scanner.nextDouble());

        arrayList.add(stock);
    }

    public void stockReport() {
        Double sum = 0.0;
        System.out.println("Roport of Stock");
        System.out.println("stock name            Number of shares         Stock price        Total price of stock ");

        for (int i = 0; i < arrayList.size(); i++) {
            StockManagement s = arrayList.get(i);
            double totalPrice = s.getNumOfShare() * s.getSharePrice();
            totalPrice = sum + totalPrice;
            System.out.println(arrayList);

        }
    }
}
