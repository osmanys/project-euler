package projects;

import utils.FastReader;

import java.math.BigInteger;

public class ProjectEuler016 {

    public static void main(String[] args) {
        FastReader f = new FastReader();
        int r, n, t = f.nextInt();
        BigInteger b;
        while (t-- > 0) {
            n = f.nextInt();
            b = BigInteger.ONE.shiftLeft(n);
            r = 0;
            while(b.compareTo(BigInteger.ZERO) > 0){
                r += b.remainder(BigInteger.TEN).intValue();
                b = b.divide(BigInteger.TEN);
            }
            System.out.println(r);
        }
    }
}
