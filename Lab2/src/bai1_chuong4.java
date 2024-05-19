import java.util.ArrayList;
import java.util.Scanner;
public class bai1_chuong4 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so phan tu cua ArrayList: ");
        n=sc.nextInt();
        ArrayList<Integer> A= new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu "+i+" vao ArrayList: ");
            int a=sc.nextInt();
            A.add(a);
        }
        int max=A.get(0);
        for(int i=1;i<n;i++)
        {
            if(max<A.get(i))
            max=A.get(i);
        }
        System.out.println("So lon nhat la: "+max);
        System.out.println("---------------------");
        System.out.println("Nhap vao phan tu can xoa: ");
        int xoa=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=A.get(i);
            
        }
    }
}
