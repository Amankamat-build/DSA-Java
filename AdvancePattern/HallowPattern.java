package AdvancePattern;

class Hallow_pattern{
    
    public static void HallowPatter(int totRows, int totCols){
        //outerloop that will run for printing the lines or row
        for(int i=1; i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1||i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        HallowPatter(4,5);
    }
}