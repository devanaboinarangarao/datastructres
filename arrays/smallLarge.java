import java.util.Scanner;

public class smallLarge {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t > 0) {
            int n = s.nextInt();
            int e = s.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int[] ans = new int[2];
            ans = minMax(arr, e, 0, n,n, ans);
            
            System.out.println(ans[0] +" "+ans[1]);
            t--;
        }
    }
    static int[] minMax(int[] array, int e, int low, int high, int size, int[] result) {
        if(low < high) {
            int mid = (low+high)/2;

            if(e <= array[mid]) {
                return minMax(array, e, low, mid-1,size, result);
            } else {
                return minMax(array, e, mid+1, high,size, result);
            }
        } else{
            if(low == high) {
                result[0] = 0;
                result[1] = 0;
                if(low == size) {
                    if(array[low] == e) {
                        result[0] = size;
                        result[1] = 1;
                    } else{
                        result[0] = size;
                        result[1] = 0;
                    }
                } 
                else if(low == 0) {
                    if(array[low] == e) {
                        result[0] = 1;
                        result[1] = size;
                    } else{
                        result[0] = 0;
                        result[1] = size;
                    }
                }
                // else{
                //     result[0] = low+1;
                //     result[1] = size-low;
                // }
            }
            return result;
        }
    }
}