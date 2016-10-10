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
public class Ex13 {
    private Scanner scan = new Scanner(System.in);
    private int n;
    
    public void exec(){
        System.out.println("All numbers from x to 1000 which contain x, x E [1,99]: ");
        do {            
            System.out.println("Insira n: ");
            n = scan.nextInt();
            scan.nextLine();
        } while ( n<1 || n>99 );
        for (int i = n; i < 1000; i++) {
            if(contain(i,n)){
                System.out.println("Number " + i + " contains " + n + "!" );
            }
        }
        
        
    } 
    
    private int digits(int num){
        int i;
        for (i = 0; num >0; i++) {
            num = (int) num / 10;
            
        } 
        return i;
    }
    
    private boolean contain(int num,int x){
        int temp = num , dig;
        dig = (int) Math.pow(10, digits(x) );
        while (temp >= x) {
            if (num % dig == x) {
                return true;
            } 
            temp = (int) temp / 10 ;
        }
        return false;
    }
}
