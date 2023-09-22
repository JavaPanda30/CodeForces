import java.math.BigInteger;
import java.util.Scanner;

public class Luckynum110A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        BigInteger n = new BigInteger(String.valueOf(input));
        int cnt=0;
        while(n.compareTo(BigInteger.ZERO)>0)
        {
            BigInteger a = n.remainder(BigInteger.TEN);
            if(a.equals(BigInteger.valueOf(4)) || a.equals(BigInteger.valueOf(7)))
            {
                cnt++;
            }
            n = n.divide(BigInteger.TEN);
        }
        if(isluckyint(cnt))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static boolean isluckyint(int n) {
        String strN = String.valueOf(n);
        for (int i = 0; i < strN.length(); i++) {
            char digit = strN.charAt(i);
            if (digit != '4' && digit != '7') {
                return false;
            }
        }
        return true;
    }
}
