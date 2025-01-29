import java.util.*;
class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0; i<n; i++){
            int count = 1;
            if(arr[i] == -1)continue;
           for(int j=i+1; j<n; j++){
              if(arr[i] == arr[j]){
                  arr[j] = -1;
                  ls.add(arr[i]);
                  count++;
              }
           }
           if(count==1)ls.add(arr[i]);
           
        }
        for(int i=0; i<ls.size(); i++){
            System.out.print(ls.get(i) + " ");
        }
    }
}