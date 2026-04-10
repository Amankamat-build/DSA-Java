package shorting_Assisment;

// bubble sorting of element one at a turn and next starts from there only..

public class bubbleSort {

    public static void BubbleSort(int arr[]){
        //run a loop for getting in to array
        for(int turn=0;turn<=arr.length;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
            if(arr[j]>arr[j+1]){
                //Swapping
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
    }
    //Interstion sort.
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int MinPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[MinPos]>arr[j]){
                    int temp=arr[MinPos];
                    arr[MinPos]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    //SelectionSort
    public static void IntersionSort(int arr[]){
        int MinVal= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            MinVal= Math.min(MinVal, arr[i]);
            if(arr[MinVal]>arr[i]){
                int  temp= arr[MinVal];
                arr[MinVal]=arr[i];
                arr[i]=temp;
            }

        }
    }
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //frequncy;
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        while(count>0){
            temp=arr[i];
            j
        }

    }


    public static void getResult(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
       // BubbleSort(arr);
       // SelectionSort(arr);
        IntersionSort(arr);
        getResult(arr);
    }
}
