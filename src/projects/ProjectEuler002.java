package projects;

import utils.FastReader;

public class ProjectEuler002 {

    public static void main(String[] args){
        FastReader f = new FastReader();
        int t = f.nextInt();
        long n, a0, a1, s, temp;
        while(t-- > 0){
            n = f.nextLong();
            a0 = 2;
            a1 = 8;
            s = 2;
            while(a1 <= n) {
                s += a1;
                temp = a1;
                a1 = 4 * a1 + a0;
                a0 = temp;
            }
            System.out.println(s);
        }
    }
}
