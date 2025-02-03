public class moveZeros {
    public static void main(String[] args) {
        int arr[] = {1, 0, 5, 9, 0 ,0, 4};
        moveZerosLeft(arr);
        for (int i:
             arr) {
            System.out.print(i + " ");
        }

    }
    public static void moveZerosLeft(int[] arr){
        int i=arr.length-2;
        int j=arr.length-1;
        while(i>=0 && j>=0){
            if(arr[j]==0 && arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i--;
            }
            else if(arr[j]==0 && arr[i]==0){
                i--;
            }
            else{
                i--;
                j--;
            }
        }
    }
}
