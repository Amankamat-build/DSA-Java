package TwoDarrays;

//Spiral means rotating overall boundires and comes to center
// get starting row, staring col, end row, end col..

public class SpiralMatrixx {
    public static void spiralMatrix(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        //1st initilize edge case
        while(startRow<=endRow && startCol<=endCol){
            // nw print top of matrix.
            for(int i=startCol; i<=endCol;i++){
                System.out.print(matrix[startRow][i] + " ");
            }
            
            // for printing right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol] + " ");
            }
            // printing bottom from left to right..

            for(int i= endCol-1;i>startCol;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][i] +" ");
            }
            //left
            for(int i=endCol-1;i>startCol;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        }
    public static void main(String []args){
        int matrix[][]={{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
        spiralMatrix(matrix);
    }   
}
