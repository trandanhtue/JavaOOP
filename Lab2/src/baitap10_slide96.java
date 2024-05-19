import java.util.Scanner;
public class baitap10_slide96 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        String n;
        char kitu;
        int m=0;
      do {
        System.out.println("nhap chuoi n :");
       n = Sc.nextLine();
      } while (n.length() > 80);
      System.out.println("nhap ki tu can dem : ");
      kitu = Sc.nextLine().charAt(0);
      for (int i =0 ; i<n.length();i++){
        if( kitu == n.charAt(i)){ 
        m++;
      }
    }
      System.out.println("ki tu " + kitu +" trong chuoi " + n + " co " + m + " ki tu");
    } 
}
