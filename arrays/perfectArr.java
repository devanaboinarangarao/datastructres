import java.util.Scanner;

public class perfectArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t > 0) {
            int n = s.nextInt();

            int array[] = new int[n];

            for(int i=0;i<n; i++) {
                array[i] = s.nextInt();
            }
            
            int mid = n/2;
            int isPerfect = 1;

            for(int i=0; i< mid; i++) {
                if(array[i] != array[n-i-1]) {
                    isPerfect = 0;
                }
            }
            if(isPerfect == 1) {
                System.out.println("PERFECT");
            } else{
                System.out.println("NOT PERFECT");
            }
            t--;
        }
    }
}