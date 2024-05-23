import java.util.*; 
public class MyList {
   List<Person> t;
   MyList() {
     t = new ArrayList<>();  
   }
   void clear() {
     t.clear();  
   }
   boolean isEmpty() {
     return(t.isEmpty());  
   }
   void add(Person x) {
      t.add(x);
   }
   void addMany(String [] a, int [] b) {
     for(int i=0;i<a.length;i++)
        add(new Person(a[i],b[i])); 
   }
   void traverse() {
      for(Person x: t) System.out.print(x + " ");
      System.out.println();
   }
   
}
