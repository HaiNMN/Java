public class _1_Constructor {

    private int day;
    private int month;
    private int year;

    public _1_Constructor(int d,int m,int y)
    {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void printDay()
    {
        System.out.println("Day : "+this.day);
    }

    public void printMonth()
    {
        System.out.println("Month : "+this.month);
    }

    public void printYear()
    {
        System.out.println("Year : "+this.year);
    }

    public void printDate()
    {
        System.out.println("Date : "+this.day+"-"+this.month+"-"+this.year);
    }

    public static void main(String[] args) {

        _1_Constructor myDate = new _1_Constructor(1, 9, 2004);

        myDate.printDate();
        myDate.printDay();
        myDate.printMonth();
        myDate.printYear();
    }
}