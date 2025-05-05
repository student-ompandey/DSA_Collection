public class SortingPS {
    //BUBBLE SORT

    // public static void bubbleSort(int arr[]){
    //     int n = arr.length;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=0;j<n-1-i;j++){
    //             if(arr[j]<arr[j+1]){
    //                 int temp = arr[j];
    //                  arr[j] = arr[j+1];
    //                  arr[j+1] = temp;

    //             }
    //         }
    //     }
    // }

    //SELECTION SORT 
    // public static void selectionSort(int arr[]){
    //     int n = arr.length;
    //     for(int i=0;i<n-1;i++){
    //         int maxIndex = i;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[maxIndex]<arr[j]){
    //                 maxIndex = j;
    //             }
    //         }
    //         int temp = arr[i];
    //         arr[i] = arr[maxIndex];
    //         arr[maxIndex] = temp;
    //     }
    // }

    //COUNTING SORT
    // public static void countingSort(int arr[]){
    //     int maxValue = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>maxValue){
    //             maxValue = arr[i];
    //         }
    //     }

    //     int count [] = new int [maxValue+1];
    //     for(int i=0;i<arr.length;i++){
    //         count[arr[i]]++;
    //     }

    //     int j=0;
    //     for(int i=0;i<count.length;i++){
    //         while(count[i]>0){
    //             arr[j] = i;
    //             j++;
    //             count[i]--;
    //         }
    //     }
    // }

    //INSERTION SORT 
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] < key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {4, 1, 6, 6, 1, 9, 9, 5};
        insertionSort(arr);
        //countingSort(arr);
       // selectionSort(arr);
       // bubbleSort(arr);
        printArray(arr);
    }
}
