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
public class Ex12 {
    private Scanner scan = new Scanner(System.in);
    private int n=100;
    
    public void exec(){
        System.out.println("Binary logarithms of multiples of 100 between 100 and 1000: ");
        int mul,p;
        for (int i = 1; i <= 10; i++) {
            mul = n * i;
            p = binLog(mul);
            System.out.println("Mult: " + mul + "Log: " + p);
        }
        
        
    } 
   
    private int binLog(int num){
        int temp = num , pot=0;
        while (temp >= 2) {
            temp = (int) temp/2;
            pot++;
        }
        return pot;
    }
}
