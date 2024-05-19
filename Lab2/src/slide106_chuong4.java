import java.security.KeyStore.Entry;
import java.util.Set;
import java.util.TreeMap;

public class slide106_chuong4 {
    public static void main(String[] args) {
        TreeMap<Integer,Character>treeMap = new TreeMap<>();
        treeMap.put(6,"A");
        treeMap.put(4,"E");
        treeMap.put(5,"R");
        treeMap.put(1,"B");
        treeMap.put(8,"E"); 
        Set<Entry<Integer,Character>>setTreeMap = treeMap.entrySet();
        System.out.println("cac entry xuat hien trong setTreeMap");   
        System.out.println(setTreeMap);
    }
    
}
