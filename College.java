/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.util.Scanner;

/**
 *
 * @author CC2_1E-34
 */
public class College {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HEllO WELCOME TO UNIVERSITY OD CORDILLERAS");
        String College, deP ,major;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("What is your college deparment:");
        College = sc.nextLine();
            
        if (College.equals("College of Arts and Science")){
            System.out.println("What is yout Academic program? English, Political Science, Communication, Psychology: ");
            deP = sc.nextLine();
               if (deP.equals("English")){
                  System.out.println("College is " + College + "The Academic program is "+ "Bachelor of Arts  in" + deP);
                }
                else if (deP.equals("Political Science")){
                    System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts  in" + deP);
                
                }
                else if (deP.equals("Communication")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Psychology")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                    
                }
                else 
                    System.out.println("The output is invalide");
                }
                
        else if (College.equals("College of Business Administration")){
                  System.out.println("What is your Academic program? Bachelor of Science in Business Administration,Bachelor of Science in Entrpreneurship, Bachelor of Science in Office Administrayion");
                  deP = sc.nextLine();
              
                 if (deP.equals("Business Administration")){
                    System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts in" + deP);
                }
                else if (deP.equals("Entrepreneurship")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Office Administration")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                    
                }
                else 
                    System.out.println("The output is invalide");
                }  
             else if (College.equals("College of Engineering and Architecture")){
                  System.out.println("What is your Academic program? Achitecture, Civil Engineering, Computer Engineering, Electronic Engineering, Environmental & Sanitary Engineering");
                  deP = sc.nextLine();
                  
                if (deP.equals("Architecture")){
                    System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts in" + deP);   
                }
                else if (deP.equals("Civil Engineering")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Computer Engineering")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Electronic Engineering")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Electronic Engineering")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Environment & Sanitary Engineering")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else 
                      System.out.println("The output is invalide");
              }
             else if (College.equals("College of information Technology and Computer Science")){
                  System.out.println("What is your Academic program? Computer Science, Information System, Information Technology, Computer technology");
                  deP = sc.nextLine();
                  
                if (deP.equals("Computer Science")){
                    System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts in" + deP);   
                }
                else if (deP.equals("Information System")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Information Technology")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Computer Technology")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else 
                      System.out.println("The output is invalide");
              }
            else if (College.equals("College of Teacher Education")){
                  System.out.println("What is your Academic program? Elementary Education-general , Elementary Education, Secondary Education ");
                  deP = sc.nextLine();
                 
                 if (deP.equals("Elementary Education - General")){
                    System.out.println("College is " + College + "The Academic program is" + "Bachelor of Arts in" + deP);   
                }
                else if (deP.equals("Elementary Education")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Elementary Education")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else if (deP.equals("Secondary Education")){
                    System.out.println("College is" + College + "The Academic program is " + "Bachelor of Arts  in"+ deP);
                }
                else
                      System.out.println("The output is invalide");
    }  
    }
}
