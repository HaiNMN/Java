import java.util.Scanner;

public class tinhtoan
{
    
    public static void main(String[] agnt)
    {
        float Number_1,Number_2;
        float Sum;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 2 numbers you want to calculate");
        
        Number_1 = scan.nextFloat();
        Number_2 = scan.nextFloat();
        Sum = Number_1 + Number_2;

        System.out.println("So "+Number_1+" + "+Number_2+" = "+Sum);
    }
}
