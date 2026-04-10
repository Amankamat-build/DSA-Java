package TwoDArraysAssisment;

//print the no of 7s in 2d arrays.

public class getTheNoNums {

    // public static void searchNum(int arr[][], int num){
    //     int row=arr.length-1;
    //     int col=  arr[0].length-1;
    //     int sum=0;

    //     if(arr[row][col]==num){
    //         System.out.print("No of Nums" + row + col);
    //         sum+= arr[row][col];
    //         System.out.println(sum);
    //     }
    // }
    public static void main(String[]args){
        int arr[][]={{4, 7, 8},
                     {8, 8, 7}};
      int no=0;
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==8){
                no++;
            }
        }
         System.out.print("total no of 7 :"+ " "+ no);}
    }
 
}
