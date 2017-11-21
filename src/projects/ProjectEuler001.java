package projects;

import utils.FastReader;

public class ProjectEuler001 {

    public static void main(String[] args){
        FastReader f = new FastReader();
        int p3, p5, p15, n, t = f.nextInt();
        while(t-- > 0){
            n = f.nextInt();
            p3 = (n - 1) / 3;
            p5 = (n - 1) / 5;
            p15 = (n - 1) / 15;
            System.out.println((3L * p3 * (p3 + 1) + 5L * p5 * (p5 + 1) - 15L * p15 * (p15 + 1)) / 2);
        }
    }
}
