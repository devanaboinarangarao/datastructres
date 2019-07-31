import java.util.Scanner;;

public class palindromicArr {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        
        while(t > 0) {
            int n = s.nextInt();

            int array[] = new int[n];

            for(int i=0;i<n; i++) {
                array[i] = s.nextInt();
            }

            System.out.print("\n"+isPalinArr(array));
            t--;
        }
    }
    static int isPalinArr(int[] array) {

        for(int i = 0; i < array.length; i++) {
            int sum = 0, remainder = 0;
            int number = array[i];

            while(number > 0) {
                remainder = number%10;

                sum = (sum * 10) + remainder;

                number /= 10;
            }

            if(sum != array[i]) {
                return 0;
            }
        }
        return 1;
    }
}