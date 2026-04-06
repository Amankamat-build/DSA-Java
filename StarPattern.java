//for solving any star pattern questions we have to use two loops;
//one for printing space " ", and another for printing * .
// jst change in the loop as per the question..

///Print top right tringle star..

import java.util.Scanner;

public class StarPattern{
    public static void main(String[]args){
    //we will take input n to print no of star..
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no of star");
    int n=sc.nextInt();
    int row,col;
    //for printing star pattrn we have to use two loop 1 for row and one for colums..
//    for(row=n;row>=1;row--){
//     for(col=1;col<=row;col++){
//         System.out.print("*");
//     }
//     System.out.println(" ");
//    }

for(row=1;row<=n;row--){
    for(col=1;col<=row;col++){
        System.out.print("*");
    }
    System.out.println(" ");
}
    }
    }

