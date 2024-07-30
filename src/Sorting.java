import java.util.Arrays;

public class Sorting {
    static void sort(int[] arr, int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

//            System.out.println(Arrays.toString(arr) + "\t" + l + "\t" + m + "\t" + r);
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
//            System.out.println(Arrays.toString(arr) + "\t" + l + "\t" + m + "\t" + r + " *");
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second sub-arrays
        int i = 0, j = 0;

        // Initial index of merged sub-array array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(L) + "\t" + Arrays.toString(R) + "\t" + l + "\t" + m + "\t" + r);
//        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 9, 4, 6, 7, 8, 5};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
