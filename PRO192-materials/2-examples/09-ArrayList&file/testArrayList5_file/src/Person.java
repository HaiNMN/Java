import java.util.*;
public class Person implements Comparable<Person> {
  private String name; private int age; 

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int compareTo(Person x) {
       int k = name.compareTo(x.getName());
       if(k!=0) return(k);
       return(age - x.getAge());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "(" + name + "," + age + ") ";
    }

  
}
