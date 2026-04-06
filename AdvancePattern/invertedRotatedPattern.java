package AdvancePattern;

//InvertedPattern 
//invertedPattern is the pattern in which it at row 1 there is 1 star as the line increases stars also increses
class invertedRotatedPattern{

    public static void InvertedPattern(int n){
        // for running the line or row till the numm.
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
        
        }
    

    public static void main(String[]args){
        InvertedPattern(4);
    }
}



