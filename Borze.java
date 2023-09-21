import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        int index = 0;
        while(index<str.length())
        {
            char ch = str.charAt(index);
            if(ch=='.')
            {
                   ans=ans+'0';
                   index++;
            }
            if(ch=='-'){
                if(str.charAt(index+1)=='.'){
                    ans+='1';
                    index+=2;
                }
                else if(str.charAt(index+1)=='-'){
                    ans+='2';
                    index+=2;
                }
            }
        }
        System.out.println(ans);
    }
}
