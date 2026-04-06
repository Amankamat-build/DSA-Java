package ArrayAssignment;

//given an array which is rotated from an index;
//find the index->target from where num is rotated;
//for getting target frm where its rotated we goona use binary search
public class RotatedSortedArray {

    public static int getTarget(int num[], int target){
        // for binary search we shld find mid 1st..
        int start=0;
        int end= num.length-1;

        int mid= start+(end-start)/2;

        while(start<=end){
            if(num[mid]==target){
                return mid;
            }

            if(num[start]<=num[mid]){
                if(num[start]<=target && target < num[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
               if (num[mid]<target && target <=num[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        }
         return -1;
    }
    public static void main(String[]args){
        int num[]={4, 5, 6, 7, 0, 1, 2};
        int target=3;
        System.out.print(getTarget(num, target));
    }
}
