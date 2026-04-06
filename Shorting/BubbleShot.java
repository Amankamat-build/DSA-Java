package Shorting;

import java.util.Scanner;

//Main thing about bubble sort is it works on turn where 1st greater num is settle then it beigns from there itself

public class BubbleShot{

    public static void bubbleSort(int arr[]){
        //1st loop that runs from index 1 to last;
        for(int turn=0;turn<arr.length-1;turn++){

            //as the turn increases arranging cases decreases in loop 
            for(int j=0;j<arr.length-1-turn;j++){

                // now we have to compare curr index to next index
                //Comparing and Swapping numbers 
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                };
            }
        }
    }
    public static void getResult(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5, 4, 1, 3, 2};
        bubbleSort(arr);
        getResult(arr);
    }
}