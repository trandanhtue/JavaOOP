package chuong4;

import java.util.Scanner;

public class Student {
    public String FullName ;
    public int Age ;
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten ");
        FullName = sc.nextLine();
        System.out.println("nhap tuoi ");
        Age=sc.nextInt();
        }
        public void inthongtin(){
            System.out.println("ten : "+FullName );
            System.out.println("tuoi : "+Age);
}

}
