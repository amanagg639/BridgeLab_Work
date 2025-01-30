import java.util.Scanner;

public class StringFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            int cnt = 1;
            if(ch[i] == '.')continue;
            for(int j=i+1; j<str.length(); j++){
                if(ch[i] == ch[j]){
                    cnt++;
                    ch[j] = '.';
                }
            }
            System.out.println(ch[i] + "-> " + cnt);
        }
    }
}
