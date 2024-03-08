package shapes;
import java.util.Scanner;

public class Person {
    public String hoTen;
    public int tuoi;
    public String gioiTinh;
    public Person(){
  hoTen = hoTen;
  tuoi = tuoi;
  gioiTinh = gioiTinh;
}
public void nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ho ten: ");
    hoTen= sc.nextLine();
    System.out.println("nhap tuoi : ");
    tuoi= sc.nextInt();
    System.out.println("nhap gioi tinh: ");
    sc.nextLine();
    gioiTinh = sc.nextLine();
}
public void in(){
    System.out.println("Ho Ten : "+ hoTen);
    System.out.println("Tuoi : "+ tuoi);
    System.out.println("Gioi Tinh : "+ gioiTinh);
    
    
}
public void in(String ten, int tuoi){
    System.out.println(ten+"-"+tuoi);
}
}
