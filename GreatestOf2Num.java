//find the greatest of 2Number...

import java.util.Scanner;

public class GreatestOf2Num {
   public static void main(String[]args){
    // for checking the Greatest num in the 2 nums..
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a");
    int a= sc.nextInt();
    System.out.println("Enter b");
    int b= sc.nextInt();
    System.out.println("Enter c");
    int c=sc.nextInt();

    if((a>b)&&(a>c)){
       System.out.println("Greatest among the nums is num1"+ " "+a);
    }
   
    if((b>a)&&(b>c)){
        System.out.println("Greatest among the nums is num2"+ " " +b);
    }
    else{
        System.out.println("Greatest among the nums is num3"+ " " +c);
    }
   }
}
