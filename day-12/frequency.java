// check the number of elements that have 
import java.util.HashMap;
public class frequency{
    public static void main(String[] args) {
        String[] str = {"apple", "banana", "apple", "orange", "banana", "grapes","Banana"};
        HashMap<String, Integer> Map = new HashMap<>();
        for (String s : str) {
            if (Map.containsKey(s)) {
                Map.put(s, Map.get(s) + 1);
            } else {
                Map.put(s, 1);
            }
        }
        for (HashMap.Entry<String, Integer> entry : Map.entrySet()) {
            System.out.println(entry.getKey() + "= " + entry.getValue());
        }
    }
}