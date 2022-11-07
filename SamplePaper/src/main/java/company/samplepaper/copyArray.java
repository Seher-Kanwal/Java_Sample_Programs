/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.samplepaper;

import java.util.Arrays;

/**
 *
 * @author seher
 */
public class copyArray {
     public static void main(String[] args) {
       int arr[] = {2,3,4,5,2,3,5};
       
       // here we intiliaze an array of len arr
       int copy[] = new int[arr.length];
       
       
         // Manual copying the elements of an array to another array
         /*  for(int i = 0; i<arr.length ; i++){
             copy[i]= arr[i];}*/
         
         // By using the already given fn for copying the array
         System.arraycopy(arr, 0, copy, 0, arr.length);
         System.out.println(Arrays.toString(copy));
    }
}
