public class ArrayPS {
    public static int search(int nums[], int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            int mid = (left+right)/2;

            if(nums[mid]>nums[right]){
                left = mid + 1;
            } else{
                right = mid ;
            }  
        }

         int shift = left;
          left = 0;
          right = n-1;

         while(left<=right){
            int mid = (left+right)/2;
            int realMid = (mid+shift)%n;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid]<target){
                left = mid + 1;
            } else{
                right = mid -1;
            }
         }

         return -1;
        }  

    public static void main(String[] args) {
        // QUESTION NUMBER 2 

        int nums [] = {2, 3, 4, 5, 0, 1};
        System.out.println(search(nums, 3));
    }
}
