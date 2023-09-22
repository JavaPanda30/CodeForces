import java.sql.SQLOutput;
import java.util.Scanner;

public class capitalize281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char ch = a.charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println(a);
        }
        else{
            System.out.println((ch+"").toUpperCase()+a.substring(1));
        }
    }
}
