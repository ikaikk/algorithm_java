package search;

/**
 * 二分查找
 */
public class BinarySearch {
    public static int binarySearch(int x) {
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = (right + left) / 2;
            int guessNum = mid * mid;
            if (guessNum == x) {
                return mid;
            } else if (guessNum > x){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(9));
    }
}
