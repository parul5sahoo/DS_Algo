
package comparator_comparable;
import java.util.*;
import java.lang.*;
public class MainClass {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        
        students.add(new Student(23, "Ram"));
        students.add(new Student(35, "Shyam"));
        students.add(new Student(83, "Aman"));
        students.add(new Student(13, "Ram"));
        students.add(new Student(13, "Parul"));
        
                
       /* Collections.sort(students, new SortByNameThenMarks());
         */
      /* Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.name.equals(o2.name)) {
                    return o1.marks - o2.marks;
                } else {
                    return o1.name.compareTo(o2.name);
                }
            }
           
       });*/
      //usage of lambda expressions
      
       Collections.sort(students, (o1,o2) -> {
            
                if(o1.name.equals(o2.name)) {
                    return o1.marks - o2.marks;
                } else {
                    return o1.name.compareTo(o2.name);
                }
            });
       
       //if  sort using name
       //Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
       
       //to sort by the below method in one line of code
         Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
         
         //to sort in reverse order
            Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
          
          students.forEach(System.out::println);
    }
}
   /*class SortByNameThenMarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.name.equals(o2.name)) {
            return o1.marks - o2.marks;
        }else {
            return o1.name.compareTo(o2.name);
        }
    }
}*/