package top.mczhengyi._02_recursion;

import java.util.Arrays;

/**
 * 使用递归实现的插入排序
 */
public class Case06InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,6,8,9,2,6,4,2,6,8,4};
        insertSort(arr, arr.length-1);
        System.out.printf("Insert Sort: %s", Arrays.toString(arr));
    }

    static void insertSort(int[] arr, int k) {
        if (k == 0) {
            return;
        }
        // 排序前面的
        insertSort(arr, k-1);
        // 排序本位
        int n = arr[k];
        int idx = k - 1;
        while (arr[idx] > n&&idx >= 1) {
            arr[idx + 1] = arr[idx];
            idx--;
        }
        arr[idx+1] = n;
    }
}
