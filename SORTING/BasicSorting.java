
import java.util.Arrays;
import java.util.Collections;

public class BasicSorting {
    //BUBBLE SORT
    // public static void bubbleSort(int arr[]){
    //     int n = arr.length;
    //     for(int turn=0;turn<n-1;turn++){
    //         for(int j=0;j<n-1-turn;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    //SELECTION SORT 
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minPos = i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }

            
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
        }
    }
    public static void printArr(Integer arr[]){
        Integer n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print (arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Integer arr [] = {5, 4, 2, 3, 1};
        Arrays.sort(arr, Collections.reverseOrder());
        // selectionSort(arr);
        printArr(arr);
    }
}
 