package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    public HinhChuNhat(){
        ten = "Hinh Chu Nhat";
    }
    public void nhapchieudai(){
        System.out.println("Nhap chieu dai =");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
}
public void nhapchieurong(){
    System.out.println("Nhap chieu rong =");
    Scanner scanner = new Scanner(System.in);
    rong = scanner.nextFloat();
}
public void tinhchuvi(){
    chuvi = 2 * (dai + rong);
}
public void tinhdientich(){
    dientich = dai * rong;
}
}
