// find the avg of the 2 numbers.

import java.util.Scanner;

public class AvgOf3num {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a= sc.nextInt();
        System.out.println("Enter the 2nd num");
        int b=sc.nextInt();
        
        int avgNum= a+b/2;
        System.out.println("Avg of 2 numbers is :" +" " +avgNum);
    }
}
