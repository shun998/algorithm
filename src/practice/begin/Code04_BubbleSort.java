package practice.begin;

/**
 * @User: layman
 * @Date: 2021/12/30 16:56
 * @Description: 冒泡排序
 */
public class Code04_BubbleSort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) {
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 8, 3, 8, 3, 2, 9, 0};
        bubbleSort(nums);
        printArray(nums);


    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
