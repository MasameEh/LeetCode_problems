class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int sumOfDigits = getSumOfDigits(num);

            // If sumOfDigits already exists in map, compute max sum
            if (map.containsKey(sumOfDigits)) {
                maxSum = Math.max(maxSum, num + map.get(sumOfDigits));
            }

            // Store the max value corresponding to this sumOfDigits
            map.put(sumOfDigits, Math.max(num, map.getOrDefault(sumOfDigits, 0)));
        }

        return maxSum;
    }

    private int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}