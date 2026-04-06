package ARRAYSII;

//kadanes law is used for getting max subarray
//what kadanes tell is when there is smaller postive num added to larger negative num then eventually it will
// became negative only so in that case we can write 0 only..

public class KadanesAlgo {
   public static void KadanesLaw(int num[]){
    int MaxSum= Integer.MIN_VALUE;
    int CurrSum=0;

    for(int i=0;i<num.length;i++){
        CurrSum+=num[i];
        if(CurrSum<0){
            CurrSum=0;
        }
        else
            {
            MaxSum= Math.max(MaxSum,CurrSum);
        }
    }
    System.out.print("The Max subarray:" +MaxSum);
   }
    public static void main(String[]args){
        int num[]={-2, -3, 4, -1, -2, 1, 5, -3 };
        KadanesLaw(num);
    }
}
