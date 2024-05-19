import java.util.Scanner;
public class baitap6_slide95 {
    public static void main(String[] args) {
       
        int n;
        Scanner Sc = new Scanner(System.in);
        do {
        System.out.println("nhap n : ");
        n = Sc.nextInt();
       } while ( n < 0 );
       long giaithua=1;
       if (n==0 || n==1 ){
       }
       else {
        for (int i =2; i <= n; i++){
            giaithua*=i;
        }
        System.out.println("giai thua cua n :"+giaithua);
       }

    }

    
}
