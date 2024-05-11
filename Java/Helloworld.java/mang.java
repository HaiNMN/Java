import java.util.Scanner;

public class mang {
    public static void main(String[] args) {
        
        double [] mang1;   // 2 kiểu để không khác gì nhau cả [] trước hay sau (mảng) đều được
        double mang2[];
        double[] mang3;
        double tong = 0;

        Scanner scan = new Scanner(System.in);  

        mang3 = new double[]{1,2,3,4,5,6,7};
        mang1 = new double[10];

        for(int i=0;i<mang1.length;i++)
        {
            System.out.print("mang["+i+"] : ");
            mang1[i] = scan.nextDouble();
        }

        for(int i=0;i<mang1.length;i++)
        {
            tong += mang1[i];
        }

        System.out.println("tong = "+tong);

        for(int i=0;i<mang3.length;i++)
        {
            System.out.print(mang3[i]+" ");
        }
        

    }
}
