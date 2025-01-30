public class checkRotation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "eabcd";
        boolean check = true;
        if(s1.length() != s2.length())check = false;
        String s = s1+s1;
        check = substring(s, s2);
        if(check) System.out.println("True");
        else System.out.println("false");
    }
    public static boolean substring(String s1, String s2){
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
                j = 0;
            }
        }
        if(j==s2.length())return true;
        else return false;
    }
}
