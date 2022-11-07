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
public class MiddleofString {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String for finding the middle Number:");
        String a = input.nextLine();
        int len = a.length();
        if(len%2==0){
        int mid = len/2;
            System.out.println(mid);
            System.out.println("middle Character of the string are " + a.charAt(mid-1) +" and " + a.charAt(mid));
        }
        else{
        int mid = len/2;
            System.out.println("the middle element of the strings is:" + a.charAt(mid));
        }
       
      
    }
}
