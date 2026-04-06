
//Sum of 1st n natural number means-> adding all the num from 1 to the mentioned num..

import java.util.Scanner;

public class SumOf1stN {
   public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter num to find sum 1st natural num ");
    int n=sc.nextInt();

    //for getting sum of 1st n natural num, 
    //we have to intialize one value variable as 1..
    //and one sum variable to store the sum of the data..

    int val=1;
    int sum=0;

    //we will check and fix value shld be less then n.. and all the num shld be added one by one.
    while(val<=n){
       sum=sum+val;  
       val=val+1;
        System.out.println("Sum of 1st natural num of this num is " +sum);
    }

   }
}
