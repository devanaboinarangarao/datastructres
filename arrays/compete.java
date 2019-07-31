import java.util.Scanner;

public class compete {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t > 0) {
           

            int a[] = new int[3];
            int b[] = new int[3];

            for (int i = 0; i < 3; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                b[i] = s.nextInt();
            }
            int a_score = 0, b_score = 0 ;
            for (int i = 0; i < 3; i++) {
                if(a[i] == b[i]) {
                    continue;
                }
                if(a[i] > b[i]) {
                    a_score++;
                } else{
                    b_score++;
                }
            }
      
                System.out.print(a_score + " "+ b_score +" ");
            
            t--;
        }
    }
}