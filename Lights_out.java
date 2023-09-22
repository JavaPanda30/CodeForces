import java.util.Scanner;

public class Lights_out{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the 3x3 grid
        int[][] grid = new int[3][3];

        // Input the number of times each light is pressed
        for (int i = 0; i < 3; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                int pressCount = Integer.parseInt(inputLine[j]);
                // If the count of presses is odd, toggle the light
                if (pressCount % 2 == 1) {
                    grid[i][j] ^= 1; // Toggle the light state
                }
            }
        }

        // Print the current state of each light
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println(); // Move to the next line for the next row
        }

        scanner.close();
    }
}
