public class sumofmatrix_column {
    public static void main(String[] args) {

        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Sum of each column:");

        for(int j = 0; j < arr[0].length; j++) {

            int sum = 0;

            for(int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }

            System.out.println("Column " + (j + 1) + " : " + sum);
        }
    }
}
    
