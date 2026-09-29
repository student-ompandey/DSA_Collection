public class Array {
    public static void main (String [] args){
        int arr1 [] = {2, 1, 2, 3, 4, 2};
        // int arr2 [] = {1, 2, 3, 5};

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


        //1 st method 

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



        // 2nd method 

        // int n = arr1.length, m = arr2.length, i = 0, j = 0, c =0;

        // while(i <n && j<m){
        //     if(arr1[i]!=arr2[j]){
        //         System.out.println("Not equal");
        //         break;
        //     } else {
        //         i++;
        //         j++;
        //         c++;
        //         // continue;
        //     }
        // }
        // if(c==m){
        //      System.out.println("Equal");
        // }
       
        //FIRST ACCORANCE IN THE ARRAYS 
        // int n = arr1.length;
        // int key = 2;
        // int acc = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     if(arr1[i] == key){
        //         acc = Math.max(acc, i);

        //     }
        // }

        // System.out.println(acc);
        // int acc = -1;
        // int key = 2;
        // for(int i = arr1.length-1;i>=0;i++){
        //     if(arr1[i]==key){
        //         acc = i;
        //         break;
        //     }
        // }

        // System.out.println(acc);

        // int n = arr1.length-1;
        // arr1[0] = arr1[n];
        // for(int i=1;i<n;i++){
        //     arr1[i] = arr1[i-1];
        // }

        

        // for(int i=0;i<n;i++){
        //     System.out.print(arr1[i]+" ");
        // }



    }
}
