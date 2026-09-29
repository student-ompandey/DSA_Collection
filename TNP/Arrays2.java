

public class Arrays2 {
    public static void main(String [] args){
        Integer arr[] = {1, 2, 3, 4, 5 , 6};
        
        //LEFT SHIFT BY ONE 

        // int n = arr.length;
        // int first = arr[0];

        // for(int i=0;i<n-1;i++){
        //     arr[i] = arr[i+1];
        // }

        // arr[n-1] = first;

        // for(int nu : arr){
        //     System.out.print(nu+" ");
        // }


        // RIGHT SHIFT BY ONE

        // int n = arr.length;
        // int last = arr[n-1];

        // for(int i=n-1;i>0;i--){
        //     arr[i] = arr[i-1];
        // }

        // arr[0] = last;

        // for(int nu : arr){
        //     System.out.print(nu+" ");
        // }


        // Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));
        // int min = arr[0];


        // int n = arr.length;
        // for(int i=0;i<n-1;i++){
        //     if(arr[i]<arr[i+1]){
        //         int temp = arr[i];
        //         arr[i] = arr[i+1];
        //         arr[i+1] = temp;
        //     }
        // }

        // System.out.print(Arrays.toString(arr));

        // Arrays.sort(arr, Collections.reverseOrder());
        // System.out.print(Arrays.toString(arr));


        int l = arr[0];
        int sl = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>l){
                sl = l;
                l = arr[i];
            }

            if(arr[i]<l && arr[i]>sl){
                sl = arr[i];
            }
        }

        System.out.println(l);
        System.out.println(sl);

    }
    
}
