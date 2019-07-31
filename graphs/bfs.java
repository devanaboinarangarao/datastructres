import java.util.*;
public class bfs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0 ) {
            int n = s.nextInt();
            int start = s.nextInt();
            int[][] G = new int[n][n];

            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    System.out.printf("is %d %d connected ",i, j );
                    G[i][j] = s.nextInt();
                }
            }

            BFS(G, start, n);
            
            t--;
        }
    }
    static void BFS(int[][] G, int start, int n) {

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        int[] v = new int[n];
        v[start] = 1;

        while(!q.isEmpty()) {
            int e = q.poll();
            System.out.print(e +" ");

            for(int i=0; i<n; i++) {
                if(G[e][i]!=0 && v[i]!=1) {
                    v[i] = 1;
                    q.add(i);
                }
            }
        }
        return;
    }
}