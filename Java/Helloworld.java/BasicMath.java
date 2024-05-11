import java.util.Scanner;

public class BasicMath {
    public static void main(String[] agnt)
    {
        double a,b;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("nhap so a: ");
        a = scan.nextDouble();
        System.out.print("nhap so b: ");
        b = scan.nextDouble();

        // Hàm giá trị tuyện đối
        System.out.println("|a| = "+ Math.abs(a));

        // Hàm tìm min
        System.out.println("So nho nhat giua "+a+" va "+b+" la : "+Math.min(a,b));

        // Hàm tìm max
        System.out.println("So lon nhat giua "+a+" va "+b+" la : "+Math.max(a,b));

        // Hàm ceil (lấy số >= số hiện tại)
        System.out.println("Ceil("+a+") = "+Math.ceil(a));

        // Hàm floor (lấy số nhỏ <= số hiện tại)
        System.out.println("Floor("+a+") = "+Math.floor(a));

        // Hàm sqrt (căn bậc 2)
        System.out.println("Sqrt("+a+") = "+Math.sqrt(a));

        // Hàm pow (a^b)
        System.out.println("Pow("+a+"^"+b+") = "+Math.pow(a,b));

    }
}
