// sum of odd and even from the user given number..
// we will use conditons to check whether the given num is odd or even..

import java.util.Scanner;

public class AddOddEvenNum{
    public static void main(String[]nums){
        Scanner sc= new Scanner(System.in);

        int even=0; // to store even num.
        int odd=0; //to store odd num..
        int choice;

        do{
            System.out.println("enter number");
            int n= sc.nextInt();

            //we check num is even or not.

            if(n%2==0){
                even+=n;
            }
            else{
                odd+=n;
            }
            //now will initialize a variable as choice to choose to continue or stop
            System.out.println("Press 1 to continue and 0 to stop");

            choice= sc.nextInt();
        }
        while(choice==1);
        System.out.println("Sum of even num"+ " "+even);
        System.out.println("Sum of odd num"+ " " +odd);
    }
}