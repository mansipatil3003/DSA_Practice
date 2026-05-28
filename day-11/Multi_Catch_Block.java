import java.util.*;

public class Multi_Catch_Block {
    public static void main(String[] args){
        
        try{

            // ArithmeticException
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a integer : ");
            int n = sc.nextInt();
            int a = n / 0;
            
            
            int[] arr = {1,2,3};

            // ArrayIndexOutOfBoundsException
            System.out.println(arr[1]);
        }
        catch (ArithmeticException e) {
            System.out.println(
                "Arithmetic Exception occurred");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Array Index Out Of Bounds Exception occurred");
        }
        catch (Exception e) {
            System.out.println(
                "General Exception occurred");
        }
    }
}
