package linkedlists;

public class MyLinkedList<E> {
    public static class Node<E>{
         E data;
        Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
    Node<E> head;
    public void add(E data){
        Node<E> toAdd = new Node(data);
        if(isEmpty()){
            head = toAdd;
            return;
        }
        Node<E> temp = head;
        while(temp.next != null){
            temp = temp.next;
        
        }
        temp.next = toAdd;
    }
    public boolean isEmpty(){
        return head == null;
    }
    
    public void print() {
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    } 
    public E removeLast(){
        Node<E> temp = head;
         if(temp.next == null){
            Node<E> toRemove = head;
            head = null;
           return toRemove.data;
        }
        while(temp.next != null){
            temp = temp.next;
           
        }
        
         Node<E> toRemove = temp.next;
         return toRemove.data;
          
    }  
       
    public E getLast(){
        Node<E> temp = head;
        if(temp == null){
            System.out.println("cannot peek last element from stack. ");
            return null;
        }
        while(temp.next != null){
            temp = temp.next;
       }
        return temp.data;
    }
    
}
