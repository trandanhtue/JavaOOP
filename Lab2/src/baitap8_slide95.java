import java.util.Scanner;
import java.text.DecimalFormat;
public class baitap8_slide95 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        int n,so,tong = 0;
        float trungbinhcong;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("nhap day so n :");
        n = Sc.nextInt();
        for (int i=1;i<=n;i++) {
            System.out.println("nhap so thu " +i+ " la ");
            so = Sc.nextInt();
             tong += so;
        }
       trungbinhcong = (float) tong/n;
      System.out.println("trung binh cong = "+ decimalFormat.format(trungbinhcong));
    }
}
