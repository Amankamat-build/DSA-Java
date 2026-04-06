package Shorting;

// in the selection sort get the smallest num and placed it on to front..

public class SelectionSorting {
    public static void SelectSort(int arr[]){
        int MinVal=0;
        for(int i=0;i<arr.length-1;i++){
                                       // initilize i as MinVal
            MinVal=i;   
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[MinVal]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static void getResult(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[]={4, 5, 2, 3, 1};
        SelectSort(arr);
        getResult(arr);
    }
}
