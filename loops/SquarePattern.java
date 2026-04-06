//Print square star pattern 
//use two loops one for the col and rows.

package loops;


import java.util.Scanner;
public class SquarePattern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int n=sc.nextInt();

        for(int col=1;col<=n;col++){
            for(int row=1;row<=n;row++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
