import java.util.Scanner;

public class giaiptbac2 {
    public static void main(String[] args) {
       double a,b,c,delta;
       Scanner sc=new Scanner(System.in);
       System.out.println("nhap a:");
       a=sc.nextDouble(); 
       System.out.println("nhap b:");
       b=sc.nextDouble(); 
       System.out.println("nhap c:");
       c=sc.nextDouble();
       delta=b*b-4*a*c;
       if(delta>0){
        double x1=-b-Math.sqrt(delta)/2*a;
        double x2=-b+Math.sqrt(delta)/2*a;
        System.out.println("x1:"+x1+"x2:"+x2);


       }else if(delta==0){
        double x=-b/2*a;
        System.out.println("pt co nghiem kep la" + x);
       }else{
        System.out.println("pt vo nghiem");
       }
    }
}
