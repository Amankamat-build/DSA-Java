// to get num is odd or even
//even num->divisiable by 2

import java.util.Scanner;

public class EvenNum{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n1=sc.nextInt();

        if(n1%2==0){
            System.out.println("num is even"+ "" +n1);
        }
        else{
            System.out.println("num is odd" +" " +n1);
        }

    }
}