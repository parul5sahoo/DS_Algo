package vectorandstack;
import linkedlists.MyLinkedList;
public class MyStack<E> {
    public MyLinkedList<E> ll = new MyLinkedList<>();
    void push(E e){
        ll.add(e);
    }
    E pop() {
        if(ll.isEmpty()){
            System.out.println("popping from emptystack is not possible.");
            return null;
        }else{
        return ll.removeLast();
        }
    }  
    
    E peek(){
         if(ll.isEmpty()){
            System.out.println("peeking from emptystack is not possible.");
            return null;
         }else{
         return ll.getLast();
         }
    }
}
