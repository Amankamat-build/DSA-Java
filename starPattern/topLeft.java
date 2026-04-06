package starPattern;


//print star for right top to down

import java.util.*;
public class topLeft {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num of star u want");
        int n=sc.nextInt();

        for(int col=1;col<=n;col++){ // outer loop will print the line of the pattern
            for(int row=1;row<=col;row++){ // inner loop will be printing the stars.
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
