package ARRAYS;

public class SmallestNum {

    public static int SmallestNums(int nums[]){
        int smallestNumss= Integer.MAX_VALUE;
        int largestNums=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(smallestNumss>nums[i]){
                smallestNumss=nums[i];
            }
            if(largestNums<nums[i]){
                largestNums=nums[i]; 
            } 
        }
        System.out.println("largest num in array:"+ " " +largestNums);
        return smallestNumss;
    }
    public static void main(String[]args){
        int nums[]={3,4,5,8,10,12,13};
        int SmallestNumm= SmallestNums(nums);
        System.out.println("Smallest num in array:"+ " " +SmallestNumm);
    }
}
