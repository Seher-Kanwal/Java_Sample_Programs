/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.samplepaper;
public class RemoveDuplicateFromArray {
   static int removeDuplicates(int[] a,int n){
       
       // checking for len zero and one
       if(n==0 ||n==1){
         return n;
       }
       // declaring an array Of size n
       int[] temp = new int[n];
       int j = 0;
       for(int i=0; i<n-1;i++){
       if(a[i]!=a[i+1]){
       temp[j++] = a[i];
       }
       
       }
       temp[j++] = a[n-1];
       
       //Copy the temp array to the original array
       System.arraycopy(temp, 0, a, 0, j);
      return j;
   }
     public static void main(String[] args)
    {
        int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
 
        int n = a.length;

        int j = removeDuplicates(a, n);
 
        // printing array elements
        for (int i = 0; i < j; i++)
            System.out.print(a[i] + " ");
    }
    
}
