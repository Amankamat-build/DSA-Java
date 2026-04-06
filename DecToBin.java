//for converting Dec to binary we have to divide it by 2 
//for placing a num in 0th place divide it by 10pow. 
// for converting a decimal num to binary divide it by 2 and store the remainder and then multiply 10 pow

import java.util.Scanner;

public class DecToBin{
    public static void main(String[]args){
       //we have to take input n from user
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the decimal number");
       int DecNum= sc.nextInt();

       int pow=0; // for increasing the value of 10 pow..
       int bin=0; //for storing the Binary value.

       while(DecNum>0){ 
        int rem= DecNum%2; // for getting the remender
        bin= bin+(rem*(int)Math.pow(10,pow));
        pow++; // for keep increasing the pow one by one.
        DecNum= DecNum/2; // for dividing the num by 2 and storing the quotient until it becomes 0.
       }
       System.out.println(bin);
        
}
}
