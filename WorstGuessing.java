/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worstguessing;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class WorstGuessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        
        int secret, guess;
        secret = 8;
        
        System.out.print("Try and guess the number im thinking of, it's between 1-10! ");
        guess = keyboard.nextInt();
        
        if(guess == secret){
            System.out.println("Your right! My number was " + secret);
        }else{
            System.out.println("Sorry " + guess + " wasn't my number");
        }
    }
    
}
