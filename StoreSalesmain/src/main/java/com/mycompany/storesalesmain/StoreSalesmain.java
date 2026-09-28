package com.mycompany.storesalesmain;

import java.util.Scanner;

public class StoreSalesmain 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a console device type:");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox Series X");
        System.out.println("3. Nintendo Switch");
        System.out.print("Enter choice (1-3): ");

        int choice = 0;
        while (choice < 1 || choice > 3) 
        {
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                input.next();
            }
            if (choice < 1 || choice > 3) {
                System.out.print("Invalid choice. Enter 1, 2 or 3: ");
            }
        }
        input.nextLine();

        String consoleType;
        switch (choice) 
        {
            case 1:
                consoleType = "PlayStation 5";
                break;
            case 2:
                consoleType = "Xbox Series X";
                break;
            default:
                consoleType = "Nintendo Switch";
                break;
        }

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        int totalSales = -1;
        System.out.print("Enter total amount of sales: ");
        while (totalSales < 0) {
            if (input.hasNextInt()) {
                totalSales = input.nextInt();
            } else {
                input.next();
            }
            if (totalSales < 0) {
                System.out.print("Invalid amount. Enter a whole number: ");
            }
        }

        Consolesales sales = new Consolesales(consoleType, store, totalSales);
        sales.printReport();

        input.close();
    }
}