public class Arrays_2D {
    // public static boolean search(int matrix[][], int key){
    //     boolean found = false;
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==key){
    //                 System.out.println("Element found at index :("+i+","+j+")");
    //                 found = true;
    //             }
    //             if(matrix[i][j]>largest){
    //                 largest = matrix[i][j];
    //             }
    //             if(matrix[i][j]<smallest){
    //                 smallest = matrix[i][j];
    //             }
    //         }
    //     }
    //     System.out.println("The largest value is :"+largest);
    //     System.out.println("The smallest value is :"+smallest);
    //     found = false;
    //     return found;
    // }

    //SPIRAL MATRIX 
    // public static void spiralMatrix(int matrix[][]){
    //     int startRow = 0;
    //     int startColumn = 0;
    //     int endRow = matrix.length-1;
    //     int endColumn = matrix[0].length-1;
    //     while(startRow<=endRow && startColumn<=endColumn){
    //            //top
    //     for(int j=startColumn;j<=endColumn;j++){
    //         System.out.print(matrix[startRow][j]+" ");
    //     }
    //     //right
    //     for(int i=startRow+1;i<=endRow;i++){
    //         System.out.print(matrix[i][endColumn]+" ");
    //     }
    //     //bottom
    //     for(int j=endColumn-1;j>=startColumn;j--){
    //         if(startRow==endRow){
    //             break;
    //         }
    //         System.out.print(matrix[endRow][j]+" ");
    //     }
    //     //left
    //     for(int i=endRow-1;i>=startRow+1;i--){
    //         if(startColumn==endColumn){
    //             break;
    //         }
    //         System.out.print(matrix[i][startColumn]+" ");
    //     }

    //     startColumn++;
    //     startRow++;
    //     endColumn--;
    //     endRow--;
    //     }
     
      
    // }

    //DIAGONAL SUM OF MATRIX
    // public static int diagonalSum(int matrix[][]){
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     int sum = 0;
    //     // for(int i=0;i<n;i++){
    //     //     for(int j=0;j<m;j++){
    //     //         if(i==j){
    //     //             sum+=matrix[i][j];
    //     //         } else if(i+j==n-1){
    //     //             sum+=matrix[i][j];
    //     //         }
    //     //     }
    //     // }
    //     // return sum;
    //     for(int i=0;i<n;i++){
    //         //primary diagonal
    //         sum+=matrix[i][i];
    //         //secondary diagonal
    //         if(i!=n-1-i)
    //         sum+=matrix[i][n-1-i];
    //     }
    //     return sum;
    // }

    //SEARCH IN SORTED MATRIX
    public static boolean sortedSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Index ("+row+","+col+")");
                return true;
            } else if (key<matrix[row][col]) {
                col--;
            } else{
                row++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }

    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //    int matrix [][] = new int [3][3];
    //    int n = matrix.length , m = matrix[0].length; 
    //    for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         matrix[i][j] = sc.nextInt();
    //     }
    //    }

    //    //output
    //    for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         System.out.print(matrix[i][j]+" ");
    //     }
    //     System.out.println();
    //    }
    //    search(matrix, 5);
    // }

    //SPIRAL MATRIX
    // int matrix [][] = {{1,2,3,4},
    //                     {5,6,7,8},
    //                     {9,10,11,12},
    //                     {13,14,15,16}};
    //     spiralMatrix(matrix);

        //DIAGONAL MATRIX SUM
        // int matrix [][] = {{1,2,3,4},
        //                     {5,6,7,8},
        //                     {9,10,11,12},
        //                     {13,14,15,16}};
        // System.out.println(diagonalSum(matrix));

        //SORTED MATRIX SUM 
        int matrix [][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        sortedSearch(matrix, 10);


}
}
