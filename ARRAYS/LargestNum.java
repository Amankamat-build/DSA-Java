package ARRAYS;

public class LargestNum {
    public static int LargestNumm (int num[]){
        //for finding largest from nums
        // we have to use buildin function ie integer.MAX_Value for +infinity
        // integer.MIN_Value for -infinity these are the util package function.\

        int largestNum= Integer.MIN_VALUE; //-infinity gets the highest value from array
        int SmallestNum= Integer.MAX_VALUE; //+infiniy gets smallest value from array.
        for(int i=0;i<num.length;i++){
            // now we will use a conditional statement to check the numbers
            if(largestNum<num[i]){
                largestNum = num[i];
            } 
        }if(smallestNum>num[i]){
                smallestNum=num[i];
            }
        return largestNum;
    }
    public static void main(String[]args){
        int num[]={2, 4, 7, 9, 6};
        int GetLargest=LargestNumm(num);
        System.out.println("The largest among the numbers"+ " " +GetLargest);
    }
}
