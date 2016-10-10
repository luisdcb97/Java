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
public class Ex11 {
    private Scanner scan = new Scanner(System.in);
    private int n,m;
    
    public void exec(){
        System.out.println("Insert N: ");
        n = scan.nextInt();
        scan.nextLine();
        System.out.println("Insert M: ");
        m = scan.nextInt();
        scan.nextLine();
        System.out.println("Finds the lower common multiples of 2 numbers in the interval [N,M]: ");
        int mul;
        for (int i = n; i <= m; i++) {
            for (int j = n; j < i; j++) {
                mul = lcm(i,j);
                System.out.println("N1: " + i + " N2: " + j + " LMC: " + mul);
            }
            
        }
        
        
    } 
    
    private int lcm(int num,int num2){
        int mult = 0 ,l,k,i=1,j;
        while(true){
            l = num * i;
            j=1;
            while(true){
                k= num2 * j;
                if(l==k){
                    return l;
                }
                else if(k>l){
                    break;
                }
                j++;
            }
            i++;
        }
    }
}
