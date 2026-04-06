
// for getting circle area we require pi,and radius.
// formula of circle= pi*r*r

import java.util.Scanner;

public class circle{
    public static void main(String[]args){
        System.out.println("Enter radius of circle");
        // let take input radius from user.
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();

        double area= Math.PI*r*r;

        System.out.println("Area of the circle"+ " " +area);
    }
}