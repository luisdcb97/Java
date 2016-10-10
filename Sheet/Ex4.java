/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha1;

import java.util.Scanner;

/**
 *
 * @author Luis David
 */
public class Ex4 {
    private Scanner scan = new Scanner(System.in);
    private int n = 99;
    
    public void exec(){
        int temp;
        System.out.print("4 lower multiples of " + n + " between 0 and 100: ");
        for (int i = 0; i < 4; i++) {
            temp = n * i;
            if(temp <= 100){
                System.out.print(temp + " ");
            }
            
        }
        System.out.println("");
        
        
    } 
}
