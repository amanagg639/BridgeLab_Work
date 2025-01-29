//W.A.P to Union of two arrays;
import java.util.*;
class Union{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        int []mergedArr = new int[n+m];
        int cnt = 0;
        for(int i : arr1){
            mergedArr[cnt++] = i; 
        }
        for(int i : arr2){
            mergedArr[cnt++] = i;
        }
             for(int i=0; i<mergedArr.length; i++){
            if(mergedArr[i] == -1)continue;
            System.out.print(mergedArr[i] + " ");
           for(int j=i+1; j<mergedArr.length; j++){
              if(mergedArr[i] == mergedArr[j]){
                  mergedArr[j] = -1;
              }
           }
           
        }

    }

}