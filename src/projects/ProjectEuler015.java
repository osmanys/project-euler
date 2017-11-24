package projects;

import utils.FastReader;

public class ProjectEuler015 {
    private static int MOD = 1000000007;

    public static void main(String[] args){
        int[][] d = new int[501][501];
        for(int i = 1; i < 501; i++)
            for(int j = 1; j < 501; j++)
                d[i][j] = ((i > 1 ? d[i - 1][j] : 1) + (j > 1 ? d[i][j - 1] : 1)) % MOD;
        FastReader f = new FastReader();
        int n, m, t = f.nextInt();
        while(t-- > 0){
            n = f.nextInt();
            m = f.nextInt();
            System.out.println(d[n][m]);
        }
    }
}
