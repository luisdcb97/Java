package ficha1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis David
 */
public class Ex1 {
    private Scanner scan = new Scanner(System.in);
    private int n,k;
    
    public int exec(){
        int c;
        System.out.println("Combinations of n taken k to k:"); 
        do{
            System.out.println("Insert n:");
            n = scan.nextInt();
            System.out.println("Insert k:");
            k = scan.nextInt();
        }while( n<0 && k <0 && n<k);
        
        c = factor( n ) / ( factor( k ) * factor( n - k ) );
        System.out.println(c);
        return c;
    }
    
    private int factor(int f){
        int ret=1;
        for (int i = f; i > 0; i--) {
            ret = ret * i;
        }
        return ret;
    }
}
    