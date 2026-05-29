import java.util.HashMap;

public class frequecy_example{
    public static void main(String[] args) {

        String str = "programming";

        // Convert string to char array
        char[] ch = str.toCharArray();

        // Create HashMap
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : ch) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Print frequency
        System.out.println("Character Frequencies:");

        for (char c : map.keySet()) {
            System.out.println(c + " : " + map.get(c));
        }
    }
}

