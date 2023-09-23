import java.util.Scanner;

public class Panoramix_Prediction_80A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        while(true){
            n++;
            if(isprime(n)){
                break;
            }
        }
        if(n==m){
        System.out.println("YES");}
        else{
            System.out.println("NO");
        }
    }
    public static boolean isprime(int n){
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
