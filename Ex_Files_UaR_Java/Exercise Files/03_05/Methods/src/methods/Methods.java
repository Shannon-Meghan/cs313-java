/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1, num2, num3;
        System.out.println("Please enter three numbers.");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        
        double average = averageNum(num1, num2, num3);
        
        System.out.println("Your average is " + average + ".");
    }
    
    //static when it's in the same file as the main
    public static double averageNum(int num1, int num2, int num3){
        double average = 0;
        average = (num1+num2+num3) / 3.0;
        return average;
    }
}
