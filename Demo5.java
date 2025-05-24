import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, -5, 6, -7, 8 };

        rearrange(arr);

        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }

    public static void rearrange(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
            
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
