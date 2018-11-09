/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeventable;

/**
 *
 * @author CC2_1E-34
 */
public class OddEvenTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[] = {3,9, 15, 20, 65, 23, 18, 4, 2 ,14, 21 };
        int numT = 0,  numE = 0;  
       
       //elements are indexed from 0 to n-1
        System.out.println("odd num:" + "\t even num: ");
             
            for(int even = 0; even < num.length; even++){
                
                for(int odd = 0; odd < num.length; odd++){
                
                 
                        if (num[odd] % 2 == 1);
                            num[odd] = numE;
                                numE++;
                
                if (num[even] % 2 == 0);
                     num[even] = numT;
                         numT++; 
                   
                    //Printing the arrays  
            System.out.println("\t" + numT + "\t" + numE );
            }
        }
    }
}

