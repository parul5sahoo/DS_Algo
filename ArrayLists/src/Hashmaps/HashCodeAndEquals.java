
package Hashmaps;
import java.util.*;
public class HashCodeAndEquals {
       public static void main(String[] args){
           
           pen pen1 = new pen(10, "blue");
           pen pen2 = new pen(10, "blue");
           
           System.out.println(pen1);
           System.out.println(pen2);
           
         //System.out.println(pen1.equals(pen2));
         
         Set<pen> pens = new HashSet<>();
         pens.add(pen2);
         pens.add(pen1);
         
        System.out.println(pens);
         
       }
       
}

class pen {
    int price;
    String color;
    
    public pen(int price, String color) {
        this.price = price;
        this.color = color;
    }
    
    @Override
    
    public boolean equals(Object obj) {
        pen that = (pen) obj;
        boolean isEqual = this.price == that.price && this.color.equals(that.color);
        return isEqual;
    }
    
    @Override
    public int hashCode(){
        return price + color.hashCode();
    }
}
   
