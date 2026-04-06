package functions.methods;

import java.util.*;
public class Product {

    public static int GetProduct(int a, int b){
        int Product= a * b;
        return Product;
    }
    public static void main(String[]args){
    int a=4;
    int b= 5;
    int product=GetProduct(a,b);
    System.out.println("Product of the num"+ " " +product);

    int prod= GetProduct(6,6);
    System.out.println("a * b =" + prod);

    }
}
