package Hashmaps;
import java.util.Map.Entry;
import java.util.*;
public class MainClass {
    
    public static void main(String[] args){
        /* Map<String, Integer> nums = new HashMap<>();
        nums.put("one", 1);
        nums.put("two", 3);
        nums.put("five", 5);
        nums.put("one", 10);
        nums.putIfAbsent("two", 7);
        
        
        System.out.println(nums);
        System.out.println(nums.get("two"));
        System.out.println(nums.get("nine"));
        System.out.println(nums.containsKey("seven"));
        System.out.println(nums.containsValue(8));
        
        nums.remove("two", 7);
        nums.remove("one");
        
        
        System.out.println(nums);
        System.out.println(nums.keySet());
        System.out.println(nums.entrySet());
        
        Set<Entry<String, Integer>> entries = nums.entrySet();
        
        for(Entry<String, Integer> entry: entries) {
            entry.setValue(entry.getValue() * 100);
        }
        System.out.println(nums);*/
        
        System.out.println(getHash("GOD"));
    }    
        
    
    public static int getHash(String s) {
        int hash = 0;
        for(int i = 0; i<s.length(); i++){
             hash += s.charAt(i);
             
        }
        return hash;
    }
    
    
}
