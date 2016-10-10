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
public class Ex3 {
    private Scanner scan = new Scanner(System.in);
    private int bin = 10110;
    
    public void exec(){
        int pos = 0 ,temp = bin , one = 0 , zero = 0 , dec = 0;
        System.out.println("Count of 0s and 1s in a binary number:"); 
        while (temp > 0) {
            if( temp % 10 == 1){
                one++;
            }
            else{
                zero++;
            }
            dec += (temp % 10) * Math.pow(2,pos); 
            
            temp = (int) temp /10;
            pos++;
        }
        System.out.println("Binary: " + bin + " Decimal Equivalent: " + dec + " 0s: " + zero + " 1s: " + one );
        
    } 
    
    
}
