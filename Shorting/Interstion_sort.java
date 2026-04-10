package Shorting;

import java.util.Arrays;
import java.util.Collections;

//interstion sorting is sorting in which select the max num frm array and compare with all remaning
//arranging in sorted way.
//take one curr value and 1 back value if back one is greater then place it at curr and 
//sort that Min num to its place
class Interstion_sort{
    public static void interstionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //previous should be inside the array means it shld target value of indicies
            while(prev>=0 && arr[prev]>=curr){
               arr[prev+1]=arr[prev];
                prev--;
            }
        //now we will set condition if prev greater then curr then move front .
         arr[prev+1]= curr;
        }
    }
    public static void getResult(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Integer arr[]={5, 4, 1, 3, 2};
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
      //  System.out.println(Arrays.toString(arr));
       // Arrays.sort(arr, 1, 3);
       // Arrays.sort(arr,Collections.reverseOrder());
       // System.out.println(Arrays.toString(arr));
       // getResult(arr);
    }
}
