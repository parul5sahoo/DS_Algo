package linkedlists;
import java.util.*;
public class MainClass {

    
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(78);
        ll.add(32);
        List<Integer> al = new ArrayList<>();
        al.add(65);
        al.add(34);
        al.add(98);
        getTimeDiff(al);
        getTimeDiff(ll);
        MyLinkedList<Integer> ml = new MyLinkedList<>();
        ml.add(5);
        ml.add(65);
        ml.add(58);
        ml.print();
        
    }
    static void getTimeDiff(List<Integer> list){
        long start = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName()+ " " +(end - start));
    }
    
    
}
