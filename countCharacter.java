import java.util.Scanner;

public class countCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int capitalCnt = 0;
        int lowerCnt = 0;
        int digitCnt = 0;
        int specialCnt = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c>=97 && c<123)lowerCnt++;
            else if(c>=65 && c<91)capitalCnt++;
            else if(c>='0' && c<='9')digitCnt++;
            else specialCnt++;
        }
        System.out.println("capitalCnt-> " + capitalCnt);
        System.out.println("lowerCnt-> " + lowerCnt);
        System.out.println("digitCnt-> " + digitCnt);
        System.out.println("specialCnt-> " + specialCnt);
    }
}
