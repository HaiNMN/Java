public class Break_continue_return {
    public static void main(String[] agnt)
    {

        // cách sử dụng break và outer trong break (outer dùng khi mà mình muốn break ở chỗ nào (nếu không dùng thì chỉ có thể beak ở lớp gần nhất ))
        /*
        int out,in =0;  
        outer:for(out =0;out<10;out++) //
        {
            for(in =0;in<20;in++)
            {
                System.out.println("                            ngu");
                if(in >10)
                {
                    break outer;
                }
                System.out.println("out : "+out);
                System.out.println("in : "+in);
            }
        }*/


        // cách sử dụng continue (nếu điều kiện đúng continue nó sẽ bỏ qua các câu lệnh ở dưới nó và thực hiện tiếp vòng lặp gần nhất)
        // nếu có lever (nếu điệu kiện đúng nó sẽ bỏ qua các câu lệnh ở dưới và thực hiện tiếp vòng lặp chỗ đặt lever) nếu sử dụng lever này nó tương tự với break thường không có outer
        /* 
        for(int i=0;i<10;i++)
        {
            System.out.println("i= "+i);
            for(int j=0;j<10;j++)
            {
                System.out.println("                            ngu");
                if(j>5)
                {
                    continue ;
                }
                System.out.println("   j= "+j);
            }
        }
        */
    }




    // vậy thì sự khác nhau giữa break và continue là
    /*
    nếu là break thì đúng điều kiện nó sẽ dừng vòng lặp luôn
    nếu là continue thì nó sẽ bỏ qua các câu lệnh ở dưới nhưng vẫn thực hiện vòng lặp
    */
}
