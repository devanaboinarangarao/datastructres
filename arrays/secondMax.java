import java.util.Scanner;;

public class secondMax {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        
        while(t > 0) {
            int n = s.nextInt();

            int array[] = new int[n];

            for(int i=0;i<n; i++) {
                array[i] = s.nextInt();
            }
            int max = Integer.MIN_VALUE, max1 = 0;

            for(int i=0; i<array.length; i++) {
                if(array[i] > max) {
                    max1 = max;
                    max = array[i];
                } 
                if(array[i] > max1 && array[i] != max) {
                    max1 = array[i];
                }
            }

            System.out.print("\n"+max1);
            t--;
        }
    }
    
}