package ARRAYS;

//Binary Search in array

public class BinarySearch {

    public static int getBinarySearch(int num[],int key){
        //in binarySearch rule -> get Start, get end, get mid after that compare..
        int start=0;
        int end= num.length-1;

        while(start<end){
            int mid= (start+end)/2;
            //now compare mid of array with key start, end and if greater then start increase start else decrease end.
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start= mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[]args){
        //create a array   
        int num[]={2,4,6,7,8,10,12,14};
        int key=7; // that to find in the array.
        int result= getBinarySearch(num, key);
        System.out.println("The binarySearch of array is:"+ " " +result);
    }

}