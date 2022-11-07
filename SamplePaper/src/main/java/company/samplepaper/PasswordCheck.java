
##Do it again there is some issue


package company.samplepaper;
import java.util.Scanner;

/**
8) Write a Java method to check whether a string is a valid password. 
 Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.

 */
public class PasswordCheck {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Password:");
        String a = input.nextLine();
        int len = a.length();
        int digits = 0;
        int ch = 0;
        if(len < 10){
         System.out.println("To Short to be Choose for the password.");
        }
        else {
           
           for(int i = 0; i<a.length();i++){
           char c = a.charAt(i);
           
           // CHECKING AND CALCULATING THE NUMBER OF THE CHARACTERS
           if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
               ch++;
           }
           
           // CHECKING FOR THE DIGITS
           if(('0' <= c && c <= '9')){
            digits++;
           }
           }
        }
          // CHECKING FOR ATLEAST TWO DIGITS
           if(digits >= 2){
               
               // not dealing with speacial characters soo trying to complete the length 
           if(len == digits + ch){
               System.out.println("The password is good to go....");
           }
           }
           else{
               System.out.println("YOU MAY HAVE ENTERED SOME INVALID CHARACTERS OR SYMBOLS..");
           }
    }
}
