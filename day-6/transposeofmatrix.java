public class transposeofmatrix {
    public static void main(String[] args) {
        int[][] arr={
            {2,8,1} ,
            {9,3,5}
        };

        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    
}
