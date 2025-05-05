import java.util.*;
public class hashingBasics{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        //insert O(1)
        hm.put("India", 33);
        hm.put("china", 34);
        hm.put("indonesia", 35);
        hm.put("Australia", 39);

        // System.out.println(hm);
        //get O(1)
        // int popu = hm.get("India");
        // System.out.println(popu);

        //CointainsKey O(1)
        // System.out.println(hm.containsKey("India")); // true
        // System.out.println(hm.containsKey("China")); // true

        //removre 
        // System.out.println(hm.remove("India"));
        // System.out.println(hm);

        //SIZE
        // System.out.println(hm.size());

        //ISEMPTY
        // System.out.println(hm.isEmpty());

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key = "+k +", value = "+hm.get(k));
        }
    }
}