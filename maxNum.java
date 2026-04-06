// to finf the max of the three number

import java.util.Scanner;

//in java 1st we have to make class
class maxNum {

//after that we have to initalize it...
    public static void main(String[]args){
        //for taking input..
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a");
        int a=sc.nextInt();
        System.out.println("enter the b");
        int b=sc.nextInt();
        System.out.println("Enter the c");
        int c=sc.nextInt();

        //now we have to compare btwn all nums..
        if(a>=b && a>=c){
            System.out.println("Max num is :" +a);
        }
        else if(b>=a && b>=c){
            System.out.println("Max num is :" +b);
        }
        else{
            System.out.println("Max num is :" +c);
        }
    }
    };
