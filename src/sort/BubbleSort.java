package sort;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                 }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 11, 9};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
