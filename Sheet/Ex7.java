/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha1;

//import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Luis David
 */
public class Ex7 {
        
    private Scanner scan = new Scanner(System.in);
    private int n;
    
    public void exec(){
        System.out.println("3 digit numbers who equal the sum of their cubed digits: ");
        cube();
        
    } 

    private int cubeSum(int num){
        int sum=0,k;
        int temp = num;
        while(temp != 0){
            k = temp % 10;
            sum += (int) Math.pow(k, 3);
            temp = (int) temp/10;
        }
        return sum;
    }
    
    
    private void cubePrint(int num){
        System.out.println("Cubed digit number: " + num);
        System.out.println("");
        
    }
    
    
    private void cube(){
        for (int i = 100; i < 1000; i++) {
            if(i == cubeSum(i)){
                cubePrint(i);
                
            }
            
        }
        
    }

    

}
