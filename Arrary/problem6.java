import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print shortest distance
        System.out.println(findShortestEvenDistance(arr));
    }

    public static int findShortestEvenDistance(int[] arr) {
        int prevIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            // Check for even positive integer
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                evenCount++;
                if (prevIndex != -1) {
                    int distance = i - prevIndex;
                    minDistance = Math.min(minDistance, distance);
                }
                prevIndex = i;
            }
        }

        // If less than two even positive integers, return -1
        if (evenCount < 2) {
            return -1;
        } else {
            return minDistance;
        }
    }
}
