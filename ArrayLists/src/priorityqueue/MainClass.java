package priorityqueue;
import java.util.PriorityQueue;

public class MainClass {

    public static void main(String[] args) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       
       pq.add(43);
       pq.add(65);
       pq.add(72);
       System.out.println(pq);
       System.out.println(pq.remove());
       System.out.println(pq.remove());
       System.out.println(pq.remove());
       
    }
    
}
