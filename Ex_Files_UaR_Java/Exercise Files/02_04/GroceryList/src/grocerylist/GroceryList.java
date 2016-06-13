/*
 * This program demonstrates the use of an array
 */
package grocerylist;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class GroceryList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an array that stores 5 doubles
        double[] prices = new double[5];
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 prices.");
        
        prices[0] = in.nextDouble();
        prices[1] = in.nextDouble();
        prices[2] = in.nextDouble();
        prices[3] = in.nextDouble();
        prices[4] = in.nextDouble();
        
        double total = prices[0] + prices[1] + prices[2] + prices[3] + prices[4];
        
        //$%5.2f formats the variable to the right to have a dollar sign, have 5 numbers to the left of the period and two numbers to the right. f stands for formatting
        System.out.printf("The total for all 5 values is: $%5.2f",total);
        
    }
    
}
