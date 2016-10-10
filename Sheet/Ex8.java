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
public class Ex8 {
    private Scanner scan = new Scanner(System.in);
    private int n;
    
    public void exec(){
        System.out.println("Insert N: ");
        n = scan.nextInt();
        scan.nextLine();
        System.out.println("N digit numbers equal last N digits of their square: ");
        System.out.println("N = " + n + ": ");
        less(n);
        
    } 
    
    private void less(int num){
        int j,p;
        p= (int) Math.pow(10, num);
        for (int i = (int) Math.pow(10, num-1) ; i < p; i++) {
            j= (int) Math.pow(i, 2);
            if( j % p == i){
                System.out.print("Possui: " + i);
                System.out.print(" (" + i + "*" + i +"=" + j + ") ");
                System.out.println("");
            }
            
        }
        
    }
    
}
