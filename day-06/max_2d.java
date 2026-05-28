public class max_2d {
    public static void main(String[] args) {
        int[][] arr={
            {2,8,1} ,
            {9,3,5}
        };

        int max = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Largest = " +max);
    }
}
