import java.util.Scanner;

public class _4_toString {

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
//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, chủ yếu của bài
    @Override
    public String toString() {
        return this.day + "/"+ this.month + "/" +this.year;
    }
//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

    public static void main(String[] args) {

        int day;

        Scanner scan = new Scanner(System.in);
        _4_toString date = new _4_toString();
        _4_toString date2 = new _4_toString();
        date.Date(1, 12, 2003);
        
        System.out.println("");
        System.out.println(date.toString());
    }
}

