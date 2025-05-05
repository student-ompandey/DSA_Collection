
import java.util.Scanner;

public class Array {

    // public static void updateArray(int marks[]){
    //     for(int i=0;i<marks.length;i++){
    //         marks[i] += 1;
    //     }
    // }
    //linear search 
    // public static int linearSearch(int marks[], int key){
    //     for(int i=0;i<marks.length;i++){
    //         if(marks[i]==key){
    //             return i;
    //         }

    //     }
    //     return -1;
    // }
    //linear search to string 
    // public static int linearSearch2(String menu[], String key){
    //     for(int i=0;i<menu.length;i++){
    //         if(menu[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    //LARGEST AND SMALLEST NUMBER IN  ARRAY 
    // public static int largestNum(int number[]){
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i=0;i<number.length;i++){
    //         if(number[i]>largest){
    //             largest = number[i];
    //         }
    //         if(number[i]<smallest){
    //             smallest = number[i];
    //         }
    //     }
    //     System.out.println("The smallest value of the arary is = "+smallest);
    //     return largest;
    // }

    //BINARY SEARCH 

    // public static int binarySearch(int number[], int key){
    //     int start = 0, end = number.length-1;
    //         while(start<=end){
    //            int  mid = (start+end)/2;//mid point

    //             if(number[mid]==key){ //comparisions 
    //                 return mid;
    //             }
    //             if(number[mid]<key){ //right case
    //                 start = mid+1;
    //             } else{             //left case
    //                 end = mid -1;
    //             }
    //         }
    //     return -1;
    // }


    //REVERSE ARRAYS 

    public static void reverseArray(int number []){
        int start = 0, end = number.length-1;

        while(start<end){
            //swap
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;

            start++;
            end--;
        }
    }


    //PAIRS IN AN ARRAYS 
    // public static void pairsArray(int number []){
    //     int tp = 0;
    //     for(int i=0;i<number.length;i++){ 
    //         int curr = number[i];  // 1 2 3 4 5 
    //         for(int j=i+1;j<number.length;j++){  // this loop going a head in i+1 iteration 
    //             System.out.print("("+ curr + "," + number[j] +") ");  // print pairs 
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total pairs = "+tp);
    // }

    //PRINT SUBARRAY IN ARRAY 
    // public static void subArray(int number []){
    //     int ts = 0;
    //     for(int i=0;i<number.length;i++){
    //         int start = i;
    //         for(int j=i;j<number.length;j++){
    //             int end = j;
    //             for(int k=start;k<=end;k++){
    //                 System.out.print(number[k]+" ");
    //             }
    //             ts++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("The total number of subArray = "+ts);
    // }


    //PRINT MAXIMUM SUBARRAY SUM
    // public static void subarraySum(int number[]){
    // int currentSum = 0;
    // int maxSum = Integer.MIN_VALUE;
    // for(int i=0;i<number.length;i++){
    //     int start = i;
    //     for(int j=i;j<number.length;j++){
    //         int end = j;
    //         currentSum = 0;
    //         for(int k=start;k<=end;k++){
    //             currentSum+=number[k];
    //         }
    //         System.out.println(currentSum);
    //         if(maxSum<currentSum){
    //             maxSum = currentSum;
    //         }
    //     }
    // }
    // System.out.println("The max sum of the subarray = "+maxSum);

    // }
    //CALULATE SUB ARRAY SUM USING PREFIX ARRAY
    // public static void subarraySum(int number[]){
    // int currentSum = 0;
    // int maxSum = Integer.MIN_VALUE;
    // int prefix[] = new int [number.length];

    // prefix[0] = number[0];
    // //calculate prefix array 
    // for(int i=1;i<prefix.length;i++){
    //     prefix[i] = prefix[i-1] + number[i];
    // }


    // for(int i=0;i<number.length;i++){
    //     int start = i;
    //     for(int j=i;j<number.length;j++){
    //         int end = j;
    //         currentSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
    //         if(maxSum<currentSum){
    //             maxSum = currentSum;
    //         }
    //     }
    // }
    // System.out.println("The max sum of the subarray = "+maxSum);

    // }


    //CALCULATE SUBARRAY SUM USING KADANES ALGORITHEM
    // public static void kadanes(int number[]){
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;

    //     for(int i=0;i<number.length;i++){
    //         cs = cs + number[i];
    //         if(cs<0){
    //             cs = 0;
    //         }
    //         ms = Math.max(ms, cs);
    //     }
    //     System.out.println("The maximum sum of the subArray = "+ms);
    // }

    // RAIN WATER TRAPPING QUESTION
    // public static int trappedrainWater(int height[]){
    //     //calculate left max boundary
    //     int n = height.length;
    //     int leftmax [] = new int[n];
    //     leftmax[0] = height[0];
    //     for(int i=1;i<n;i++){
    //         leftmax[i] = Math.max(height[i], leftmax[i-1]);
    //     }

    //     //calculate right max boundary 
    //     int rightmax [] = new int[n];
    //     rightmax[n-1] = height[n-1];
    //     for(int i=n-2;i>=0;i--){
    //         rightmax[i] = Math.max(height[i], rightmax[i+1]);
    //     }

        
    //     int trappedWater = 0;
    //     //loop
    //     for(int i=0;i<n;i++){
    //         //waterlevel = min(left max boun, right max boun)
    //         int waterlevel = Math.min(leftmax[i], rightmax[i]);
    //          //trapped water = water level - height[i]
    //         trappedWater += waterlevel - height[i];
    //     }
        
       
    //     return trappedWater;
    // }

    //BUY AND SELL STOCK 
   // public static int buyAndSellStock(int prices []){

      
    //     int buyPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;
    //     int n = prices.length;
    //     for(int i=0;i<n;i++){
    //         if(buyPrice<prices[i]){
    //             int profit = prices[i] - buyPrice;
    //             maxProfit = Math.max(maxProfit, profit);
    //         } else{
    //             buyPrice = prices[i];
    //         }
    //     }
    //     return maxProfit;
    // }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {10, 20, 30, 40};
        reverseArray(number);
        // int marks [] = new int[30];

        // marks[0] = sc.nextInt(); //physics 
        // marks[1] = sc.nextInt(); // chemistry
        // marks[2] = sc.nextInt(); //math

        // System.out.println("Physics = "+marks[0]);
        // System.out.println("Chemistry = "+marks[1]);
        // System.out.println("Math = "+marks[2]);

        // marks[2] = marks[2] + 1;
        // System.out.println("Math = "+marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2])/3;
        // System.out.println("The percentage is " + percentage +"%");

        // System.out.println("marks of length : "+marks.length);


        //arrays reference by value 
        // int marks [] = {20, 30, 40};
        // updateArray(marks);

        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i] +" ");
        // }

        //Linear SEARCH by integer 
        // int marks [] = {20, 30, 40, 50};
        // int key = 50;
        // int index = linearSearch(marks, key);
        // if(index==-1){
        //     System.out.println("Not found ");
        // } else{
        //     System.out.println("The index of the arrays = "+ index);
        //}

        //LINEAER SEARCH OF STRING
        // String  menu [] = {"dosa", "rice", "samosa"};
        // String key = "rice";

        // int index = linearSearch2(menu, key);
        // if(index==-1){
        //     System.out.println("Not found ");
        // } else{
        //     System.out.println("The key of the index = "+ index);
        // }
        //LARJEST AND SMALLEST VALUE OF THE ARRAY
        // int number [] = {1, 2, 3, 4, 5};
        // System.out.println("The largest value of array = "+ largestNum(number));

        //BINARY SEARCH 
        // int number [] = {2, 4, 6, 8, 10};
        // int key = 8;

        // System.out.println("Index of key = "+ binarySearch(number, key));


        //REVERSE ARRAY

        // int number [] = {1, 2, 3, 4, 5};
        // reverseArray(number);
        // //print array after reverse
        // for(int i=0;i<number.length;i++){
        //     System.out.print(number[i]+" ");
        // }


        //PAIRS ARRAY 
        // int number [] = {1, 2, 3, 4, 5};
        // pairsArray(number);

        //SUB ARRAY PRINT 
        // int number [] = {1, 2, 3, 4, 5};
        // subArray(number);

        //MAXIMUM SUBAARAY SUM and prefix
        // int number [] = {1, 2, 3};
        // subarraySum(number);

        //kadanes sub array sum 
        // int number [] = {-2, -3, 4, -2, -1, 1, 5, -3};
        // kadanes(number);

        // //Trapped rain water 
        // int height [] = {4, 2, 0, 6, 3, 2, 5};
        // System.out.println(trappedrainWater(height));

        // //BUY AND SELL STOCKS 
        // int prices [] = {7, 1, 5, 3, 6, 4};
        // System.out.println(buyAndSellStock(prices));




        
    } 
}
