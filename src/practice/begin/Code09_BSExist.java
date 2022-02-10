package practice.begin;

/**
 * @User: layman
 * @Date: 2021/12/31 12:40
 * @Description:
 */
public class Code09_BSExist {
    public static boolean find(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int L = 0;
        int R = arr.length - 1;
        int M = 0;
        while (L <= R) {
            M = L + ((R - L) >> 1);
            if (num == arr[M]) {
                return true;
            } else if (num > arr[M]) {
                L = M + 1;
            } else if (num < arr[M]) {
                R = M - 1;
            }
        }
        return false;
    }

    //>=num 最左的位置
    private static int mostLeft(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R) {
            //更新ans
            int M = L + ((R - L) >> 1);
            if (arr[M] >= num) {
                ans = M;
                R = M - 1;
            } else {
                L = M + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 6, 6, 7, 9, 67};
        System.out.println(find(nums, 9));
        System.out.println(mostLeft(nums, 2));
        System.out.println(Math.ceil(0.7));
        System.out.println(Math.floor(0.7));
        System.out.println(Math.ceil(-0.7));
        System.out.println(Math.floor(-0.7));

    }
}
