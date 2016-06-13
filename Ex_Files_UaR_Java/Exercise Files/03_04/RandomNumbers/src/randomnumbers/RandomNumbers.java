/*
 * This program demonstrates using a predefined method
 * It randomly generates two die values 100 times
 * and counts how many times we roll doubles
 */
package randomnumbers;
//imports library that allows you to generate random numbers
import java.util.Random;
/**
 *
 * @author Peggy Fisher
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int die1, die2, countDoubles = 0;
       //object that generates random numbers
       Random rand = new Random();
       
       for (int i = 0; i < 100; i++){
           // this puts the die value between 1 and 6
           die1 = rand.nextInt(6)+1;
           die2 = rand.nextInt(6)+1;
           if(die1 == 1 || die2 == 1){
               countDoubles++;
           }
       }
       System.out.println("I rolled " + countDoubles + " snake eyes.");
    }
    
}
