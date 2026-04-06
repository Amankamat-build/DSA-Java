package functions.methods;

//Prime Number the number which are divisible by 1 and itself .

import java.util.*;
public class PrimeNUM1 {

    public static Boolean isPrime(int n){
        // N shloud be always greater then 1.
        if(n<=1){
            return true;
        }
        //if n will be equals to 2 then return false.
        if(n==2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
   // for printing primeNum in range..
    public static void primeInRange(int n){
        //we have to run loop from 2 to n.
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println("primeNum in range are" + i);
            }
        }
    }

    public static void main(String[]args){
    primeInRange(10);
    primeInRange(20);
    }
}
