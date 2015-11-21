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
public class Primenumber {
    
    public static boolean isPrime(int X){
        
   // Prüfe, ob p eine Primzahl ist
      boolean istPrim = true;
      if (X < 2) return false;          
                      
      for (int i=2; i <= Math.sqrt(X); i++){
         if (X%i == 0){
            istPrim = false;
            break;
         }
      }             
      return istPrim;
    }
//##############################################################################    
    
    public static void Create_until(int X){
        
        int i = 0; //Counter
        int j = 1;
        while(i != X){
            if (isPrime(i)== true){
                System.out.println(j + ": "+ i);
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        
    }
    
}
