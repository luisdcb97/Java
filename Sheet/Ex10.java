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
public class Ex10 {
    private Scanner scan = new Scanner(System.in);
    private int n;
    
    public void exec(){
        System.out.println("Insert N: ");
        n = scan.nextInt();
        scan.nextLine();
        System.out.println("Checks if N is equal to its reverse: ");
        int j = invert(n);
        if( j == n){
            System.out.println(n + " is equal to its reverse " + j);
        }
        else{
            System.out.println(n + " is not equal to its reverse " + j);
        }
        
        
    } 
    
    private int invert(int num){
        int temp=num, inv=0;
        while(temp>0){
            inv = inv*10 + temp%10;
            temp = (int) temp/10;
        }
        return inv;
    }
}
