package sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static void quickSort(int[] arr) {
        if (null == arr || arr.length == 0) {
            return;
        }

        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }

        int index = partition(arr, start, end);
        if (index >= start) {
            sort(arr, start, index - 1);
        }

        if (index < end) {
            sort(arr, index + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        if (start >= end) {
            return start;
        }

        int pivot = arr[start];
        swap(arr, start, end);
        int index = start - 1;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot) {
                index++;

                if (index < i) {
                    swap(arr, index, i);
                }
            }
        }

        return index;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 11, 9};
        quickSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
