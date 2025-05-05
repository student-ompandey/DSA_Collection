public class DivideConquerPS {
    //PROBLEM NUMBER 1 
    //STRING SORTED BY MERGE SORT 
    public static int countInversion(int arr[]){
        return inversion(arr, 0, arr.length-1);
    }
    public static void mergeSort(String str[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        mergeSort(str, si, mid);
        mergeSort(str, mid+1, ei);
        merge(str, si, mid , ei);

    }

    
    public static void merge(String str[], int si, int mid, int ei){
        int n1 = mid-si+1;
        int n2 = ei-mid;
        String L[] = new String [n1];
        String R[] = new String [n2];

        for(int i=0;i<n1;i++){
            L[i] = str[si+i];
        }

        for(int i=0;i<n2;i++){
            R[i] = str[mid+1+i];
            
        }

        int i = 0 , j=0;
        int k = si;

        while(i<n1 && j<n2){
            if(L[i].compareTo(R[j])<=0){
                str[k] = L[i];
                i++;
            } else{
                str[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            str[k++] = L[i++];
        }

        while(j<n2){
            str[k++] = R[j++];
        }

    }

    //PROBLEM NUMBER 2 
    //INVERSION COUNT IN ARRAY
  
    public static int  inversion(int arr[], int si, int ei){
        int count = 0 ;
        if(si>=ei){
            return 0;
        }
        
        int mid = (si+ei)/2;
        count += inversion(arr, si, mid);
        count +=  inversion(arr, mid+1, ei);
        count +=  inversionMerge(arr, si, mid , ei);
        return count;
    }

    public static int inversionMerge(int arr[], int si, int mid, int ei){
        int n1 = mid-si+1;
        int n2 = ei-mid;
        int L[] = new int [n1];
        int R[] = new int [n2];

        for(int i=0;i<n1;i++){
            L[i] = arr[si+i];
        }

        for(int i=0;i<n2;i++){
            R[i] = arr[mid+1+i];
            
        }

        int i = 0 , j=0;
        int k = si;
        int ans = 0;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            } else{
                ans+=n1-i;
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k++] = L[i++];
        }

        while(j<n2){
            arr[k++] = R[j++];
        }
        return ans;
    }
    public static void main(String[] args){
        //PROBLEM NUMBER 1
        // String str[] = {"om", "subhangi", "aman" , "kirti","krishna"};
        // int n = str.length;
        // mergeSort(str, 0, n-1);

        // for(int i=0; i<n;i++){
        //     System.out.print(str[i]+" ");
        // }

        //PROBLEM NUMBER 2 
        int arr[] = {7, 6,5,4};
        int n = arr.length;
        int ans = countInversion(arr);
        System.out.println(ans);
     
    }
}

