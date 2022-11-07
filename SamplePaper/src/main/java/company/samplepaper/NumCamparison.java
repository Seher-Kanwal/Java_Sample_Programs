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
public class NumCamparison {
     public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int a = input.nextInt();
        System.out.println("Enter the sec NO:");
        int b = input.nextInt();
        System.out.println("Enter the sec NO:");
        int c = input.nextInt();
        if( a==b && a==c && b==c){
            System.out.println("All are Same");
     }
        else  if( a!=b && a!=c && b!=c){
            System.out.println("All are are different");
     }
        else{
            System.out.println("Nor equal nor different");
        }
       
      
    }
}
