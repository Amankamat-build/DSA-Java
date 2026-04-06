package ARRAYSII;

public class PrefixArray {
    public static void PrefixArray(int num[]){
        int sum=0;
        int MaxSum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1] + num[i];
       }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                int currSum= start == 0 ? prefix[end]: prefix[end] - prefix[start-1];
                if(MaxSum<currSum){
                    MaxSum=currSum;
                }
            }
        }
        System.out.print("Max SABARRAY sum using prefix:" + MaxSum);
    }
    public static void main(String[]args){
        int num[]={2,3,5,6,7,8};
        PrefixArray(num);
    }
}
