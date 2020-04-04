package deque;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offerFirst(54);
        adq.offerFirst(63);
        adq.offerLast(94);
        adq.offerFirst(56);
        
        System.out.println(adq);
        
        
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        
        adq.offer(91);
        
       
         System.out.println(adq);
          
         System.out.println(adq.peekFirst());
         System.out.println(adq.peekLast());
         
        
    }
    
}
