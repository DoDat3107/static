package HinhTron;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.##");
        Circle hinh1 = new Circle(5);
        Circle hinh2 = new Circle(6);
        System.out.println("hình tròn thứ 1 có bán kính là: " +hinh1.getRadius() );
        System.out.println("ID là : "+ hinh1.getId() );
        System.out.println("hình tròn thứ 1 có chu vi là : "+ df.format(hinh1.V()));
        System.out.println("hình tròn thứ 1 có diện tích là : "+ df.format(hinh1.S()));
        System.out.println("-----------------------------------------------------------------");
        System.out.println("hình tròn thứ 2 có bán kính là: "+ hinh2.getRadius());
        System.out.println("ID là : "+ hinh2.getId() );
        System.out.println("hình tròn thứ 2 có chu vi là : " + df.format(hinh2.V()));
        System.out.println("hình tròn thứ 2 có diện tích là : "+ df.format(hinh2.S()));

        System.out.println("hình tròn có bán kính lớn nhất là : "+ Circle.MaxRadius());
        System.out.println("tổng của S các hình tròn là : "+ Circle.sumS);

    }
}