package practice.begin;

/**
 * @User: layman
 * @Date: 2021/12/30 17:18
 * @Description: 插入排序
 */
public class Code05_InsertSort {
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int newIndex = end;
            while (newIndex - 1 >= 0 && arr[newIndex - 1] > arr[newIndex]) {
                swap(arr, newIndex - 1, newIndex);
                newIndex--;
            }

        }

    }

    public static void insertSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end <N; end++) {
            for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre + 1);
            }
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 3, 2, 7, 8, 5, 2, 4};
        printArray(nums);
        //insertSort(nums);
        insertSort2(nums);
        printArray(nums);

    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
