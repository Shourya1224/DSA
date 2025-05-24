public class SubarraySum {
    public static void findSubarray(int[] arr, int target) {
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            
            while (currentSum > target && start <= end) {
                currentSum -= arr[start++];
            }


            if (currentSum == target) {
                System.out.println("Subarray found between indices " + start + " and " + end);
                return;
            }
        }

        System.out.println("No subarray found with the given sum.");
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        findSubarray(arr, target);
    }
}
