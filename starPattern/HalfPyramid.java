package starPattern;

//half pyramid-> is a pattern in the num increasing order.

import java.util.*;

public class HalfPyramid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num= 4;

        //run two loops outer loop for the line.
        //inner loop for the num.

        for(int line=1;line<=num;line++){
            for(int n=1;n<=line;n++){
                System.out.print(n); // for printing any increasing num of print the initilizer..
            }
            System.out.println(" ");
        }
        
    }
}
