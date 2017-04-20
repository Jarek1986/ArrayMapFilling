/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktory;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

        
        
        System.out.println("Change 1");
        System.out.println("Change 2");
        System.out.println("Change 3");
        // ==== Basic size parameters of SOLO sign ==============
        
        int[][] myIntArray  = {{3, 3, 1, 3}, {1, 1, 1, 1, 1, 1}, {3, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1}, {3, 3, 3, 3}};
        int[][] myIntArray2 = {{0, 1, -1, 3}, {0, 3, 1, -1, 3, 1}, {0, 1, 1, -1, 3, 1},{2, 1, 1, -1, 3, 1}, {0, 1, 1, 1}};
        
        // ======================================================
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a size of SOLO (integer: 0,1,2...): ");
        int inc = sc.nextInt();
           
        
        System.out.println(myIntArray[0].length);
        
        int k,k2;
        for (int i = 0; i < 5; i++) {
            System.out.println("");
                                 
            for (int j = 0; j < myIntArray[i].length; j++) { // Parametr j to numer seri # od lewej strony
                
                
                k = myIntArray[i][j];
                k2 = myIntArray2[i][j];
                
                //===== Size increment ======
                 if (k>1){
                    k=k+inc;
                }
                 if (k2>1){
                    k2=k2+inc;
                }
                 
                                
                for (int g1=1; g1<=k2; g1++){
                       System.out.print(" "); 
                       if(j>1 && k2==1 && k==1){
                           for (int d=1; d<=inc; d++){
                       System.out.print(" ");
                           }
                       }                       
                    }
                
                // ===== Corects the space 1 where is shoud be
                if(k2==-1){
                       System.out.print(" ");
                }
                
                // ===== Drows # ==============
                             
                for (int k1=1; k1<=k; k1++){
                    
                    System.out.print("#");
                    
                }
            }
        }
         System.out.println("");
    }
    }
