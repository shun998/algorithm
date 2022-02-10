package practice.begin;

import java.util.HashMap;

/**
 * @User: layman
 * @Date: 2022/1/6 14:33
 * @Description:
 */
public class Code15_GetMax {
    public static int getMax(int[] arr) {
        int max = process(arr, 0, arr.length - 1);
        return max;
    }

    public static int process(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        int M = L + ((R - L) >> 1);
        int left = process(arr, L, M);
        int right = process(arr, M + 1, R);
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 45, 3, 7, 98, 32, 1};
        System.out.println(getMax(nums));
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "demo1");
        map.put("2", "");
        map.put("3", null);
        map.put("4", "null");
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));

    }
}
