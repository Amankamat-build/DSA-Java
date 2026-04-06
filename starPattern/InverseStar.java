package starPattern;

import java.util.*;

//inverse star pattern.

class InverseStar{

    public static void main(String[]args){
        System.out.println("Enter the n of stars");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int l=1;l<=n;l++){    //l is used for line -> inverse is used for decreseing.
            for(int s=1;s<=n-l+1;s++){//s is used for star-> in decreasing order.
            //(n-l+1)-1st line(4-1+1)->2nd line(4-2+1)->3rd line(4-3+1)
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

