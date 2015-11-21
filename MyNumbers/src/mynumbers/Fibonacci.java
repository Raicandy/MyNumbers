/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynumbers;

/**
 *
 * @author DMeer
 */
public class Fibonacci {
    
    public static void Create_until(int X){
        
        int i = 0; //Counter
        long Alpha = 1;
        long Beta = 1;
        long Gamma;
        X=X-2; // Korrektur der Zählung
        
        System.out.println("1,1");
        while(i != X){
            
            Gamma = Alpha;
            Alpha = Alpha + Beta;
            Beta = Gamma;
            
            System.out.println( i+3 + ": " + Alpha);
            i++;
        }
        
    }
}
