package practice.begin;

/**
 * @User: layman
 * @Date: 2021/12/31 9:32
 * @Description: 前缀和
 */
public class Code06_PreSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 9};
        int sum = preSum(arr, 1, 2);
        System.out.println(sum);
    }

    private static int preSum(int[] arr, int i, int j) {
        if (arr == null || i > j) {
            return 0;
        }
        int N = arr.length;
        int[] rangeSum = new int[N];
        rangeSum[0] = arr[0];
        for (int k = 1; k < N; k++) {
            rangeSum[k] = rangeSum[k - 1] + arr[k];
        }
        return i == 0 ? rangeSum[j] : rangeSum[j] - rangeSum[i - 1];
    }
}
