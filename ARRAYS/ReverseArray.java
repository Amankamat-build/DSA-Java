package ARRAYS;

//for reversing of array take 1st ad ;ast and swap them.
//reverse -> swaping

public class ReverseArray {
    public static void Reverse(int num[]){
        int start=0;
        int end=num.length-1;

        while(start<end){
            //SWAP
            int temp= num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[]args){
        int num[]={3,5,6,7,8,9,10};
        Reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
