import java.util.Scanner;

public class _2_phuongThuc {

    private String tenCacLoaiCaPhe;
    private double giaTien1Kg;
    private double khoiLuongMua;

    public void HoaDonCaPhe(String ten,double gia, double khoiluong)
    {
        this.tenCacLoaiCaPhe = ten;
        this.giaTien1Kg = gia;
        this.khoiLuongMua = khoiluong;
    }

    public double tinhTongTien()
    {
        return this.giaTien1Kg * khoiLuongMua;
    }

    public boolean kiemTraKhoiLuongLonHon(double kl)
    {
        return this.khoiLuongMua <= kl;
    }

    public boolean kiemTraCoHon500k()
    {
        return this.tinhTongTien() >= 500;
    }

    public static void main(String[] args) {

        double soTienPhaiTra =0;
        double gia,klMua;
        double sumKl = 4;
        double tienThuong = 500;

        Scanner scan = new Scanner(System.in);
        _2_phuongThuc hoaDonCaPhe = new _2_phuongThuc();

        System.out.println("Hien tai cua hang con "+sumKl+"kg");
        System.out.print("Hay nhap kl ban muon mua : ");

        hoaDonCaPhe.HoaDonCaPhe("Trung Nguyen", 200, klMua = scan.nextDouble());
        soTienPhaiTra = hoaDonCaPhe.tinhTongTien();
        
        if(hoaDonCaPhe.kiemTraKhoiLuongLonHon(sumKl)== true)
        {
            System.out.println("Vay gia tien ban phai tra la : "+soTienPhaiTra+" $");
            System.out.println("Xuat thanh toan thanh cong!!!");
            sumKl -= klMua;
            System.out.println("Hien tai cua hang con "+sumKl+"kg");
        }
        else
        {
            System.out.println("Loi thanh toan!!!");
        }
        
        if(hoaDonCaPhe.kiemTraCoHon500k() == true)
        {
            System.out.println("CHUC MUNG ban da la khach dac biet co hoa don > 500k !!!");
        }
    }
}
