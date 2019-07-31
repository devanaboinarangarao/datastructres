import java.util.Scanner;

public class sumAvg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t > 0) {
            int n = s.nextInt();

            int array[] = new int[n];

            int sum = 0;
            double avg = 0;
            for(int i=0;i<n; i++) {
                array[i] = s.nextInt();
                sum += array[i];
            }
            avg = sum/(double)n;
            System.out.printf("%d %.2f", sum, avg);
            t--;
        }
    }
}