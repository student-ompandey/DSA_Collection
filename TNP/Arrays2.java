public class Arrays2 {
    public static void main(String [] args){
        int arr[] = {1, 2, 3, 4, 5 , 6};

        int n = arr.length;
        int first = arr[0];

        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = first;

        for(int nu : arr){
            System.out.print(nu+" ");
        }

    }
    
}
