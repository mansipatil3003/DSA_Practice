public class indexfind_string {

        public static void main(String[] args) {
    
            String str = "Hello Java World";
    
            // find index of character
            int index1 = str.indexOf('W');
    
            // find index of word
            int index2 = str.indexOf("World");
    
            System.out.println("Index of W: " + index1);
            System.out.println("Index of World: " + index2);
        }
    }

    

