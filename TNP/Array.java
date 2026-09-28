public class Array {
    public static void main (String [] args){
        int arr1 [] = {1, 2, 3, 4};
        int arr2 [] = {1, 2, 3, 5};

        // // sum 
        // int sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum += arr[i];
        // }
        // System.out.println(sum);

        // // avarege 
        // System.out.println(sum/arr.length);

        // //

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         System.out.println("Even : " + arr[i]);
        //     } else {
        //         System.out.println("Odd : " + arr[i]);
        //     }
        // }
        
        // int count = 0;
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr2.length;j++){
        //         if(arr1[i] == arr2[j]){
        //             // System.out.println("Not Equal");
        //             count++;
                    
        //         }
        //     }
        // }

        // if(count == arr1.length){
        //     System.out.println("Equal");
        // } else 
        //     System.out.println("Not Equal");

        int n = arr1.length, m = arr2.length, i = 0, j = 0, c =0;

        while(i <n && j<m){
            if(arr1[i]!=arr2[j]){
                System.out.println("Not equal");
                break;
            } else {
                i++;
                j++;
                c++;
                // continue;
            }
        }
        if(c==m){
             System.out.println("Equal");
        }
       

        

    }
}
