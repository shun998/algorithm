package practice.begin;

/**
 * @User: layman
 * @Date: 2021/12/29 10:52
 * @Description:
 */
public class Code02_SumOfFactorial {
    public static long f1(int N) {
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += factorial(i);
        }
        return ans;
    }

    private static long factorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
        }
        return ans;
    }

    public static long f2(int N) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= N; i++) {
            cur *= i;
            ans += cur;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(f1(3));
        System.out.println(f2(3));
    }
}
