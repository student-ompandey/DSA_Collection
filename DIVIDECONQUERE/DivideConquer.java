public class DivideConquer {

    //MERGE SHORT CODE IN ARRAY 
    // public static void printArray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+ " ");
    //     }
    // }

    // public static void mergeSort(int arr[], int si, int ei){
    //     if(si>=ei){
    //         return;
    //     }
    //     int mid = si+(ei-si)/2; // for mid 
    //     mergeSort(arr, si, mid); // left part
    //     mergeSort(arr, mid+1, ei); // right part
    //     merge(arr, si, mid, ei);  // for sorted array merge 

        

    // }

    // public static void merge(int arr[], int si, int mid, int ei){
    //     int temp[] = new int[ei-si+1];
    //     int i = si;// for left iterator 
    //     int j = mid+1; // for right iterator 
    //     int k = 0; // for temp array iterator 

    //     while(i<=si && j<=ei){
    //         if(arr[i]<arr[j]){
    //             temp[k] = arr[i];
    //             i++;
    //         } else{
    //             temp[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     //left
    //     while(i<=mid){
    //         temp[k++] = arr[i++];
    //     }

    //     //right
    //     while(j<=ei){
    //         temp[k++] = arr[j++];
    //     }

    //     //copy temp array to original array 
    //     for(k=0, i=si;k<temp.length;k++ ,i++){
    //         arr[i] = temp[k];
    //     }
    // }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    //QUICK SORT IN ARRAY 
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
       int pindx =  partision(arr, si , ei);
       quickSort(arr, si, pindx-1);
       quickSort(arr, pindx+1, ei);

    }

    public static int  partision(int arr[], int si, int ei){
        int pivit = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivit){
                i++;
                //swap
                int temp = arr[j];
                arr[j]  = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei]  = arr[i];
        arr[i] = temp;
        return i;

    }

    public static int searchSR(int arr[], int tar, int si, int ei){
        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;

        if(arr[mid]== tar){
            return mid;
        }

        //mid on l1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                //case:a left
                return searchSR(arr, tar, si, mid-1);
            } else {
                // case:2 right
                return searchSR(arr, tar, mid+1, ei);
            }
        }

        //mid on line 2
        else{
            if(arr[mid+1]<=tar && tar<=arr[ei]){
                return searchSR(arr, tar, mid+1, ei);
            } else{
                return searchSR(arr, tar, si, mid-1);
            }
        }
        
    }

    public static void main(String[] args){

        //MERGE SORT
        // int arr[] = {2,3,6,4,7,9,1};
        // mergeSort(arr, 0, arr.length-1);
        // printArray(arr);

        //QUICK SORT
        // int arr[] = {2,3,6,4,7,9,1};
        // quickSort(arr, 0, arr.length-1);
        // printArray(arr);

        //SEARCH IN ROTATED SORTED ARRAY
        // int arr[] = {4,5,6,7,0,1,2};
        // int target = 0;
        // int aidx = searchSR(arr, 0, 0, arr.length-1);
        // System.out.println(aidx);


        
    }
}

