package Shorting;

// bubble short is an shorting technique that finds the largest element and palces it at last..
// arranges in desecending order.
public class Bubbly {

    public static void BubbleSort(int arr[]){
    //that gets inside the array from starting to end to each index
    for(int turn=0;turn<=arr.length-1;turn++){
        //another loop that goes to each point and reduces the turn

        for(int j=0;j<arr.length-1-turn;j++){
            // Now have to compare j with j+1
            if(arr[j]>arr[j+1]){
                //now we have to swap the numbers
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

}

// another function for getting the output
    public static void getResult(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
}

    public static void main(String[]args){
        int arr[]={5, 4, 1, 3, 2};
        BubbleSort(arr);
        getResult(arr);
    }
}