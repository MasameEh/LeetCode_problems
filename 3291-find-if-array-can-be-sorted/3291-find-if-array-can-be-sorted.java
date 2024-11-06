class Solution {
    private int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public boolean canSortArray(int[] nums) {
        // Step 1: Count set bits for each number and store in a map
        int[] bitCounts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            bitCounts[i] = countSetBits(nums[i]);
        }

        // Step 2: Use Bubble Sort only when set bits are equal
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isSwapped = false;

            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    if (bitCounts[j] == bitCounts[j + 1]) {
                        // Swap only if the number of set bits is the same
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        isSwapped = true;
                    } else {
                        return false;  // Not possible to sort
                    }
                }
            }

            // If no swaps occurred, the array is sorted
            if (!isSwapped) return true;
        }

        return true;
    }
}