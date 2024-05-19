import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide86_chuong4 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("CSLT","co so lap trinh" );
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C sharp");
        hashMap.put("Java", "Java");
        hashMap.put("PHP", "PHP");
        Set<Map.Entry<String,String>> setHashMap = hashMap.entrySet();
        System.out.println("cac entry co trong setHashMap");
        System.out.println(setHashMap);

    }
    
}
