package com.mycompany.storesalesmain;

public class Consolesales extends Consoles 
{

    public Consolesales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("Console type : " + getConsoleType());
        System.out.println("Store name   : " + getStore());
        System.out.println("Total sales  : R" + getTotalSales());
        
    }
}