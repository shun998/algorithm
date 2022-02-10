package practice.begin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @User: layman
 * @Date: 2022/1/28 17:14
 * @Description:
 */
public class Code20_MedianOfTwoSortedArrays {

    /**
     * 前置条件:R1-L1==R2-L2
     *
     * @param nums1
     * @param L1
     * @param R1
     * @param nums2
     * @param L2
     * @param R2
     * @return 上中位数
     */
    public static int getUpMedian(int[] nums1, int L1, int R1, int[] nums2, int L2, int R2) {
        int M1 = 0, M2 = 0;
        while (L1 < R1) {
            M1 = L1 + (R1 - L1) >> 1;
            M2 = L2 + (R2 - L2) >> 1;
            if (nums1[M1] == nums2[M2]) {
                return nums1[M1];
            }
            if (((R1 - L1 + 1) & 1) == 1) {//长度为基数
                if (nums1[M1] > nums2[M2]) {
                    if (nums2[M2] >= nums1[M1 - 1]) {//淘汰1个为了调用递归
                        return nums2[M2];
                    }
                    R1 = M1 - 1;
                    L2 = M2 + 1;
                } else {//nums2[M2]>nums1[M1]
                    if (nums1[M1] >= nums2[M2]) {
                        return nums1[M1];
                    }
                    R2 = M2 - 1;
                    L1 = M1 + 1;
                }
            } else {//长度为偶数
                if (nums1[M1] > nums2[M2]) {
                    R1 = M1;
                    L2 = M2 + 1;
                } else {
                    R2 = M2;
                    L1 = M1 + 1;
                }

            }
        }
        return Math.min(nums1[L1], nums2[L2]);
    }

    /**
     * @param arr1
     * @param arr2
     * @param kth
     * @return 两个数组第k小的数
     */
    public static int findKthNum(int[] arr1, int[] arr2, int kth) {
        int[] longs = arr1.length >= arr2.length ? arr1 : arr2;
        int[] shorts = arr1.length < arr2.length ? arr1 : arr2;
        int l = longs.length;
        int s = shorts.length;
        if (kth <= s) {
            return getUpMedian(shorts, 0, kth - 1, longs, 0, kth - 1);
        }
        if (kth > l) {
            if (shorts[kth - l - 1] >= longs[l - 1]) {
                return shorts[kth - l - 1];
            }
            if (longs[kth - s - 1] >= shorts[s - 1]) {
                return longs[kth - s - 1];
            }
            return getUpMedian(shorts, kth - l, s - 1, longs, kth - s, l - 1);
        }
        // 第2段
        if (longs[kth - s - 1] >= shorts[s - 1]) {
            return longs[kth - s - 1];
        }
        return getUpMedian(shorts, 0, s - 1, longs, kth - s, kth - 1);
    }

    /**
     * @param nums1
     * @param nums2
     * @return 两个数组的中位数
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        boolean even = (size & 1) == 0;
        if (nums1.length != 0 && nums2.length != 0) {
            if (even) {
                return (double) (findKthNum(nums1, nums2, size / 2) + findKthNum(nums1, nums2, size / 2 + 1)) / 2D;
            } else {
                return findKthNum(nums1, nums2, size / 2 + 1);
            }
        } else if (nums1.length != 0) {
            if (even) {
                return (double) (nums1[(size - 1) / 2] + nums1[size / 2]) / 2;
            } else {
                return nums1[size / 2];
            }
        } else if (nums2.length != 0) {
            if (even) {
                return (double) (nums2[(size - 1) / 2] + nums2[size / 2]) / 2;
            } else {
                return nums2[size / 2];
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31) - 1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(-Math.pow(2, 31));
        System.out.println(-Integer.MIN_VALUE);
    }
}

