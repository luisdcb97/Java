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
public class Ex2 {
    private Scanner scan = new Scanner(System.in);
    private int sum=0;
    
    public int exec(){
        int limit , i;
        System.out.println("Sum from 1 to limit:"); 
        do{
            System.out.println("Insert limit:");
            limit = scan.nextInt();
        }while( limit < 0);
        for ( i = 1; sum < limit; i++) {
            sum += i;
        }
        i--;
        System.out.println("Sum: " + sum + " Last # added: " + i);
        return i;
    }
}
