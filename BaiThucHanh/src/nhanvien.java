import java.util.Scanner;

public class nhanvien {
    public static void main(String[] args) {
      import java.util.Scanner;
public class nhanvien {
    public String hoten , chucvu;
    public int tuoi , namsinh;
    void nhaphoten(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten : ");
        hoten = sc.nextLine();
    }
    void nhapchucvu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuc vu : ");
        chucvu = sc.nextLine();    
    }
    void nhapnamsinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nam sinh : ");
        namsinh = sc.nextInt();
    }
    void tinhtuoi(){
        tuoi  = 2024 - namsinh;
    }
    void inthongtin(){
        System.out.println("ho va ten : " + hoten);
        System.out.println("chuc vu : " + chucvu);
        System.out.println("tuoi : " + tuoi);
    }
}  
    }
}
