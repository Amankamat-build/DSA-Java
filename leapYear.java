//leap yr is yr tht is divisible by 100 and not divisible by 4 and 400.

import java.util.Scanner;

public class leapYear{
    public static void main(String[]leap){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int Yr=sc.nextInt();

        //We will use diff if else conditions and in the bracate write the conditions..
        if(Yr%100==0) {
         System.out.println("This is leap yr"+" " +Yr);
        }
        
       else if(Yr%4!=0 && Yr%400!=0){
        System.out.println("This is not a leap yr"+ "" +Yr);
       }

    }
}