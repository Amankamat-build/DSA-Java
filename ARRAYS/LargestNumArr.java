package ARRAYS;

public class LargestNumArr {

    public static int largestNum(int nums[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest< nums[i]){
                largest = nums[i];
            }
        }
          return largest;
    }
    public static void main(String[]args){

        //largest among the number in array.
       int nums[]={2,7,13,23,44,1};
       int largestDigit= largestNum(nums);
       System.out.println("The largest num in array"+ " " + largestDigit);

    }
}
