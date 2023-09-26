import java.util.Arrays;
import java.util.Scanner;

public class insomnia148B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        boolean damage[] = new boolean[d+1];
        Arrays.fill(damage, false);
//        if (k == 1 || l == 1 || m == 1 || n == 1) {
//            System.out.println(d);
//        }
            int idx = l;
            while (idx<=d) {
                if (!damage[idx]) {
                    damage[idx] = true;
                }
                idx+=l;
            }
            idx = m;
            while (idx<=d) {
                if (!damage[idx]) {
                    damage[idx] = true;
                }
                idx+=m;
            }
            idx = n;
            while (idx<=d) {
                if (!damage[idx]) {
                    damage[idx] = true;
                }
                idx += n;
            }
            idx = k;
            while (idx<=d) {
                if (!damage[idx]) {
                    damage[idx] = true;
                }
                idx+=k;
            }
            int count=0;
            for(boolean a:damage){
                if(!a){count++;};
            }
            System.out.println(d-count+1);
    }
}
