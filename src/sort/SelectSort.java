package sort;

public class SelectSort {

    public static void selectSort(int[] arr) {
        if (null == arr || arr.length == 1) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <arr.length; j++) {
                if (arr[i] > arr[j]) {
                    change(arr, i, j);
                }
            }
        }
    }

    private static void change(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 3, 10};
        selectSort(arr);
        for (int i : arr) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
    }
}
