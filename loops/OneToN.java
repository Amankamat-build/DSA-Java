package loops;

import java.util.Scanner;

public class OneToN {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int counter=1;
        //now we will use a loop in which n will be less then 7.. and increments by one 
        while(counter<=n){
            System.out.println("The number is"+" "+counter);
            counter++;
        }
    }
}
