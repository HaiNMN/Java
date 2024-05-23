public class Main {

    public static void main(String[] args) {
      String [] a = {"hoa","la","canh","cay","goc","re"};
      int [] b = {22,21,25,19,24,23};
      String xName;int k;
      MyList u = new MyList();
      u.addMany(a, b);
      System.out.println("1. Test add and traversal:");
      u.traverse();
      System.out.println("2. Test search by name:");
      xName = "canh";
      k = u.searchByName(xName);
      if(k>=0)
        System.out.println("Found at index " + k);
       else
        System.out.println("Not found!");
      System.out.println("3. Test delete by name:");
      u.deleteByName(xName);
      u.traverse();
    }
    
}
