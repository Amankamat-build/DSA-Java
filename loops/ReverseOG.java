package loops;

import java.util.Scanner;
public class ReverseOG {
    public static void main(String[]rev){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the num for the reverse");
    int num=sc.nextInt();

    int revNum=0;
    while(num>0){

        int lastNum=num%10; // for getting last num
        revNum= (revNum*10)+lastNum; //adding lst num to the variable.
        num=num/10; //for updating or remving num from numbers..
    
    }
   System.out.print(revNum);
    }
}
