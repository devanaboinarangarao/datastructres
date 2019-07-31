import java.util.Scanner;

public class longName {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t > 0) {
           
            int n = s.nextInt();
            String names[] = new String[n];


            for (int i = 0; i < n; i++) {
                names[i] = s.next();
            }
            int max = 0;
            for (int i = 1; i < n; i++) {
                if(names[i].length() >= names[max].length()) {
                    max = i;
                }
            }
           
            System.out.print(names[max]+" ");
            
            t--;
        }
    }
}