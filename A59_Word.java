import java.util.Scanner;

public class A59_Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        int cntlw=0;
        int cntup = 0;
        int i=0;
        while(i<=str.length()-1){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                cntup++;
            }
            else{
                cntlw++;
            }
            i++;
        }
        if(cntup>cntlw){
            System.out.println(str.toUpperCase());
        }
        if(cntup<=cntlw){
            System.out.println(str.toLowerCase());
        }
    }
}
