
//number that is having same number when it is reversed->121 is palindrome , 321 is not a palindrome..
//for this particular problem we have get the lst digit of the num, later on store in variable and multiply it by 10

package functions.methods;

import java.util.Scanner;

public class isPalindrome {

    public static boolean isPlaindrome(int num){
        //initilize n= og later on to compare to revese..
        int OG = num;
        
        //initilize rev to store rev of the num..
        int rev= 0;
        
        // now we will start the logic
        while(num>0){
            // get the last digit from num.
            int lstDigit= num%10;
            rev= rev*10+lstDigit; // multiplying with 10 is used for placing the num in their respective order.
            num=num/10; 
        }
        return  rev==OG;
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(isPlaindrome(num)){
            System.out.println(+num  +"Num is palindrome");
        }
        else{
            System.out.println(+num  +"Num is not palindrome");
        }
    }
}
