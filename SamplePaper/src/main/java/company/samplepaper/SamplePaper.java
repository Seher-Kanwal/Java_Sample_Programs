/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
// 2) Write a Java program to reverse a string.
package company.samplepaper;
import java.util.Scanner;
public class SamplePaper {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = input.nextLine();
        String sum = "";
        for (int i = (a.length()-1); i>=0; i--){
          sum  = sum + a.charAt(i);
        }
        System.out.println("The String after reversing is :" + sum);
    }
}
