import java.util.*;
public class dfs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0 ) {
            int n = s.nextInt();
            int start = s.nextInt();
            int[][] G = new int[n][n];
            int[] v = new int[n];

            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    System.out.printf("is %d %d connected ",i, j );
                    G[i][j] = s.nextInt();
                }
            }
            v[start] = 1;
            DFS(G, start, v);
            
            t--;
        }
    }
    static void DFS(int[][] G, int start, int[] v) {
        System.out.print(start+" ");
        for(int i=0; i<v.length;i++) {
            if(i != start && G[start][i] != 0 && v[i] != 1) {
                DFS(G, i, v);
            }
        }
       
    }
}