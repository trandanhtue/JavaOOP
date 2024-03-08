import java.util.Scanner;

public class student {
    
    
        public String hoten ;
    public int namsinh, mssv,tuoi;
    /**
     * 
     */
    void nhapten(){
        System.out.println("nhap ho va ten : ");
        Scanner Sc = new Scanner(System.in);
        hoten = Sc.nextLine();
    }
    void nhapnamsinh(){
        System.out.println("nhap nam sinh : ");
        Scanner Sc = new Scanner(System.in);
        namsinh = Sc.nextInt();
    }
    void nhapmssv(){
        System.out.println("nhap mssv :");
        Scanner Sc = new Scanner(System.in);
        mssv = Sc.nextInt();
    }
        void tinhtuoi(){
            tuoi = 2024 - namsinh;
        }
    void thongtin(){
        System.out.println("ten  : " + hoten );
        System.out.println("tuoi : " + tuoi );
        System.out.println("mssv la : " + mssv );
    }

} 
    

