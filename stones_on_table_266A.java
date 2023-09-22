import java.util.Scanner;

public class stones_on_table_266A {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                sc.nextLine();
                String colors = sc.nextLine();
                int minRemovals = 0;
                for (int i = 1; i < n; i++) {
                    if (colors.charAt(i) == colors.charAt(i - 1)) {
                        minRemovals++;
                    }
                }
                System.out.println(minRemovals);
                sc.close();
            }
}