import java.util.Scanner;

public class SumOfNaturlNum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int val=1;
        int sum=0;

        while(val<=n){
            sum=sum+val;
            val+=1;
            
        }

            System.out.println("Natural num of n"+ " " +sum);
    }
}