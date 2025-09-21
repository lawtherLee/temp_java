import com.sun.source.tree.BreakTree;

public class MathTester {
    public static void main(String[] args) {
//        countPrimes(1, 5);
//        System.out.println(maximumDigit(123));

        MathTester tester = new MathTester();
        tester.Fibonacci(10);
    }

    /**
     * 统计m-n质数的个数，并输出
     *
     * @param m
     * @param n
     * @return
     */
    static int countPrimes(int m, int n) {
        int i, j, count = 0;

        for (j = m; j <= n; j++) {
            for (i = 2; i <= j / 2; i++)
                if (j % i == 0) break; // 关键
            if (i > j / 2) { // 关键
                count++;
                System.out.println(j);
            }
        }

        return count;
    }

    /**
     * 求出十进制n各位的最大数
     *
     * @param n
     * @return
     */
    static int maximumDigit(int n) {
        int max = 0, d;
        while (n > 0) {
            d = n % 10;
            if (d > max) max = d;
            n = n / 10;
        }
        return max;
    }

    /**
     * 数列前两位都是1 第三个数开始，每个数是前两个数之和，直到大于m为止
     *
     * @param m
     */
    void Fibonacci(int m) {
        int f1 = 1, f2 = 1, f3;
        System.out.println(f1);
        System.out.println(f2);
        while (true) {
            f3 = f1 + f2;
            if (f3 > m) break;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }
    }

    /**
     * S = 2/1 + 3/2 + 5/3 + 8/5 + 13/8 + ... + n
     * 下一项的分子=上一项分子分母的和，分母=上一项的分子
     */
    static double sumS(int n) {
        double S, fz, fm, temp;
        S = 0.0;
        fz = 2.0;
        fm = 1.0;
        for (int i = 1; i <= n; i++) {
            S += fz / fm;
            temp = fz;
            fm = fz;
            fz += temp;
        }
        return S;
    }

    /**
     * 检测数组中是否有相等的
     *
     * @param a
     * @return
     */
    static boolean isDuplicated(int[] a) {
        boolean flag = false;
        for (int i = 0; i <= a.length; i++) {
            for (int j = i + 1; j <= a.length; j++) {
                if (a[i] == a[j]) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}

