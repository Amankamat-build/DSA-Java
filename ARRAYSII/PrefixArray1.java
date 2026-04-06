package ARRAYSII;

public class PrefixArray1 {
    public static void PrefixArray(int num[]){

        //we gonna get max subarray using prefix logic..
        int MaxSum= Integer.MIN_VALUE;
        int Prefix[]=new int[num.length];
        Prefix[0]=num[0];
        for(int i=1;i<Prefix.length;i++){
            Prefix[i]=Prefix[i-1]+ num[i];
        }
        for(int i=0;i<=num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                int currSum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start-1];
                if(MaxSum<currSum){
                    MaxSum=currSum;
                }
            }   
        }
         System.out.print("Max subarray using prefix:" + MaxSum);
    }
    public static void main(String[]args){
        int num[]={2,6,8,9,4,5};
        PrefixArray(num );
    }
}
