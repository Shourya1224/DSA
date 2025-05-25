import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = 0;
        int k = arr2.length - 1;

        while (i >= 0 && j <= k) {
            if (arr1[i] <= arr2[j]) {
                i--;
            } else {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        merge(arr1, arr2);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
}
