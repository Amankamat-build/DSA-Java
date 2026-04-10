package TwoDarrays;

//Spiral matrix is the matrix which we have to print the outer side of matrix later then goin inside of it
// top, left, bottom, right..

public class SprialMatrix{
    public static void SpiralMatrix(int matrix[][]){
        //get the starting raw, starting col, end row, end col
        int startCol=0;
        int startRow=0;
        int endRow= matrix.length-1;
        int endCol= matrix[0].length-1;

        while(startCol<=endCol && startRow <= endRow){
        //top values 
        for(int j= startCol;j<=endCol;j++){
            System.out.print(matrix[startRow] [j] + " ");
        }
        //right
        for(int i= startRow+1;i<=endRow;i++){
            System.out.print(matrix[i][endCol]);
        }

        for(int j= endCol-1;j>=startCol;j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[endRow][j]+ " ");
        }
            
            for(int i=endRow-1;i<startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
                startRow++;
                startCol++;
                endRow--;
                endCol--;
                
        }
    
    }

    
    public static void main(String[]args){

        int matrix[][]={{1, 2, 3, 4},
                     {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
        SpiralMatrix(matrix);
    }
}