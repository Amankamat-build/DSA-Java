package ARRAYS;

import java.util.*;

public class ArrayFuntions {

    public static void UpdateMarks(int marks[]){
        // we wanna add 2 to each marks in array.
        //for that run loop that runs till array length.
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[]args){
        int marks[]={56, 89, 78};
        UpdateMarks(marks);
        //for printing index of marks have to run loop/
        for(int i=0;i<=marks.length;i++){
            System.out.print(marks[i] + " ");
        }
    }
}
