

//public class ArraysPS {
    // public static void printMatrix(int matrix[][]){
    //     // for printing column 
    //     // int col = 2;
    //     // for(int i=0;i<matrix.length;i++){
    //     //     System.out.println(matrix[i][col]);
    //     // }

    //     // for printing row  
    //     int row = 2;
    //     for(int j=0;j<matrix[0].length;j++){
    //         System.out.print(matrix[row][j]+" ");
    //     }
    // }

    // public static void spiralMatrix(int matrix[][]){
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     int sr = 0, sc = 0, er = n-1, ec = m-1;
    //     int row , col;

    //     while (sr<=er && sc<=ec) { 
    //         // starting column sr to er 
    //         col = sc;
    //         for( row=sr;row<=er && sc<=ec;row++){
    //             System.out.printf(matrix[row][col]+" ");
    //         }
    //         sc++;


    //         // ending row sc to ec 
    //         row = er;
    //         for(col=sc;col<=ec && sr<=er ;col++){
    //             System.out.printf(matrix[row][col]+" ");
    //         }
    //         er--;

    //         // ending column er to sr  
    //         col = ec;
    //         for(row=er;row>=sr && sc<=ec;row--){
    //             System.out.printf(matrix[row][col]+" "); 
    //         }
    //         ec--;

    //         //starting row ec to sc
    //         row = sr;
    //         for(col=ec;col>=sc && sr<=er ;col--){
    //             System.out.printf(matrix[row][col]+" ");
    //         }
    //         sr++;

    //     }
    // }

    //transpose of a matrix 
    // public static int[][] transposeMatrix(int matrix[][]){
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     int newMatrix [][] = new int [m][n];

    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             newMatrix[j][i] = matrix[i][j];
    //         }
    //     }
    //     return newMatrix;
    // }

    // public static void printMatrix(int newMatrix[][]){
    //     for(int i=0;i<newMatrix.length;i++){
    //         for(int j=0;j<newMatrix[0].length;j++){
    //             System.out.print(newMatrix[i][j]+" ");
    //         }
    //     }
    // }

    //TRANSPOSE ONLY SQUARE MATRIX 
    // public static int[][] transposeMatrix(int matrix[][]){
    //         int n = matrix.length;
    //         int current_c = 0;
    //         int current_row = 0;

    //         while(current_row<n){
    //             int i = current_row;
    //             for(int j=current_c;j<n;j++ ){
    //                 int temp = matrix[i][j];
    //                 matrix[i][j] = matrix[j][i];
    //                 matrix[j][i] = temp;
    //             }
    //             current_c++;
    //             current_row++;
    //         }
    //        return matrix;
    //     }
    //       public static void printMatrix(int Matrix[][]){
    //     for(int i=0;i<Matrix.length;i++){
    //         for(int j=0;j<Matrix[0].length;j++){
    //             System.out.print(Matrix[i][j]+" ");
    //         }
    //     }
    // }

   // public static void main(String[] args){
        
        // int matrix [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        // spiralMatrix(matrix);

        // Transpose of a matrix 
        // int matrix [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        // int newMatrix[][] = transposeMatrix(matrix);
        // printMatrix(newMatrix);

       // transpose of square matrix 
    //    int matrix[][] = {{1,2,3,3},{4,5,6,6},{7,8,9,9},{10,11,12,12}};
    //    transposeMatrix(matrix);
    //    printMatrix(matrix);


    //PROBLEM NUMBER -1 
    // int matrix [] [] =  { {4,7,8}, {8,8,7} };

    // int outof7 = 0;
    // for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //         if(matrix[i][j] == 7){
    //             outof7++;
    //         }
    //     }
    // }
    //    System.out.println(outof7);

    //PROBLEM NUMBER - 2

//     int num [][] = { {1,4,9},{11,4,3},{2,2,3} };

//     int rows = 1;
//     int sum = 0;
//     for(int j=0;j<num[0].length;j++){
//         sum+=num[rows][j];
//     }

//     System.out.println("The sum of second row :"+sum);
//     }
// }
