package functions.methods;

//factorial multiply of num from 1 to n...


import java.util.Scanner;

class Factorial{

    public static int Fact(int n){
        int fact=1;

        for(int i=1; i<=n;i++){
            fact= fact * i; // this start multiplication from 1 to the n.
        }
        return fact;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
                System.out.println( Fact(n));

    }
}
