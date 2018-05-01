package chapter.fourth.controlling.execution.exercise;

/**
 * Created by Jane on 2018/4/30.
 */

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;


/**
 * 发现和打印素数
 */
public class E04_FindPrimes {
    public static void main(String[] args) {
        int MAX = 100;
        if (args.length > 0){
            MAX = Integer.parseInt(args[0]);
        }

        findPrimes(MAX);
        System.out.println();
        System.out.println("============================= findPrimesFast =============================");
        findPrimesFast(MAX);
    }
    /*
    1  2  3  5  7  11  13  17  19  23  29  31  37  41  43  47  53  59  61  67  71  73  79  83  89  97
    ============================= findPrimesFast =============================
    1  2  3  5  7  11  13  17  19  23  29  31  37  41  43  47  53  59  61  67  71  73  79  83  89  97
    */

    /**
     * 使用两个嵌套for循环和取余（%）
     * @param max
     */
    public static void findPrimes(int max) {
        for (int i = 1; i < max; i++) {
            boolean isPrimes = true;
            for (int j = 2; j < (i / 2 + 1); j++) {
                if(i%j == 0){
                    isPrimes = false;
                    break;
                }
            }
            if(isPrimes) {
                System.out.print(i + "  ");
            }
        }
    }

    /**
     * Sieve of Eratosthenes 埃拉托色尼筛选法
     * @param max
     */
    public static void findPrimesFast(int max){
        boolean[] sieve = new boolean[max + 1];
        int limit = (int)floor(sqrt(max));   //max的最大除数 -> 开方，向下取整
        System.out.print(1 + "  ");
        if (max > 1) {
            System.out.print(2 + "  ");
        }
        for(int i = 3; i <= limit; i += 2) {
            //从3开始，2的倍数去除
            if(!sieve[i]) {
                for(int j = 2 * i; j <= max; j += i) {
                    //1: 6 9 12 15 ... -> true  从6开始，3的倍数去除
                    //2: 10 15 20 25 ... -> true 从10开始，5的倍数去除
                    //3: 14 21 28 ... -> true  ...
                    //4: 18 27 36 45 ..-> true  ...
                    //...
                    sieve[j] = true;
                }
            }
        }
        for(int i = 3; i <= max; i += 2) {
            //从3开始，2的倍数去除  + 全面全部去除的数
            if(!sieve[i]) {
                System.out.print(i + "  ");
            }
        }
    }
}

