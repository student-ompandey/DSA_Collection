public class Heaps {

    //insert in a heap
    // static class Heap{
    //     ArrayList<Integer> arr = new ArrayList<>();
        
    //     public void add(int data){
    //         arr.add(data);  //0(1)
    //         int x = arr.size()-1; //child
    //         int p = (x-1)/2; //parent

    //         while(arr.get(x) < arr.get(p)){  //O(logn)
    //             int temp = arr.get(x);
    //             arr.set(x, arr.get(p));
    //             arr.set(p, temp);

    //             x = p;
    //             p = (x-1)/2;
    //         }
    //     }
    //     // get minimum element in a heap
    //     public int peek(){
    //         return arr.get(0);
    //     }

    //     //HEPIFY FUNCTIUON 
    //     private void heapify(int i){
    //         int left = 2*i+1;
    //         int right = 2*i+2;
    //         int minIdx = i;

    //         if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
    //             minIdx = left;
    //         }

    //         if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
    //             minIdx = right;
    //         }

    //         if(minIdx != i){
    //             int temp = arr.get(i);
    //             arr.set(i, arr.get(minIdx));
    //             arr.set(minIdx, temp);
    //             heapify(minIdx);

    //         }

            
    //     }
    //     // remove element in the heap 
    //     public int remove(){
    //         int data = arr.get(0);

    //         //step- 1 swap first and last 
    //         int temp = arr.get(0);
    //         arr.set(0, arr.get(arr.size()-1));
    //         arr.set(arr.size()-1, temp);

    //         //step-2 delet last
    //         arr.remove(arr.size()-1);

    //         //step - 3 hepify
    //         heapify(0);
    //         return data;
    //     }

    //     public boolean isEmpty(){
    //         return arr.size()==0;
    //     }
    // }
    //heapify function 
    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;

        if(left<size && arr[left]>arr[minIdx]){
            minIdx = left;
        }
        if(right<size && arr[right]>arr[minIdx]){
            minIdx = right;
        }
        if(minIdx != i){
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            heapify(arr, minIdx, size);
        }
    }
    //HEAP SORT FUNCTION
    public static void heapSort(int arr[]){  //O(nlogn)
        //  step-1 to build maxheap
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr, i, n);
        }

        //step-2 push largest at the end
        for(int i=n-1;i>0;i--){
            //swap first with last 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args){
    //     Heap h = new Heap();
    //     h.add(3);
    //     h.add(4);
    //     h.add(5);
    //     h.add(7);

    //     while(!h.isEmpty()){  // heap sort 
    //         System.out.println(h.peek());
    //         h.remove();
    //     }
    // }


    int arr [] = {1, 2, 4, 5, 3};
    heapSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
