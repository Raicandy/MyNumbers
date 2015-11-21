/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynumbers;

import java.util.Scanner;
import mynumbers.Fibonacci;

/**
 *
 * @author DMeer
 */
public class MyNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            Scanner in = new Scanner(System.in);
            String eingabe = null;
            String pfad = null;
            boolean token = false;
            boolean t2;
            boolean t3;
            int x;
            
    //##########################################################################
    System.out.println("Hey...");
    
        while(token != true){

                    System.out.println("...");

                    x = in.nextInt();
                    System.out.println("____");
                    Fibonacci.Create_until(x);
                    token = true;
        }
        in.close();
        System.exit(0);
    }
    
    
}
