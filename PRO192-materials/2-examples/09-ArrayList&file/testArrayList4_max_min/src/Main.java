public class Main {

    public static void main(String[] args) {
      String [] a = {"hoa","la","goc","la","canh","re"};
      int [] b = {22,21,25,19,25,23};
      MyList u = new MyList();
      int k;
      u.clear();
      u.addMany(a, b);
      System.out.println("0. Test add and display:");
      u.traverse();
      System.out.println();
      System.out.println("1. Test sort by name using Comparable interface:");
      u.sortByName();
      u.traverse();
      System.out.println();
      System.out.println("2. Test sort by age using Comparator interface:");
      u.sortByAge();
      u.traverse();
      System.out.println();
      System.out.println("3. Test sort by age then by name using Comparator interface:");
      u.sortByAgeName();
      u.traverse();
      System.out.println();
      System.out.println("4. Test sort by name then by age using Comparator interface:");
      u.sortByNameAge();
      u.traverse();
      System.out.println();
      System.out.println("5. Test finding max age position:");
      u.clear();
      u.addMany(a, b);
      k = u.maxAge();
      System.out.println("Position of max age is " + k);
      System.out.println();
    }
    
}
