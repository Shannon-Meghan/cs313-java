/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelcost;

// Imports the library that allows the computer to read what's typed.
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class TravelCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables needed: mpg, total distance, and gas price
        double mpg, distance, gasPrice, tripPrice;
        String vehicleType;
        
        Scanner in = new Scanner(System.in);
        //ask the user for each and let them type it in.
        System.out.println("What is the total distance you will be travelling?");
        distance = in.nextDouble();
        
        System.out.println("How many miles per gallon does your car take?");
        mpg = in.nextDouble();
        
        System.out.println("What is the current gas price?");
        gasPrice = in.nextDouble();
        
        System.out.println("What type of vehicle do you own?");
        //read a string
        vehicleType = in.next();
        
        tripPrice = (distance/mpg) * gasPrice;
        
        //$%5.2f allows the variable to show.
        System.out.printf("The total amount of your gas will be $%5.2f since you are driving a " + vehicleType, tripPrice);
        
        System.out.println();
        
    }
    
}
