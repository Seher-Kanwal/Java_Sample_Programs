/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.samplepaper;
/**
 *
 * @author seher
 */
public class DuplicateElementOfArray {
     public static void main(String[] args) {
       int arr[] = {2,3,4,5,2,3,5};
       for(int i = 0; i<arr.length ; i++){
       for(int j = i+1; j < arr.length; j++){
       if (arr[i]==arr[j])
               System.out.println("duplicate element is: " + arr[i]);
       }
       }
      
    }
    
}
