import java.util.Scanner;

public class swapKth {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t > 0) {
            int n = s.nextInt();
            int e = s.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            int temp = arr[e - 1];
            arr[e - 1] = arr[n - e];
            arr[n - e] = temp;

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            t--;
        }
    }
}