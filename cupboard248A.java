import java.util.Scanner;

public class cupboard248A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int  l[]  = new int[n];
        int  r[]  = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int time = 0;
        int leftopen = freq(l,1);
        int rightopen = freq(r,1);
        int leftclose = freq(l,0);
        int rightclose = freq(r,0);
//        if(Math.abs(rightclose-rightopen)>Math.abs(leftclose-leftopen)){
//            time+=Math.min(rightclose, rightopen);
//            if(rightopen>=rightclose){
//                time+=leftopen;
//            }
//            else{
//                time+=leftclose;
//            }
//        }
//        if(Math.abs(rightclose-rightopen)<Math.abs(leftclose-leftopen)){
//            time+=Math.min(leftclose, leftopen);
//            if(leftopen>=leftclose){
//                time+=rightopen;
//            }
//            else{
//                time+=rightclose;
//            }
//        }
        time+=Math.min(leftclose,leftopen)+Math.min(rightclose,rightopen);
        System.out.println(time);
    }

    public static int freq(int a[] , int m){
        int count=0;
        for(int x:a){
            if(x==m){
                count++;
            }
        }
        return count;
    }
}
