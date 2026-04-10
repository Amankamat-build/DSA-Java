package TwoDarrays;
// so optimized solution for this problem will staircase searching.
// staircase searching starts from a specal cell that is -> matrix[0].length-1, matrix.length
// After that initilize condtions for getting key values


public class SearchInSortedMatrix {

    public static boolean searchInSortedMatrix(int matrix[][], int key){
        // intilize  row and colums..
    //     int row=0;
    //     int col=matrix[0].length-1;

    //     //now set edge case for this question
    //     while(row < matrix.length && col>=0){
    //     // now use various condtions for gettin keys.
    //     if(matrix[row][col]== key){
    //         System.out.print("Key found" + row + " " + col );
    //         return true; 
    //     }
    //     if(key < matrix[row] [col]){
    //         col--;
    //     }
    //     else{
    //         row++;
    //     }
    //     }
    //     return false;
    // }

    //searching in opposite manner
    int row=matrix.length-1;
    int col= 0;

    while(row < matrix.length && col>=0){

        if(matrix[row][col]==key){
            System.out.print("key index found"+ " "+ row +" " +col);
            return true;
        }

        if(key < matrix[row][col]){
        row--;
        }
        else{
            col++;
        }
    }
    return false;
    }

    public static void main(String[]args){
    int matrix[][]={{10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50}};
    int key= 33;
    searchInSortedMatrix(matrix, key);
}
}
