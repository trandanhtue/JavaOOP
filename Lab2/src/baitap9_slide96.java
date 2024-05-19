import java.util.Scanner;
public class baitap9_slide96 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String n;
        int so = 0 , chuthuong = 0, chuhoa = 0;
        System.out.println("nhap n : ");
        n = Sc.nextLine();
         for (int i=0;i<n.length();i++){
            char m = n.charAt(i);
          if(Character.isLowerCase(n.charAt(i))){
             chuthuong++;
          }
          if(Character.isUpperCase(n.charAt(i))){
            chuhoa++;
          } 
          if(Character.isDigit(n.charAt(i))){
            so++;
          }
         }
         System.out.println("n co " + chuthuong + " chu thuong , co " + chuhoa + " chu hoa , co " + so + " chu so");

    } 
}
