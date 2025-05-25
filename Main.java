import java.util.Arrays;

public class Main {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = Arrays.stream(nums).sum();
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 9};
        int missing = findMissingNumber(numbers);
        System.out.println("The missing number is: " + missing);
    }
}
