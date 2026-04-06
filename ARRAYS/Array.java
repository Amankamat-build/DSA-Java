package ARRAYS;

import java.util.Scanner;
// arrays are the collection of data ,data stored are same datatype, and placed contiuguesly in memory
public class Array {
    
    // 1st have to initlize array -> datatype name[]= new datatype[]
    public static void main(String[]args){
    int marks[]= new int[50];
    Scanner sc = new Scanner(System.in);

    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    
    System.out.println("marks 1 =" + marks[0]);
    System.out.println("marks 2 =" + marks[1]);
    System.out.println("marks 3 =" + marks[2]);

//we have intilized marks from 0 index to 3 later on we can update it aswell..
    marks[2]=marks[2]+2;
    System.out.println("marks 3 =" + marks[2]);

}
}

