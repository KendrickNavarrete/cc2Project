/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author CC2_1E-34
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // The Integer of the Array
        int a[] = {3,9,15,20,63,23,18,4,2,14,21,}, even[]= new int [5], odd[]=new int [5];
            //elements are indexed from 0 to n-1
        System.out.println("Array { ");
            //find 0 in the array using loop
        for(int displaycounter = 0; displaycounter < a.length; displaycounter++){
            System.out.print(a [ displaycounter] + " ");
        }
            //\n creats a space in the output
        System.out.println ("} \n");
            //find 0 in the array using the loop
        for(int arrangecounter = 0, ecount = 0, ocount = 0 ; arrangecounter < 10; arrangecounter++){
            switch (a [arrangecounter] %2){
             case 1: odd[ocount] = a [arrangecounter];
                    ocount++;
             //break the loop as we found what we are looking for
             break;
        default: even[ecount]=a [arrangecounter];
             ecount++;
             //break the loop as we found what we are looking for
             break;                         
            }
        }
             //prints the array of odd and even
        System.out.println("Odd\tEven");
    for(int lastdisplaycounter = 0; lastdisplaycounter<5; lastdisplaycounter++){
             //\t is used to seperate the odd and even
               System.out.println(odd[lastdisplaycounter] + "\t" + even[lastdisplaycounter]);}          
            }
    }
    
