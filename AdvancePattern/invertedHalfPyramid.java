package AdvancePattern;

public class invertedHalfPyramid {

    public static void InvertedHalfPyramid(int n){
        for(int i=1;i<=n;i++){ //outerLoops
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void main(String[]args){
        InvertedHalfPyramid(5);
    }
}
