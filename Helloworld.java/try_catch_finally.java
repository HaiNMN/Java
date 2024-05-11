import java.util.Scanner;

public class try_catch_finally {
    public static void main(String[] args) {

        int n=0;

        Scanner scan = new Scanner(System.in);
        
        
        try 
        {
            System.out.println("nhap vao so nguyen : ");
            n = scan.nextInt();
        } 
        catch (Exception e) 
        {
            System.out.println("nhap du lieu khong dung");
        } 
        finally
        {
            System.out.println("da kiem tra!!!");
        }

        System.out.println("gia tri nhap vao la : "+n);
    }
}
