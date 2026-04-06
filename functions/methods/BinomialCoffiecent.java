package functions.methods;

import java.util.Scanner;
// the formula of BinomialCoffiecent-> n!/r!(n-r)!..

public class BinomialCoffiecent {
    
    public static int getFactorial(int n){
        int fact=1;

        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int getBionomialCoffie(int n, int r){
        // formula for BionomialCoffiecent -> n!/r!(n-r)!.

        int fact_n= getFactorial(n); // factorial of n.

        int fact_r=getFactorial(r);// factorial of r.

        int fact_nmr= getFactorial(n-r);

        int fact= fact_n/(fact_r*fact_nmr);

        return fact;
    }
     
    public static void main(String[]args){
    System.out.println(getBionomialCoffie(10,2));
    }
}
