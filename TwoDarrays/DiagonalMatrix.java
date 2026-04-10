package TwoDarrays;

// what is diagonal it is crosssection of matrix..
// for getting diagonals 

public class DiagonalMatrix {

    public static int getDiagonal(int matrix[][]){
    //     int sum=0;
    //     for(int i =0;i<matrix.length-1;i++){
    //         for(int j=0;j<matrix[0].length-1;j++){
    //             if(i == j){
    //                 sum += matrix[i][j];
    //             }
    //             else if(i + j == matrix.length-1){
    //                 sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum; 
    // }

    // optimized approach
    int sum=0;
    for(int i=0;i<matrix.length;i++){

        //primary diagonal- row + col-> i + i/
        sum+=matrix[i][i];
        //Secondary diagonal
        if(i != matrix.length-1-i){
        sum+= matrix[i][matrix.length-i-1]; 
    }
    return sum;
    }
    }
    public static void main(String[]args){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
       System.out.print(getDiagonal(matrix));
    }
}


