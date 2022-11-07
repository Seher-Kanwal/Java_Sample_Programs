/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.samplepaper;
import java.util.Scanner;

// 3) Write a Java program to find the number of days in a month

public class DayInMonth {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of the month:");
        int a = input.nextInt();
        
        // create a list of the days of the months 
        int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(a >12){
            System.out.println("Invalid number");
        }
        else {
            System.out.println("The No of Days:" + days[a-1]);
        }
    }
     
    
}
