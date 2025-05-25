public class Demo16 {
    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                System.out.println("Duplicate found: " + Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 6, 3};
        findDuplicates(numbers);
    }
}
