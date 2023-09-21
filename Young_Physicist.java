import java.sql.SQLOutput;
import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int c=0,sum=0;
        for (int i = 0; i < 3; i++) {
            sum=0;
            for (int j = 0; j < n; j++) {
                sum+=a[j][i];
            }
            if(sum!=0)
            {
                c=1;
                break;
            }
        }
            if(c==0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
