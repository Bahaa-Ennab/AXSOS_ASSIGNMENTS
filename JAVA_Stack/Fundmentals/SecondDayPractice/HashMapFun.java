import java.util.Set;
import java.util.HashMap;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("shatha.bast@axsos.academy", "Shatha Bast");
        userMap.put("Khalid.khader@axsos.academy", "Khalid Khader");
        userMap.put("Mohammad.Issa@axsos.academy", "Mohammad Issa");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}