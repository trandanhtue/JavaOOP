import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class bai4_chuong4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSetfruit = new HashSet<>();
        System.out.print("nhap vao so luong qua la: ");
        int sl = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < sl; i++) {
            System.out.print("nhap vao ten qua thu " + (i + 1) + ": ");
            String fruit = sc.nextLine();
            hashSetfruit.add(fruit);
        }
        System.out.println("danh sach ten cac loai trai cay: ");
        System.out.println(hashSetfruit);
        System.out.print("ten loai trai cay can kiem tra: ");
        String fd = sc.nextLine();
        if (hashSetfruit.contains(fd)) {
            System.out.println("co trong danh sach: " + fd);
        } else {
            System.out.println("khong co trong danh sach: " + fd);
        }
        System.out.print("ten trai cay can xoa khoi danh sach la: ");
        String dl = sc.nextLine();
        if (hashSetfruit.contains(dl)) {
            hashSetfruit.remove(dl);
            System.out.println("xoa loai trai cay thanh cong.");
        } else {
            System.out.println("xoa khong thanh cong");
        }
        System.out.println("cac loai trai cay con lai trong danh sach la: ");
        System.out.println(hashSetfruit);
        
        List<String> listfr = new ArrayList<>();
        System.out.print("nhap danh sach trai cay moi so luong qua la: ");
        int nw = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < nw; i++) {
            System.out.print("nhap vao ten qua thu " + (i + 1) + ": ");
            String fruit = sc.nextLine();
            listfr.add(fruit);
        }
        System.out.println("danh sach trai cay moi la: ");
        System.out.println(listfr);
        hashSetfruit.addAll(listfr);
        System.out.println("danh sach trai cay cua list + hashset la: ");
        Iterator<String> iterator = hashSetfruit.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        hashSetfruit.removeAll(listfr);
        System.out.println("cac loai trai cay trong hashSet sau khi xoa cac phan tu cua list: ");
        iterator = hashSetfruit.iterator();  
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
