import java.util.Scanner;

public class PerfectPermutation233A {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();

            if (n % 2 == 1) {
                System.out.println(-1);  // Perfect permutation is not possible for odd n
            } else {
                int[] permutation = new int[n];
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        permutation[i] = i + 2;
                    } else {
                        permutation[i] = i;
                    }
                }

                // Print the perfect permutation
                for (int i = 0; i < n; i++) {
                    System.out.print(permutation[i]);
                    if (i < n - 1) {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
