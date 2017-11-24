package projects;

import utils.FastReader;

public class ProjectEuler014 {
    private static final int MAX_SIZE = 5000001;

    private static int calc(int[] d, long i){
        if(i < MAX_SIZE && d[(int)i] != 0)
            return d[(int)i];
        int r = i % 2 == 0 ? calc(d, i / 2) : calc(d, 3 * i + 1);
        if(i < MAX_SIZE)
            d[(int)i] = r + 1;
        return r + 1;
    }

    public static void main(String[] args){
        int[] d = new int[MAX_SIZE];
        d[0] = 0;d[1] = 1;
        for(int i = 2; i < MAX_SIZE; i++)
            calc(d, i);
        int[] m = new int[MAX_SIZE];
        for(int i = 1; i < MAX_SIZE; i++)
            if(d[i] >= d[m[i - 1]])
                m[i] = i;
            else
                m[i] = m[i - 1];
        FastReader f = new FastReader();
        int n, t = f.nextInt();
        while(t-- > 0){
            n = f.nextInt();
            System.out.println(m[n]);
        }
    }
}
