package functions.methods;

// number which is divisble by itself or 1 if it is then its prime num else not

import java.util.Scanner;
public class PrimeNum {

  // funciton for primeNum.
public static Boolean isPrime (int n){
    //corner case
    if(n<=1){
        return false;
    }
   //we will check if num is equals to 2 then returns false.
    if(n==2){
        return true;
    }

    
    //now we will run loop from i=2 to i = Math.sqrt(n)->becaz in prime after half num starts repeating
    for(int i=2;i<=Math.sqrt(n);i++){
        // now will check condition is there anynum btwn the num that is totally divisible if true return false rlse true
        if(n%i==0){
            return false;
        }
    }
    return true;
}
  
    public static void main(String[]args){
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));

  }
}
