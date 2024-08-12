import java.util.Arrays;

public class BinarySearch {
    //    Basic Binary Search in Sorted Array
    public int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length;

        while (low <= high) {
            int mid = (high + low) / 2;
            System.out.println(array[mid] + "\t" + mid);
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int findPosition(int[] array, int target) {
        int idx = binarySearch(array, target);
        return idx >= 0 ? idx + 1 : -1;
    }

//    find Square root of number using Binary Search;

    public float squareRoot(int number, int precision) {
        int low = 0;
        int high = number;

        double ans = 0d;
        while (low <= high) {
            int mid = (high + low) / 2;

            if (mid * mid == number) {
                ans = mid;
                break;
            } else if (mid * mid > number) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }

        double increment = 1d;

        for (int i = 0; i < precision; i++) {
            while (ans * ans <= number) {
                ans += increment;
            }

            ans = ans - increment;
            increment = increment / 10;
        }
        return (float) ans;
    }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int[] array = {3, 34, 1, 4, 3, 5, 124, 5, 32, 2};
        Arrays.sort(array);
        int i = b.binarySearch(array, 6);
        int position = b.findPosition(array, 6);
        float v = b.squareRoot(330, 3);

        System.out.println(Arrays.toString(array));
        System.out.println(i);
        System.out.println("closest of that root: " + v);
        System.out.println(position);

    }
}