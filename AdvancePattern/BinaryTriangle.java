package AdvancePattern;

public class BinaryTriangle {
    public static void BinaryTriangle(int n){
        //outer loop to run the rows till n..
        for(int i=1;i<=n;i++){
            //for printing the pattern
            for(int j=1;j<=i;j++){
                //we have to print 1,0 as a patternnn
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        BinaryTriangle(5);
    }
}
