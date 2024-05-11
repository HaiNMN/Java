import java.util.Scanner;

public class _3_getSet {

    private int day; 
    private int month;
    private int year;

    // cách dùng get và set
    public int getDay()
    {
        return day;
    }
    public void setDay(int d)
    {
        if(d>=0&&d<=30)
        {
            this.day = d;
        }
        else
        {
            System.out.println("khong hop le !!!");
        }
    }

    public int getMonth()
    {
        return month;
    }
    public void setMonth(int m)
    {
        if(m>0&&m<=12)
        {
            this.month = m;
        }
        else
        {
            System.out.println("khong hop le !!!");
        }
    }

    public int getYear()
    {
        return year;
    }
    public void setYear(int y)
    {
        this.year = y;
    }
    //___________________________________________

    public void Date(int d, int m , int y)
    {
        if(d>=0 && d<31)
        {
            this.day = d;
            System.out.print(+day);
        }
        else
        {
            System.out.println("khong the xac dinh!!!");
        }
        if(m>=0 && m<=12)
        {
            this.month = m;
            System.out.print("/"+month);
        }
        else
        {
            System.out.println("khong the xac dinh!!!");
        }
        if(y>0)
        {
            this.year = y;
            System.out.print("/"+year);
        }
        else
        {
            System.out.println("khong the xac dinh!!!");
        }
        
    }


    public static void main(String[] args) {

        int _day;

        _3_getSet date = new _3_getSet();
        Scanner scan = new Scanner(System.in);

        date.Date(3, 12, 3);

        System.out.println("");
        System.out.println("vay ngay hom nay la : "+date.getDay());
        System.out.println("ban muon day doi ngay la bao nhieu");
        date.setDay(_day = scan.nextInt());
        System.out.println("vay ngay hom nay la : "+date.getDay());
    }
}
