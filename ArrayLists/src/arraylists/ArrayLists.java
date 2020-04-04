package arraylists;
import java.util.*;
public class ArrayLists {

    
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("grapes");
        
        System.out.println(fruits);
        
        MyArrayList<String,Integer> p1 = new MyArrayList<>("Parul", 5);
        MyArrayList<Boolean, String> p2 = new MyArrayList<>(true, "guava");
        p1.getDesc();
        p2.getDesc();
        
        ArrayList<String> veges = new ArrayList<>();
        veges.add("potato");
        veges.add("tomato");
        veges.add("cabbage");
        
       fruits.addAll(veges);
       System.out.println(fruits);
       fruits.set(1,"cherry");
       fruits.remove(2);
       List<String> toRemove = new ArrayList<>();
       toRemove.add("Apple");
       toRemove.add("cabbage");
       fruits.removeAll(toRemove);
       System.out.println(fruits.contains("papaya"));
       System.out.println(fruits.isEmpty());
       String temp[] = new String[fruits.size()];
       fruits.toArray(temp);
       for(String e:temp){
           System.out.println(e);
       }
    }
    
}
