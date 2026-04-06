//if num is n%2==0 then it is even num otherwise odd num.
// get true if even else flase..

package functions.methods;

import java.util.*;

public class isEven{

    public static boolean isEven(int n){
        return n%2==0;
    }
    public static void main(String[]args){
        int n= 8;
        if(isEven(n)){
            System.out.println("num is even"+ " " +n);
        }
        else{
            System.out.println("num is not even"+ " " +n);
        }
    }
}