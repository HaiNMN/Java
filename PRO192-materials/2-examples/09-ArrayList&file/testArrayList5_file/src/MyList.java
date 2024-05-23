import java.util.*;
import java.io.*;
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
 int maxAge() {
    int i,n,k;
    int max;
    n = t.size();
    Person x;
    x = t.get(0);
    k = 0;
    max = x.getAge();
    for(i=1;i<n;i++) {
      x = t.get(i);
      if(x.getAge()>max) {
         k = i;
         max = x.getAge();
      }
    }
     return(k);    
 }  
 void loadFile(String fname) throws IOException  {
    FileReader fr = new FileReader(fname);
    BufferedReader br = new BufferedReader(fr);
    Person x; String xName; int xAge;
    String s;String [] a;
    while(true) {
      s = br.readLine();
      if(s==null) break;
      a = s.split("[ |]+");
      if(a.length<2) break;
      xName = a[0].trim();
      xAge = Integer.parseInt(a[1].trim());
      x = new Person(xName,xAge);
      add(x);
    }
    br.close();
    fr.close();
 }
}
