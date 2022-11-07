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
public class Table {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no for the table:");
        int a = input.nextInt();
         System.out.println("Enter the no for the len:");
        int l = input.nextInt();
       for (int i = 1; i<=l; i++){
           System.out.println(a +"*"+i+"="+ i*a);
       }
      
    }
}
