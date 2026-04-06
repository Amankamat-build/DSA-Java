package starPattern;

public class floyedPattern {
    public static void main(String[]args){
    int num=5; // this is for num of lines;
    int N=1;

    for(int l=1;l<=num;l++){ //outerloop for num of line
        for(int n=1;n<=l;n++){ //innerloop for printing number.
            System.out.print(N);
            N++;
        }
        System.out.println("");
    }
    }
}
