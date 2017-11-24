package projects;

import utils.FastReader;

public class ProjectEuler004 {

    public static void main(String[] args){
        FastReader f = new FastReader();
        int i, x, n, t = f.nextInt();
        while(t-- > 0){
            n = f.nextInt();
            if((n / 1000) * 1000 + ((n / 1000) % 10) * 100 + ((n / 10000) % 10) * 10 + n / 100000 >= n)
                n = n / 1000 - 1;
            else
                n = n / 1000;
            while(n > 99){
                x = n * 1000 + (n % 10) * 100 + ((n / 10) % 10) * 10 + n / 100;
                i = 999;
                for(; i * i >= x; i--)
                    if(x % i == 0 && x / i < 1000 && x / i > 99)
                        break;
                if(i * i >= x){
                    System.out.println(x);
                    break;
                }
                n--;
            }
        }
    }
}
