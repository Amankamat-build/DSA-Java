//to find whether its negative or postive num

import java.util.Scanner;

public class ToTellPosOrNeg {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        int num= sc.nextInt();
        

        //now we use conditional statement to check wheter its postive or not..
        if(num>=0){
            System.out.println("Number is postive:" + " " +num);
        }
        else {
            System.out.println("Number is negative:"+ " " +num);
        }
    }
}
