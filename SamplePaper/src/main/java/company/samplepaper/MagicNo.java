/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.samplepaper;
import java.util.Scanner;

public class MagicNo {
    public static boolean isMagic(int n)
    {
      int sum = 0;
      while(n>0 || sum >9)
      {
        if(n==0)
        {
          n=sum;
          sum = 0;
        }
        sum += n % 10;
        n = n/10;
     }
     return (sum==1);
   }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = obj.nextInt();
        if(isMagic(num)){
            System.out.println("the number is magic number");
        }
        else{
            System.out.println("Not a magic Number");
        }
    }
    
}


