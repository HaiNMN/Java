import java.util.*;
public class Person implements Comparable {
  private String name; private int age; 

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int compareTo(Object x) {
       Person y = (Person) x;
       return(name.compareTo(y.getName()));
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
