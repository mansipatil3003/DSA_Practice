import java.util.*;

public class hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put(null, 100);

        System.out.println("Value for Apple: " + map.get("Apple"));
        System.out.println("Value for Banana: " + map.get("Banana"));
        System.out.println("Value for Orange: " + map.get("Orange"));
        System.out.println("Value for Kiwi: " + map.get("Kiwi"));
        System.out.println("Size of the Map: "+ map.size());
        System.out.println("Is the Map Empty? " + map.isEmpty());
        map.remove("Apple");
        System.out.println("Size of the map after removal: " + map);
    } 

}