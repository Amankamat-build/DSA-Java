package ArrayAssignment;

//returns true if any value appears at least twice..
//return false if every element is distinct.
//for checking the repeated num in array compare curr index with next index.

public class repeatedNumArray{
    public static boolean getRepeatedNum(int arr[]){

        for(int i=0;i<arr.length-1;i++){  // to go through array from index 0;

            for( int j=i+1;j<arr.length;j++){ //gettin next num front of i;
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
     
    public static void main(String[]args){
        int arr[]={1, 2, 3, 4};
        System.out.println(getRepeatedNum(arr));
    }
}