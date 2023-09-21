import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String str = sc.next();
        System.out.println(rearrangeQueue(str,t));
    }
    public static String rearrangeQueue(String queue, int t) {
        char[] queueArray = queue.toCharArray();
        int n = queueArray.length;

        for (int time = 0; time < t; time++) {
            int i = 0;
            while (i < n - 1) {
                if (queueArray[i] == 'B' && queueArray[i + 1] == 'G') {
                    char temp = queueArray[i];
                    queueArray[i] = queueArray[i + 1];
                    queueArray[i + 1] = temp;
                    i += 2;
                } else {
                    i++;
                }
            }
        }
        return new String(queueArray);
    }
}
