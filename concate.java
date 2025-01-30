public class concate {
    public static void main(String[] args) {
        String s1 = "aman";
        String s2 = "aggarwal";
        char[] ch = new char[s1.length()+s2.length()];
        int i;
        for(i=0; i<s1.length(); i++){
            ch[i] = s1.charAt(i);
        }
        for(int j=0; j<s2.length(); j++){
            ch[i++] = s2.charAt(j);
        }
        for(i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }
    }
}
