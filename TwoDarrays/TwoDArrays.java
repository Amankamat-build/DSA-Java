package TwoDarrays;

//2D arrays stand for 2 dimenstional arrays which are having row and colums..
//also known as matrix

import java.util.Scanner;
public class TwoDArrays { 

    public static boolean Search(int matrix[][] , int key){

        for(int i=0; i<matrix.length ;i++)
            {
            for(int j=0; j<matrix[0].length ;j++){

                if(matrix[i][j]==key){
                    System.out.print("key found" + i + j);
                    return true;
                }
            }
        }
         System.out.print("key not found");
        return false;
    }

    public static void main(String[]args){

        // Creating 2D arrays
        int matrix[][]= new int[3][3];

        int n= matrix.length ; // for getting row length
        int m= matrix[0].length; // for gettin colum length
        int key=6;

        // now run one outer loop for row, and 2nd loop for colum

        Scanner sc= new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                matrix[i][j]= sc .nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i] [j] + " ");
            }
            System.out.println();
        }
        // for getting search result ..
      boolean found=Search(matrix, key);

      System.out.print(found);
    }
}
