/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author CC2_1E-34
 */
import java.util.Scanner;

public class RecurSion {

    public static void main(String[] args) {
        // TODO code application logic here
        display();
    }

    public static int userInput() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();
        return n;
    }

    static void display() {
        int n = userInput();
        for (int i = 0; i <= n; i++) {
            System.out.print("f(" + i + ")\t");

        }
        System.out.println("");
        for (int x = 0; x <= n; x++) {
            for (int a = 0; a <= x; a++) {
                System.out.print(fibo(a) + "\t");
            }
            System.out.println("");
            
                    }

    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }


    }
}
