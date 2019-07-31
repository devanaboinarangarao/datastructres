import java.util.Scanner;

public class fascinate {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t > 0) {
            int n = s.nextInt();
            int sum = sumOfDigits(n) + sumOfDigits(n*2) + sumOfDigits(n*3); 
            if(sum == 45) {
                System.out.println(1);
            } else{
                System.out.println(0);
            }
            t--;
        }
    }

    static int sumOfDigits(int n) {
        int sum = 0, remainder = 0;
        
        while(n > 0) {
            remainder = n % 10;
            sum += remainder;
            n = n/10;
        }

        return sum;
    }
}