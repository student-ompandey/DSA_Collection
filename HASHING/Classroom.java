import java.util.*;
public class Classroom {

    public static String getStart(HashMap<String,String> map){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key: map.keySet()){
            revMap.put(map.get(key), key);
        }
        
        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key; // starting point 
            }
        }
        return null;
    }
    public static void main(String args[]){
        // LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        // lhm.put("india", 22);
        // lhm.put("china", 20);
        // majority element 
        // int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
            // if(hm.containsKey(arr[i])){
            //     hm.put(arr[i], hm.get(arr[i])+1);
            // } else {
            //     hm.put(arr[i], 1);
            // }
        //     hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        // }
        // for(Integer k: hm.keySet()){
        //     if(hm.get(k) > arr.length/3){
        //         System.out.println(k);
        //     }
        // }

        // HashSet<Integer> hs = new HashSet<>();
        // hs.add(1);
        // hs.add(1);
        // hs.add(2);
        // hs.add(3);
        // System.out.println(hs);

        // if(hs.contains(3)){
        //     System.out.println("set contain 3 ");
        // }
        
        // if(hs.contains(4)){
        //     System.out.println("set contain 3 ");
        // }
        // hs.clear();
        // System.out.println(hs.size());
        // System.out.println(hs.isEmpty());


        // HashSet<String> set = new HashSet<>();
        // set.add("India");
        // set.add("om");
        // set.add("aman");

        // Iterator it = set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // for(String k : set){
        //     System.out.println(k);
        // }


        //find the iteranary from the ticket 
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bangurulu");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);
        System.out.print(start);
        for(String key : map.keySet()){
            System.out.print("-> "+ map.get(start));
            start = map.get(start);
        }




    }
}
