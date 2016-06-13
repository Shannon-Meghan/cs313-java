/*
 * This program demonstrates implicit and explicit data conversion
 */
package dataconversion;

/**
 *
 * @author Peggy Fisher
 */
public class DataConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println((3+5+8) / 3);
        //Implicit conversion
        System.out.println((3+5+8) / 3.00);
        //Explicit conversion
        System.out.println((double)(3+5+8) / 3);
        
        //If there isn't a double in the division portion, then the division portion will output an int, getting the wrong number.
        double volume = 4/3 * Math.PI * (10*10*10);
        double realVolume = 4/3.0 * Math.PI * (10*10*10);
        System.out.println("The volume of a sphere with radis 10 is: " + volume);
        System.out.println("The volume of a sphere with radis 10 is really: " + realVolume);
        
        double fahrenheit = 300;
        double celsius = (fahrenheit - 32) * (5/9.0);
        double falseCelsius = (fahrenheit - 32) * (5/9);
        System.out.println("Celsius: " + celsius);
        System.out.println("False Celsius: " + falseCelsius);
    }
    
}
