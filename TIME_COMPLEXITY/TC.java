
public class TC {
    public static void bubbleSort1(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
   public static void main (String [] args){
    // int arr[] = {3, 8, 7, 9};
    // bubbleSort1(arr);

    // for(int num : arr){
    //     System.out.print(num+" ");
    // }

    // int a = 0;
    // int n = 5;
    // for(int i=0;i<n;++i){
    //     for(int j=n;j<i;--j){
    //         a = a+i+j;
    //     }
    // }

    // System.out.println(a);

  

   } 
}
