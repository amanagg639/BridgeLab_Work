import java.util.*;
class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=75)System.out.println("distinction");
        else if(marks<75 && marks>40)System.out.println("Pass");
        else System.out.println("Fail");
    }
}