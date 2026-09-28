
package com.mycompany.salesgamingconsoles;


public class SalesGamingConsoles 
{

    public static void main(String[] args) 
    {
      
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
 
        int[] citiesTotals = new int[cities.length];
 
       
        int[][] consles = 
        {
            {1000, 2000, 3000},   
            {2000, 3000, 4000},   
            {1500, 1100, 1200}   
          
        };
 
        
        String line = "-------------------------------------------------------------";
 
        System.out.println(line);
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println(line);
 
       
        System.out.printf("%-12s%-16s%-16s%-16s%n","", "PS5", "XBOX", "SWITCH");
 
 
        for (int m = 0; m < consles.length; m++)
        {
            
            System.out.printf("%-12s", cities[m]);
 
            for (int t = 0; t < consles[m].length; t++)
            {
                // Print the number of jobs (%d = whole number)
                System.out.printf("%-16d", consles[m][t]);
 
                citiesTotals[m] += consles[m][t];
            }
 
           
            System.out.println();
        }
        System.out.println(line);
        System.out.println("CONSOLE SLAES TOTALS FOR EACH CITY");
        System.out.println(line);
 
        for (int m = 0; m < citiesTotals.length; m++)
        {
           
            System.out.printf("%-12s%-8d", cities[m], citiesTotals[m]);
            if (citiesTotals[m] >= 15)
            {
                System.out.print("");
            }  
            System.out.println();
        }
 
        System.out.println(line);
    }
}

