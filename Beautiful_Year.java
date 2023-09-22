import java.util.HashSet;
import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        while(true){
            y=y+1;
            if(isDistinct(y)){
                System.out.println(y);
                break;
            }
        }
    }
    public static boolean isDistinct(int year){
        HashSet<Integer> setyear = new HashSet<>();
        while(year!=0){
            setyear.add(year%10);
            year=year/10;
        }
        if(setyear.size()==4)
            return true;
        return false;
    }
}
