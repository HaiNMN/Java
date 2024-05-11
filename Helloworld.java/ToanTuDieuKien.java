import java.util.Scanner;

public class ToanTuDieuKien {
    public static void main(String[] agnt)
    {
        String KiemTra;
        int a;

        Scanner scan = new Scanner(System.in);

        System.out.print("hay nhap so ban muon kiem tra : ");
        a = scan.nextInt();
        KiemTra = (a%2==0)?"So Chan":"So Le";
        System.out.println(a+" La "+ KiemTra);
    }
}
