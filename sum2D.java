public class sum2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 4}, {3, 2, 6}, {1, 2, 3}};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
