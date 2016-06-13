/*
 * This program is designed to calculate the exterior surface area of a house
 */
package simplecalculation;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class SimpleCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calculate surface area of a house to find out how much paint is needed.

        //Algorithm, steps to paint a house
        //Declare all variables
        double h_length, h_width, h_height, window_height, window_width, door_height, door_width, surface_area, surfaceArea;
        int window_amt, door_amt;
        Scanner in = new Scanner(System.in);
        //Ask for house length, width, and height
        System.out.println("What is the height, length, and width of your house?");
        h_height = in.nextDouble();
        h_length = in.nextDouble();
        h_width = in.nextDouble();        
                
        //Ask for number and size of windows
        System.out.println("How may windows do you have and what are the height and width of them?");
        window_amt = in.nextInt();
        window_height = in.nextDouble();       
        window_width = in.nextDouble(); 
        
        //Ask for number and size of doors
        System.out.println("How many doors do you have and what are the height and width of them?");
        door_amt = in.nextInt();
        door_height = in.nextDouble();
        door_width = in.nextDouble();
        
        //Calculate total surface area that will be painted
        surface_area = ((2*h_length*h_width)+(2*h_length*h_height)+(2*h_width*h_height)) - ((window_amt * window_height * window_width) + (door_amt * door_height * door_width));
        
        surfaceArea = (h_width * h_height * 2 + h_length * h_height * 2) - (window_amt * window_width * window_height + 
                door_amt * door_width * door_height);
        
        System.out.println("My calculation of surface area is: " + surface_area);
        System.out.println("The teacher's calculation of surface area is: " + surface_area);
    }

}
