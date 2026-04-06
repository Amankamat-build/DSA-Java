package ARRAYS;

//subarray means continuos numbers in array 

public class SubArrays {
    public static void SubArray(int num[]){
        int ts=0;
        //run loop for getting the 1st num
        for(int i=0;i<num.length;i++){
            int sum=0;
            int start=i;
            //another loop for getting the next digit present.
            for(int j=i;j<num.length;j++){
                int end=j;
                sum+=num[j];
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+ " ");
                }  
                ts++;
                System.out.println();
            } 
          
            System.out.println("Sum:" +sum);
        }
        System.out.println();
        System.out.println(ts);
    }
    public static void main(String[]args){
        int num [] ={1,2,3,4,5}; //continuous num are subarray
        SubArray(num);
    }
}
