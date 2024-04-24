package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        ten = "Hinh Vuong ";
    }
    public void nhapcanh(){
        System.out.println("Canh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
}
