import java.util.Scanner;;

public class alternateEle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        
        while(t > 0) {
            int n = s.nextInt();

            int array[] = new int[n];

            for(int i=0;i<n; i++) {
                array[i] = s.nextInt();
            }
            

            for(int i=0; i<array.length; i = i+2) {
                
                System.out.print(array[i] +" ");
            }

            t--;
        }
    }
    
}