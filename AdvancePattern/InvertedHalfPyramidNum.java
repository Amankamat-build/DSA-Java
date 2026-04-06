package AdvancePattern;

public class InvertedHalfPyramidNum {
    //print number in InvertedHalfPyramid..

    public static void InvertedHalfNum(int n){

        //outerLoop for rows
        for(int i=1;i<=n;i++){
            //printing num frm 1 to n in row and decreases as the row increases..
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
        }
        System.out.println();
    }

    }
    public static void main(String[]args){
        InvertedHalfNum(5);
    }
}
