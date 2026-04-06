package loops;

import java.util.Scanner;
public class NumReverse {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        // we have to reverse the given numm.

        while(n>0){
            int lastNum= n%10; // will get the last digit from the numbers.. after getting last num 
                               //jst print it off ;
            System.out.print(lastNum);
                                //after getting and printing the last num one by one remove it.
             n= n/10;//remove from the nums
        }
        System.out.print("");
    }
}
