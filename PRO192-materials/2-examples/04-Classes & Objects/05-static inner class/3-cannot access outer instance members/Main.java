class Outer
  {int m = 5; static int n = 10;
   void out_fun()
     {System.out.println("I am fun() in outer class");
     }

   static void out_foo()
     {System.out.println("I am foo() in outer class");
     }

   static class Inner
      {void in_fun()
           {// System.out.println("m = " + m); /* ERROR */
            System.out.println("n = " + n); // Ok
           }
        void in_foo()
           {// out_fun(); /* ERROR */
            out_foo(); // Ok
           }
      }
  }
public class Main 
  {
       public static void main(String args[])
            {
              Outer.Inner t = new Outer.Inner();
              t.in_fun(); 
              t.in_foo();
              System.out.println(); 
            }
  }
