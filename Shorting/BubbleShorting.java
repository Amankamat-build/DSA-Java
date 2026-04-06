package Shorting;

public class BubbleShorting {

    public static void bubbleSort(int arr[]){

        //for going to every index in array
        for(int turn=0;turn<arr.length-1;turn++){
            // removing the extra turns and arranges only misplaced num
            for(int j=0;j<arr.length-1-turn;j++){
                int swap=0;
                 //if greater then swap;
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;  
                swap++;
                }
                System.out.print(swap);
            }
        }
    }
    public static void getResult(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    
    public static void main(String []args){
        int arr[]={1, 2, 3, 4, 5};
        bubbleSort(arr);
        getResult(arr);
    }
}
