package Shorting;

import AdvancePattern.invertedHalfPyramid;

//In counting sort 1st find the largest num in arry
//create a new array to store frequency of num
//later then sort frequncy count array

public class Counting_sort {
    public static void counting_Sort(int arr[]){

        int largest= Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            // compare with indexes and get MAX among them
            largest= Math.max(largest, arr[i]);
        }
        // for getting the frequncy of numm means repeated num frequncy will be calculated
        int count[]= new int[largest + 1];
        for(int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }

        // now have to convert frequncy arr to shorted arr

        int j=0;
        for(int i=0;i< count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
}
    public static void getResult(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[]={5, 6, 8, 1, 5, 6, 1};
        counting_Sort(arr);
        getResult(arr);
    }
}
