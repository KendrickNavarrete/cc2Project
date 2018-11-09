/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author CC2_1E-34
 */
import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
       double num1, num2;
       String arithop;
            System.out.println("Enter num 1");
       num1 = input.nextDouble();
            System.out.println("Enter num 2");
       num2 = input.nextDouble();
            System.out.println("Select an Arithmetic Operation(+,-, *,/,%)");
       arithop = input.next();
        switch (arithop) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 + num2));
                break;
            case "*":
                System.out.println(num1 + "*" + num2 + " = " + (num1 + num2));
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1 + num2));
                break;
            case "%":
                System.out.println(num1 + " % " + num2 + " = " + (num1 + num2));
                break;
            default:
                System.out.println("Invalide input");

        }

    }
}
