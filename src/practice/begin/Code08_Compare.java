package practice.begin;


/**
 * @User: layman
 * @Date: 2021/12/31 11:48
 * @Description: 对数器
 */
public class Code08_Compare {
    public static int[] lenRandomValueRandom(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = (int) (Math.random() * maxValue);
        }
        return ans;
    }

    public static int[] copyArray(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    //数组 长度一定等长
    public static boolean equalValues(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int maxLen = 50;
        int maxValue = 1000;
        int times = 1000000;
        for (int i = 0; i < times; i++) {
            int[] arr1 = lenRandomValueRandom(maxLen, maxValue);
            int[] arr2 = copyArray(arr1);
            selectSort(arr1);
            insertSort(arr2);
            if (!equalValues(arr1, arr2)) {
                System.out.println(false);
                break;
            }
        }
    }

    private static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void insertSort(int[] arr) {
        //0-0 0-1 0-2 0-n-1
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
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

    private static boolean isSorted(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                return false;
            }
            max = Math.max(max, arr[i]);
        }
        return true;
    }
}



