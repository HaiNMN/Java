public class MyArray {
   Person [] a; int size,n;
   MyArray(int size1) {
     size = size1;
     a = new Person[size];
     n = 0;
   }
   void clear() {
     n = 0;  
   }
   boolean isFull() {
     return(n==size);  
   }
   void add(Person x) {
     if(!isFull()) {
       a[n++] = x;
     }
       else {
         grow();               
         a[n++] = x;
       }
   }
   void grow() {
     int size1 = size + size/2 + 1;  
     Person [] b = new Person[size1];
     int i;
     for(i=0;i<n;i++) b[i] = a[i];
     a = b;
     size = size1; 
   }
}
