import java.util.Scanner;

public class ArrivaloftheGeneral144A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int minidx = minidx(a);
        int maxidx = maxidx(a);
        int ans = maxidx + (a.length-minidx-1);
        if(maxidx>minidx){ans--;}
        System.out.println(ans);
    }

    public static int minidx(int arr[]){
        int min = Integer.MAX_VALUE;
        int ans=0;
        for (int i = arr.length-1;i>=0; i--){
            if(arr[i]<min)
            {
                ans = i;
                min = arr[i];
            }
        }
        return ans;
    }
    public static int maxidx(int arr[]){
        int max = Integer.MIN_VALUE;
        int ans=0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>max)
            {
                ans = i;
                max = arr[i];
            }
        }
        return ans;
    }
}
