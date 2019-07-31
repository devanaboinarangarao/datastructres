import java.util.Scanner;;

public class excludeTwoMax {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        
        while(t > 0) {
            int n = s.nextInt();

            int array[] = new int[n];

            for(int i=0;i<n; i++) {
                array[i] = s.nextInt();
            }
            int max1 =Integer.MIN_VALUE, max = Integer.MIN_VALUE;

            for(int i=0; i<array.length; i = i+1) {
                if(array[i] > max) {
                    max1 = max;
                    max = array[i];
                }

                else if(array[i] > max1 && array[i] != max) {
                    max1 = array[i];
                }
            }
            for(int i=0;i<array.length; i++) {
                if(array[i] < max1)
                    System.out.print(array[i] +" ");
            }
            t--;
        }
    }
    
}