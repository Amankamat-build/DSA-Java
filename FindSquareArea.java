//find the area of the square..

import java.util.Scanner;

public class FindSquareArea {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the height of square");
        int h=sc.nextInt();
        System.out.println("Enter the width of Square");
        int w=sc.nextInt();

        int SquareArea= h*w;

        System.out.println("Area of the square"+ " " +SquareArea);
    }
}
