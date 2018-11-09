/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Scanner;

/**
 *
 * @author CC2_1E-34
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
            int guess;
            int count = 0;
            int o = 0 + (int)(Math.random()*999);
            System.out.println("Enter number from 1 to 1000");
            guess = sc.nextInt();
            
            
            
    do { 
        guess = sc.nextInt();
        count++;
        if (guess > o ){
            System.out.println("go lower");
        }
        else if (guess < o){
            System.out.println("go higher");
        }
    }
    while (guess != o);
        System.out.println("good job you guess the right number " + count + "tries");
    }
}
