package functions.methods;

// writing function for the swap operation.

import java.util.Scanner;
public class SwappingFun {

    public static void GiveSwap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        return ;
    }
    public static void main(String[]args){
        int a= 55;
        int b =44;

        GiveSwap(a,b);
        System.out.println("A value is"+ " "+a);
        System.out.println("B value is"+ " " +b);
    }
}
