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
public class Ex9 {
    private Scanner scan = new Scanner(System.in);
    private int n;
    
    public void exec(){
        System.out.println("Insert N: ");
        n = scan.nextInt();
        scan.nextLine();
        System.out.println("Prime numbers between 1 and N: ");
        for (int i = 1; i <= n; i++) {
            if( isPrime(i) == 1){
                System.out.println(i);
            }
            
        }
        
    } 
    
    private int isPrime(int num){
        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0){
                return 0;
            }
            
        }
        return 1;
    }
    
}
