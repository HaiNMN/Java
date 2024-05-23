import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
      MyList u = new MyList();
      int k; String fname = "person.txt";
      u.clear();
      u.loadFile(fname);
      System.out.println("0. Test add and display:");
      u.traverse();
      System.out.println();
    }
    
}
