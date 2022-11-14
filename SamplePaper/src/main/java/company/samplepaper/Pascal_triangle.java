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
public class Pascal_triangle {
 public static void printTriangle(int k){
   for (int i=1 ; i<=k;i++){
      // printing space
      for(int s= 0; s<=k-i;s++){
          System.out.print(" ");
      }
      
      int num = 1;
      // printing the actuall pascal triangle
      for(int j= 1; j<=i;j++){
          System.out.print(num + " ");
          num = num *(i-j)/j;
      }
       System.out.println("");
   }
 
 }
    static public void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Positive number: ");
        int num = input.nextInt();
        if(num <=0){
            System.out.println("Enter a valid Number....");
        }
        else{
            // Calling the pascal Triangle fn 
          printTriangle(num);
        }
    
    }
    
}
