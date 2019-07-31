import java.util.Scanner;;

public class maxMin {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        
        while(t > 0) {
            int n = s.nextInt();

            int array[] = new int[n];

            for(int i=0;i<n; i++) {
                array[i] = s.nextInt();
            }
            int min = array[0], max = array[0];

            for(int i=1; i<array.length; i++) {
                if(array[i] < min) {
                    min = array[i];
                }
                if(array[i] > max) {
                    max = array[i];
                }
            }

            System.out.print("\n"+max+" "+min);
            t--;
        }
    }
    
}