public class KadaneMaxSumSubArray {
    public static int maxSubArray(int[] input) {
        int localMax = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int index = 0; index < input.length; index++) {
            localMax = localMax + input[index];
            localMax = Math.max(0, localMax);
            maxSum = Math.max(maxSum, localMax);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {-2, 2, 1, -3, 1};
        System.out.println("Max sum subarray: " + maxSubArray(array));
    }
}
