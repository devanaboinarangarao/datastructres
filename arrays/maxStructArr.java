import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class maxStructArr {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0) {
            int n = s.nextInt();

            HashMap < Integer, int[] > map = new HashMap< Integer, int[]>();

            int arr[] = new int[2*n];
            for(int i=0; i<2*n; i++) {
                arr[i] = s.nextInt();
                if((i+1)%2 == 0) {
                    int[] a = new int[2];
                    a[0] = arr[i-1];
                    a[1] = arr[i];
                    map.put((i+1)/2,a);
                }
            }
            int max = Integer.MIN_VALUE;
            for(int index : map.keySet()) {
                int[] elements = map.get(index);

                int feets = elements[0];
                int inches = elements[1];
                
                int sum = feets*12 + inches;

                if(sum > max) {
                    max = sum;
                }                
                // System.out.println(index +" "+elements);
            }
            System.out.println(max);
            t--;
        }
    }
}