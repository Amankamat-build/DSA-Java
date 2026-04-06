//Prime Number is number that is divisble by 1 and itself only.
//and the remaning num is call composites..
//formula to check whether its prime or not is n%2==0 -> then the num is not prime..

import java.util.Scanner;

public class PrimeNum1{
    public static void main(String[]Prime){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to check prime");
        int n= sc.nextInt();

        // we will use a boolean datatype to get output in true and false form..
        
        //we intilized i as 2 so when evr we check 2 it will be prime num..
        if(n==2){
            System.out.println("Num is prime");
        }

        boolean isPrime=true;


        //now we will run a loop that will run till n-1 and checkes whether it is divisble any other num below.
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
                isPrime=false;
            }
    }
    if(isPrime){
        System.out.println("is prime"+ " " +n);
    }
    else{
        System.out.println("is not prime"+ " " +n);
    }
}
}

