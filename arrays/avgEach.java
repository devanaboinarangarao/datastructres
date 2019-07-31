import java.util.Scanner;

public class avgEach {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t > 0) {
            int n = s.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                arr[i] = sum/(i+1);
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            t--;
        }
    }
}