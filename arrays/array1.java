import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0) {
            int n = s.nextInt();
           
            int array[] = new int[n];
            
            int max = Integer.MIN_VALUE;
            for(int i =0 ; i < n ;i++) {
                array[i] = s.nextInt();
                if(array[i] > max) {
                    max = array[i];
                }
            }

            System.out.println(max);
            
            t--;
        }
    }
}