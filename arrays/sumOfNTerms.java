import java.util.Scanner;

public class sumOfNTerms {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        
        while(t > 0) {
            int n = s.nextInt();
            int sum = (n * (n+1))/2;
            System.out.println(sum);
            t--;
        }
    }
}