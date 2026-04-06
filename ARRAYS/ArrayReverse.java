package ARRAYS;

public class ArrayReverse {
    public static void Reverse(int num[]){
        //initlize starting and ending in array.
        int start=0;
        int end= num.length-1;

        while(start<end){
            //Swappint of the number..
            int temp= num[end];
            num[end]=num[start];
            num[start]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[]args){
        int num[]={2,4,5,7,6,8,10,12};

        Reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] +  " ");
        }
    }
}
