import java.util.Scanner;

public class productArr {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t > 0) {
            int n = s.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
           
            int sum = 1;
            
            for (int i = 0; i < n; i++) {
                sum *= arr[i];
            }
      
                System.out.print(sum + " ");
            
            t--;
        }
    }
}