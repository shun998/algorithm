package practice.begin;

/**
 * @User: layman
 * @Date: 2021/12/31 9:42
 * @Description: 随机数 已知f1[1,5],求g[1,7]
 */
public class Code07_RandToRand {
    //已知函数[1,5]
    public static int f1() {
        return (int) (Math.random() * 5 + 1);
    }

    //返回{0,1}
    public static int f2() {
        int ans = 0;
        do {
            ans = f1();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    }

    //[0,7]
    public static int f3() {
        return (f2() << 2) + (f2() << 1) + f2();
    }

    //[1,7]
    public static int f4() {
        int ans = 0;
        do {
            ans = f3();
        } while (ans == 0);
        return ans;
    }

    //已知固定概率,但是不等
    public static int g1() {
        return Math.random() < 0.8 ? 0 : 1;
    }

    //求等概率返回{0,1},两次不一样就是等概率(0,1)(1,0)
    public static int g2() {
        int ans = 0;
        do {
            ans = g1();
        } while (ans == g1());
        return ans;
    }

    public static void main(String[] args) {
        int times = 7000000;
        int[] counts = new int[8];
        for (int i = 0; i < times; i++) {
            int num = f4();
            counts[num]++;
        }
        for (int i = 1; i < counts.length; i++) {
            System.out.println(i + "有" + counts[i] + "个");
        }
    }
}
