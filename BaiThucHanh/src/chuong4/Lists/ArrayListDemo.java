package chuong4.Lists;

import java.util.ArrayList;

import chuong4.Student;

public class ArrayListDemo {
    public static void main(String[] args) { 
    
   ArrayList<Student> arrlist = new ArrayList<Student>();
for(int i=0;i<3;i++){
            Student st = new Student();
            st.nhapthongtin();
            arrlist.add(st);
        }
        for(int i=0;i<arrlist.size();i++){
         arrlist.get(i).inthongtin();
         arrlist.remove(1);
        }
       
        // arrlist.remove(1);
        // System.out.println(arrlist.get(1));
        // System.out.println(arrlist.size());

} 
}
