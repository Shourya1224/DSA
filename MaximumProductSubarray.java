public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }   
        int maxProduct = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }
                 //shreyayyyyyy
            maxEndingHere = Math.max(nums[i], maxEndingHere * nums[i]);
            minEndingHere = Math.min(nums[i], minEndingHere * nums[i]);

            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        return maxProduct;
    } 
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product subarray: " + maxProduct(nums));
    }
}
