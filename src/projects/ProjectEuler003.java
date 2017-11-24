package projects;

import algorithms.EratosthenesSieve;
import utils.FastReader;
import utils.Pair;
import java.util.Vector;

public class ProjectEuler003 {
    private static final int MAX_SIZE = 1000001;

    public static void main(String[] args){
        FastReader f = new FastReader();
        int i, t = f.nextInt();
        long n;
        Vector<Pair<Integer, Integer>> p;
        EratosthenesSieve e = new EratosthenesSieve(MAX_SIZE);
        while(t-- > 0){
            n = f.nextLong();
            i = 0;
            for(; i < e.size() && n > 1; i++){
                while(n % e.getPrime(i) == 0)
                    n /= e.getPrime(i);
            }
            if(n == 1)
                System.out.println(e.getPrime(i - 1));
            else
                System.out.println(n);
        }
    }
}
