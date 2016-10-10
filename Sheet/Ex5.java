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
public class Ex5 {
    
    private Scanner scan = new Scanner(System.in);
    private int n,m;
    
    public void exec(){
        System.out.println("Insert n: ");
        n=scan.nextInt();
        scan.nextLine();
        System.out.println("Insert m: ");
        m = scan.nextInt();
        scan.nextLine();
        System.out.println("Sum of divisors of " + n + " equals " + m + " and vice-versa: ");
        if(n == besties(m) && m == besties(n)){
            System.out.println(n + " is friends with  " + m);
            besties_print(n);
            besties_print(m);
        }
        else{
            System.out.println(n + " is not friends with " + m);
            besties_print(n);
            besties_print(m);
        }
        
    } 

    private int besties(int num){
        int sum=0;
        for (int i = 1; i <= num/2; i++) {
            if(num % i == 0){
                sum += i;
            }
            
        }
        return sum;
    }
    
    
    private int besties_print(int num){
        int sum=0;
        System.out.print("Divisores de " + num + ": ");
        for (int i = 1; i <= num/2; i++) {
            if(num % i == 0){
                if(i != 1){
                    System.out.print(", ");
                }
                sum += i;
                System.out.print( i );
                
                
            }
            
        }
        System.out.println(" Soma: " + sum);
        return sum;
    }
}
