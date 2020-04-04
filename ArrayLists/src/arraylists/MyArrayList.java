package arraylists;


public class MyArrayList<X , Y> {
    X x;
    Y y;
    public MyArrayList(X x, Y y){
        this.x=x;
        this.y=y;
    }   
   public void getDesc(){
       System.out.println(x+" and "+y);
   }     
}
    
 



