public class ZigZag {
    public static void main(String[] args) {
        int[]arr1 = {1, 3, 5, 7};
        int[]arr2 = {2, 4 ,6, 8, 9, 11};
        int i=0;
        int j=0;
        int arr[] = new int[arr1.length+arr2.length];
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            arr[k++] = arr1[i++];
            arr[k++] = arr2[j++];
        }
        while(i<arr1.length){
            arr[k++] = arr1[i++];
        }
        while(j<arr2.length){
            arr[k++] = arr2[j++];
        }
        for(int index : arr) {
            System.out.print(index);
        }
    }
}
