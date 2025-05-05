
public class backtracking {
    // CHANGE IN ARRAY 
    public static void changeArr(int arr[], int val, int i){

        if(i==arr.length){
            printArr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArr(arr, val+1, i+1); // recursion 
        arr[i] -= 2;  // backtracking 

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // FIND ALL SUBSET 
    public static void subSet(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            } else{
                System.out.println(ans);
            }
           
            return;
        }


        //sub string 
        // yes 
        subSet(str, ans+str.charAt(i), i+1);

        //no
        subSet(str, ans , i+1);
    }


    //FIND PERMUTATION OF A STRING 
    public static void findPer(String str, String ans){ //O(n*n!) which is time complexity of the function 
        // base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion call 
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);

           String  newStr = str.substring(0, i) + str.substring(i+1);
            findPer(newStr, ans+curr);
        }
    }

    // N- QUEENS PROBLEM 
    public static void nQueens(char chessB[][], int row){
        //base case 
        if(row==chessB.length){
            // printCB(chessB);
            count++;
            return;
        }

        // column loop 
        for(int j=0;j<chessB.length;j++){
            if(isSafe(chessB, row, j)){
                chessB[row][j] = 'Q';
                nQueens(chessB, row+1); //function call 
                chessB[row][j] = 'x'; // backtracing  
            }   
        }
    }
    //print board 
    static int count = 0;
    public static void printCB(char chessB[][]){
        System.out.println("------chessB------");
        int n = chessB.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(chessB[i][j]+ " ");
            }   
            System.out.println();    
        }
       
    }
    //safe function 
    public static boolean isSafe(char chessB[][], int row, int col){
        //vertically up 
        for(int i=row-1;i>=0;i--){
            if(chessB[i][col] == 'Q')
            return false;
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chessB[i][j]=='Q') return false;
        }
        //diagonal right 
        for(int i=row-1, j=col+1; i>=0&&j<chessB.length;i--,j++){
            if(chessB[i][j]=='Q') return false;
        }

        return true;
    }

    public static int gridWay(int i, int j, int n, int m){
        //base case 
        if(i==n-1 && j==m-1){
            return 1 ;
        }

        else if(i==n || j==m){
            return 0;
        }

       int w1 =  gridWay(i+1, j, n, m);
       int w2 = gridWay(i, j+1, n, m);
       return w1+w2;
    }

    //SUDOKO
    public static boolean sudoku(int sudoku[][], int row, int col ){
        //base case
        if(row == 9){
           return true;
        } 

       //recursion 
       int nextRow = row, nextCol = col + 1;
       if(nextCol==9){
           nextRow = row + 1;
           nextCol = 0; 
       }

       if(sudoku[row][col] != 0){
           return sudoku(sudoku, nextRow, nextCol);
       }
       for(int digit=1;digit<=9;digit++){
           if(isSafe(sudoku, row, col, digit)){
               sudoku[row][col] = digit;

               if(sudoku(sudoku, nextRow, nextCol)){
                   return true;
               }
               sudoku[row][col] = 0;

           }
       }
       return false;
   }

   public static boolean isSafe(int sudoku[][], int row, int col, int digit){
       //column
       for(int i=0;i<=8;i++){
           if(sudoku[i][col]==digit) return false;
       }

       //row
       for(int j=0;j<=8;j++){
           if(sudoku[row][j]==digit) return false;
       }

       //grid calcuation
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<sr+3;i++){
           for(int j=sc;j<sc+3;j++){
               if(sudoku[i][j] == digit){
                   return false;
               }
           }
        }
        return true; 
   }

   public static void printSudoku(int sudoku[][]){
       for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
               System.out.print(sudoku[i][j]+ " ");
           }
           System.out.println();
       }
   }
    public static void main (String [] args){
        // int arr[] = new int [5];
        // changeArr(arr, 1, 0);
        // printArr(arr);

        //subString 
        // String str = "abc";
        // subSet(str, "", 0);

        //PERMUTATION 
        // String str = "abc";
        // findPer(str, "");


        //N- QUEENS PROBLEM
        // int n = 4;
        // char chessB [][] = new char[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         chessB[i][j] = 'x'; //initial stage me chessB me sabhi  row and column me x hai 
        //     }
        // }
        // nQueens(chessB, 0);
        // System.out.println("The total number of count = "+count);


        // grid ways code 
        // int n = 3;
        // int m = 3;
        // System.out.println("The total number of the way = "+gridWay(0, 0, n, m));


        //SUDUKOO PROGRAM 

        int sudoku[][] = {{5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
            };

            if(sudoku(sudoku, 0, 0)){
                System.out.println("Solution exist");
                printSudoku(sudoku);
            } else{
                System.out.println("Solution does not exist");
            }
        






    }
}
