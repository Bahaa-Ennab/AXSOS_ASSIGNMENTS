import java.util.HashMap;
import java.util.Set;
public class Maps {
    public static void main(String[] args){
        HashMap<String, String> countryCapitals = new HashMap<String, String>();
        countryCapitals.put("Palestine" , "Jerusalem");
        countryCapitals.put("Oman" , "Muscat");
        System.out.println(countryCapitals);
        Set<String> keys = countryCapitals.keySet();
        for(String key : keys){
            // System.out.println(key);
            System.out.println(countryCapitals.get(key)); 
        }
        // Add five countries and capitals to the 'countryCapitals' map
        // Print all keys from the map
        // Print two countries and their capitals ('The capital of Oman is Muscat.')
    }
}