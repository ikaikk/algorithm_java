package sort;

public class SelectSort {
    public void selectSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 3, 10};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(arr);
        for (int i : arr) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
    }
}
