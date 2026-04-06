package functions.methods;

import java.util.Scanner;

public class Sum {
    
    public static int getSum(int num){
        int sum=0;
        while(num>0){
        int n= num%10;
        sum+=n;
        num=num/10;
    }
    return sum;
}
    public static void main(String[]args){
        System.out.println(getSum(2345));
        System.out.println(getSum(65422));
        System.out.println(getSum(5432));
    }
}
