package Shorting;

public class BubblyQuestion{

    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<=arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        int MinPos=0;
        for(int i=0;i<=arr.length-1;i++){
            MinPos=i;
            for(int j=i+1;j<arr.length-1;j++){
                // now perform swapping
                if(arr[j]<arr[MinPos]){
                    int temp=arr[MinPos];
                    arr[MinPos]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //for getting output
    public static void getResult(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[]args){
       int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
    //    bubbleSort(arr);
        selectionSort(arr);
        getResult(arr);
    }
}

