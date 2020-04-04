package queue;
import java.util.*;
public class MainClass {

    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        MyQueue<Integer> mq = new MyQueue<>();
        
        q.add(56);
        q.add(75);
        q.add(78);
        
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.element());
        System.out.println(q.remove());
        
        
       
        System.out.println(q.poll());
        System.out.println(q.remove());
        
        mq.enqueue(452);
        mq.enqueue(54);
        mq.enqueue(32);
        
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        mq.enqueue(123);
        System.out.println(mq.dequeue());
    }
    
}
