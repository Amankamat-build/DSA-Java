package AdvancePattern;

public class InvertedRotartedPattern {

    public static void InvertedRotatedPattern(int n){
        //outer loop for printing the rowss
        for(int i=1;i<=n;i++){

            //for printing spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        InvertedRotatedPattern(5);
    }
}
