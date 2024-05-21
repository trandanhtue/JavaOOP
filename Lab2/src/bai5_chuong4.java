import java.util.LinkedHashMap;
import java.util.Scanner;

public class bai5_chuong4 {
    class Sinhvien {
    int MSV;
    String Hoten;
    int Lop;    
    Sinhvien(int Masinhvien, String Ten, int Lop) {
        this.MSV = Masinhvien;
        this.Hoten = Ten;
        this.Lop = Lop;
    }
    @Override
    public String toString() {
        return "Mã sinh viên: " + MSV + ", Họ và Tên: " + Hoten + ", Lớp: " + Lop;
    }
}
public class bai5_chuong4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedHashMap<Integer, Sinhvien> Std = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();  
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao ma sinh vien: ");
            int msv = sc.nextInt();
            sc.nextLine();  
            System.out.println("nhap vao ho va ten: ");
            String hoten = sc.nextLine();
            System.out.println("nhap vao ten lop: ");
            int lop = sc.nextInt();
            sc.nextLine(); 
            Sinhvien sv = new Sinhvien(msv, hoten, lop);
            Std.put(msv, sv);
        }
        System.out.println("nhap ten lop can tim: ");
        int fdlp = sc.nextInt();
        System.out.println("danh sach cac sinh vien trong lop " + fdlp + ": ");
        if(Std.containsKey(fdlp)){
            Sinhvien sv = Std.get(fdlp);
            System.out.println("Ho va ten: " + sv.Hoten + ", MSV: " + sv.MSV);   
        }else{
            System.out.println("khong tim thay sinh vien tren voi ten lop la: "+ fdlp);
        }
        System.out.println("nhap ma sinh vien can tim: ");
        int fdmsv = sc.nextInt();
        sc.nextLine();  
        if (Std.containsKey(fdmsv)) {
            Sinhvien sv = Std.get(fdmsv);
            System.out.println("Ho va ten: " + sv.Hoten + ", Lop: " + sv.Lop);
        } else {
            System.out.println("khong tim thay sinh vien tren voi msv la: "+ fdmsv);
        }
        sc.close();
    }
}
}
