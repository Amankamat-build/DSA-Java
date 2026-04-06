package loops;


//Reverse of the string or n...

import java.util.Scanner;
public class ReverseN {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        //now we will make a loop that starts from its ending and decreases to the 1st..
        for(int i=n;i<=1;i--){
            System.out.println("Reverse of the number"+ "" +i);
        }
    }
}
