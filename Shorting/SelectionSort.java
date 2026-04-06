package Shorting;

//Selection sort means selecting the smallest among array and placing in front in increasing order.

public class SelectionSort {

    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int MinVal=i;
            for(int j=i+1;j<arr.length;j++){  // j shld run till arr.length
                if(arr[MinVal]>arr[j]){
                    MinVal=j;
                }
                //Swapping 
           int temp=arr[MinVal];
           arr[MinVal]=arr[i];
           arr[i]=temp; 
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

        // so this's the given array sort it by selection sort ->Increasing order.
        int arr[]={5, 4, 1, 3, 2 };
        SelectionSort(arr);
        getResult(arr);
    }
}
