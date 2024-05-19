import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class slide69_chuong4 {
   /**
 * @param args
 */
public static void main(String[] args) {
    int number;
    TreeSet<Integer>treeSetInteger= new TreeSet<>();
    Scanner scanner = new Scanner(System.in);
    treeSetInteger.add(0);
    treeSetInteger.add(3);
    treeSetInteger.add(1);
    treeSetInteger.add(4);
    treeSetInteger.add(2);
    treeSetInteger.add(8);
    System.out.println("cac phan tu trong treeSetInteger: ");
    if(!treeSetInteger.contains(number)){
        treeSetInteger.add(number);
        System.out.println("Them thanh cong! ");
        System.out.println("cac phan tu trong treeSetInteger sau khi them ");
        System.out.println(treeSetInteger);
    }else{
        System.out.println("phan tu" + number + "da ton tai!");
    }
   } 
}
