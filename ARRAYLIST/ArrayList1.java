import java.util.ArrayList;
 public class ArrayList1 {
    // swapping twio numbers in arraylist
    // public static void swap(ArrayList<Integer> list, int idx1, int idx2){
    //      int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }

    //cointaner with most water 
    public static int area(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int hi = Math.min(height.get(i), height.get(j));
                int diff = j-i;
                int currWater = hi*diff;
                maxWater = Math.max(currWater, maxWater);

            }
        }
        return maxWater;
    }
    //container with most water O(n) approach 
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            // calculate area 
            int ht = Math.min(height.get(lp), height.get(rp));
            int dis = rp - lp;
            int currentArea = ht * dis;
            maxWater = Math.max(maxWater, currentArea);
            if(height.get(lp)<height.get(rp)){
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;

    }

    // PAIR SUM OF THE ARRAYLIST 
    //BRUET FORCE SOLUTION 
    // public static boolean pairSum(ArrayList<Integer> num, int target){
    //     for(int i=0;i<num.size();i++){
    //         for(int j=i+1;j<num.size();j++){
    //             if(num.get(i)+num.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //TWO POINTER APPROACH 
    public static boolean pairSum1(ArrayList<Integer> num , int target){
        int lp = 0;
        int rp = num.size()-1;
        while(lp<rp){
            if(num.get(lp)+num.get(rp)==target) return true;
            else if(num.get(lp)+num.get(rp)<target) lp++;
            else rp--;
        }
        return false;
    }

    //PAIR SUM OF ROTATED SORTRED ARRAY
    public static boolean pairSum(ArrayList<Integer> num, int target){
        int pivit = -1;
        int n = num.size();
        for(int i=0;i<n;i++){
            if(num.get(i)>num.get(i+1)){
                pivit = i;
                break;
            }
        }
        int lp = pivit+1;
        int rp = pivit;
        while(lp!=rp){
            if(num.get(lp)+num.get(rp)==target) return true;
            if(num.get(lp)+num.get(rp)<target) {
                lp = (lp+1)%n;
            } else {
                rp = (n+rp-1)%n;
            }
        }
          return false;  
    }
    
    
    public static void main (String[] args){
        // HashMap<Integer , Integer> mp = new HashMap<>();
        // mp.put(7, 6);
        // mp.put(5, 6);
        // mp.put(6, 9);

        // System.out.println(mp.containsKey(9));
        // System.out.println(mp.containsKey(8));
        // System.out.println(mp.containsKey(6));

        // System.out.println(mp.get(7));
        // System.out.println(mp.get(5));
        // System.out.println(mp.get(6));

        //ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(9);
        // list.add(3);
       // System.out.println(list);
        //System.out.println(list.get(2));
        //Delet
        // list.remove(1);
        // System.out.println(list);

        //set element 
        // list.set(1,30);
        // System.out.println(list);
         
        //contais function 
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(10));
        // System.out.println(list.size());

        //PRINT ARRAYLIST
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }

        // PRINT REVERSE ARRAY 
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }

        //PRINT MAXIMUM VALUE IN ARRAYLIST
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     max = Math.max(list.get(i), max);
        // }

        // System.out.println("The maximum value = "+max);

        //SWAPPING TWO ARRAY LIST VALUE 
        // System.out.println(list);
        // int idx1 = 1, idx2 = 2;
        // swap(list, idx1, idx2);
        // System.out.println(list);


        // arraylist sort in acending order 
        // System.out.print(list);
        // Collections.sort(list);
        // System.out.println(list);

        // arraylist sort in decending order 

        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

        //MULTIDIEMENSION ARRAYLIST 
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1); list1.add(2);
        // mainList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);  list2.add(3);
        // mainList.add(list2);

        // System.out.println(mainList);

        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        //multidemanrion arraylist 
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for(int i=1;i<=5;i++){
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*5);
        // }

        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);

        // System.out.println(mainList);

        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }

        //CONTAINER WITH MOST WATER 
        //BRUTEFORCE SOLUTION O(N^2) - TIME COMPLEXITY
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8); 
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // //System.out.println(area(height));
        // System.out.println(storeWater(height));


        // PAIR SUM 
        // ArrayList<Integer> num = new ArrayList<>();
        // num.add(1);
        // num.add(2);
        // num.add(3);
        // num.add(4);
        // num.add(5);
        // int target = 50;
        // System.out.println(pairSum1(num, target));

        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(5);
        num.add(1);
        num.add(2);
        num.add(3);
       
        int target = 5;
        System.out.println(pairSum(num, target));


    }
}
