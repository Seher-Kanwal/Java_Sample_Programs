/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.samplepaper;

import java.util.Scanner;

/**
 *
 * @author seher
 */
public class Consective_Number_Check {
     // methods are checking the numbers
    
    public static boolean checkNumber(int a,int b, int c){
        
       // we need to sort the elements too so we can't do directly comparisom
        // So the better approach is just to find out the min, max and the middle number
        
        /* max number -- first find max between ant two numbers than find max with the 
           return result and third remaining no*/
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        
        // for mid, we just add all numbers and than subtract the min and max, the answer will be the mid number
        // like 2,4,5 --- 2+4+5 -5-2 = 4
        
        int mid = a + b + c - min - max;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("mid = "+ mid);
 
      return (max - mid)== 1 && (mid - min) == 1;
    
    }
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = input.nextInt();
        System.out.println("Enter Second Number: ");
        int b = input.nextInt();
        System.out.println("Enter Third Number: ");
        int c = input.nextInt();
        
        // Fn calling
        if(checkNumber(a,b,c)){
            System.out.println("Numbers are Consecutive....");
        }
        else{
            System.out.println("Not Consecutive...");
        }

    }
    
}
