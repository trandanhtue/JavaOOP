package shapes;
 import java.util.Scanner;

import shapes.HinhChuNhat;
public class HinhChuNhat {
    float dai;
    float rong;
    float cv;
    float dt;
    public void nhapchieudai(){
        System.out.println("Nhap chieu dai :");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
}
public void nhapchieurong(){
    System.out.println("Nhap chieu rong :");
    Scanner scanner = new Scanner(System.in);
    rong = scanner.nextFloat();
}
public void tinhchuvi(){
    cv = 2 * (dai + rong);
}
public void tinhdientich(){
    dt = dai * rong;
}
public void inchuvi(){
    System.out.println("chu vi hinh chu nhat : " + cv );
     
}
public void indientich(){
    System.out.println("dien tich hinh chu nhat : " + dt );
}   
}
