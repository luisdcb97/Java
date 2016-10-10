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
public class Ex6 {
    
    private Scanner scan = new Scanner(System.in);
    private int n;
    
    public void exec(){
        do{
            System.out.println("Insert n ( n > 3): ");
            n=scan.nextInt();
            scan.nextLine();
        }while(n < 4);
        System.out.println("Perfect numbers from 3 to " + n + ": ");
        perf(n);
        
    } 

    private int divSum(int num){
        int sum=0;
        for (int i = 1; i <= num/2; i++) {
            if(num % i == 0){
                sum += i;
            }
            
        }
        return sum;
    }
    
    
    private void perfPrint(int num){
        System.out.println("--------------------");
        System.out.println("Perfect number: " + num);
        System.out.print("Factors: ");
        for (int i = 1; i <= num/2; i++) {
            if(num % i == 0){
                System.out.print( i + " ");
            }
            
        }
        System.out.println("");
        System.out.println("---------------------------");
    }
    
    
    private void perf(int num){
        for (int i = 3; i <= num; i++) {
            if(i == divSum(i)){
                perfPrint(i);
                
            }
            
        }
        
    }

    
}
