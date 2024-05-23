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
   int searchByName(String xName) {
      int i,n; Person x;
      n = t.size();
      for(i=0;i<n;i++) {
         x = t.get(i);
         if(x.getName().equalsIgnoreCase(xName)) return(i);
      }
      return(-1);
   }
   void delete(int i) {
      t.remove(i);
   }
   void deleteByName(String xName) {
      int k = searchByName(xName);
      t.remove(k);
   }
   void sortByName() {
      Collections.sort(t);
   }
   
   
 void sortByAge() {
    Comparator<Person> u = new Comparator<Person>() {
     public int compare(Person x, Person y) {
        return(x.getAge()-y.getAge()); 
      }
 }; 
   Collections.sort(t,u);
 }
 void sortByAgeName() {
    Comparator<Person> u = new Comparator<Person>() {
     public int compare(Person x, Person y) {
        int k = x.getAge()-y.getAge();
        if(k!=0) return(k);
        return(x.getName().compareTo(y.getName())); 
      }
 }; 
   Collections.sort(t,u);
 }
 void sortByNameAge() {
    Comparator<Person> u = new Comparator<Person>() {
     public int compare(Person x, Person y) {
        int k = x.getName().compareTo(y.getName());;
        if(k!=0) return(k);
        return(x.getAge()-y.getAge()); 
      }
 }; 
   Collections.sort(t,u);
 }
   
}
