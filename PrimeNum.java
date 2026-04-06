//Number that are divisible by itself or by 1 knwn as prime number..

//for solving this problem we have to 1st take the input.. N->initilize the diviser->2
//after that we have to set the div -> everytime it shld run and check t0 n-1..

import java.util.Scanner;

public class PrimeNum{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    // we will take input n to check whether its primw num or num.
    System.out.println("Enter the num to check");
    int n=sc.nextInt();

    //now prime num is divisble by 1 and itself..
     int div=2;
     boolean isPrime=true;

     if(n<=1){
        System.out.println("num is not prime");
     }

    // div should be less then n.
    while(div<=n/2){
        //now we apply the condition if (n%d==0) its not prime num;
        if(n%div==0){
            isPrime=false;
            break;
        }
        div++;
    }
    if(isPrime){
        System.out.println(n+"Num is prime");
    }
    else{
        System.out.println(n+"Num is not prime");
    }
    }

   }
