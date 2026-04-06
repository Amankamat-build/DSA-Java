package ARRAYSII;

// what is subarray - subarray is continuous num in array.
//for finding sum intilize sum and later add num j to sum.
public class MaxSubArray {
    public static void MaxSubArray(int num[]){

        //1st loop for getting starting point
        for(int i=0;i<=num.length;i++){
            //for getting the sum of subarray
            int MaxSum= Integer.MIN_VALUE; // initlized the infinite Max value
            int start=i;
            for(int j=i;j<num.length;j++){ //for getting ending point
                int end=j;
                int CurrSum=0; //Created a current variable 
            for(int k=start;k<=end;k++){
                System.out.print(num[k]+ " ");
                CurrSum+=num[k]; //added value of subarray to curr 
                if(MaxSum<CurrSum){ // Compared curr with max
                    MaxSum=CurrSum; //Stored max value in curr
                }
                 System.out.println();
            }System.out.print(MaxSum);
            }
        }
        System.out.println();
    }
  public static void main(String[]args){
    int num[]={1, -2, 6, -1,3};
    MaxSubArray(num);
  }
}
