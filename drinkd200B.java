import java.util.Scanner;

public class drinkd200B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int p[]  = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            sum=sum+p[i];
        }
        int totalfrac  = n*100;
        double  ans = ((double) (sum * 100) /totalfrac);
        System.out.println(ans);
    }
}
