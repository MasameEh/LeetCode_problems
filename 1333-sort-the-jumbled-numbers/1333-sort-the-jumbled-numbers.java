class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        // Create a map to store the jumbled version of each number
        Map<Integer, Integer> jumbledMap = new HashMap<>();

        for (int num : nums) {
            jumbledMap.put(num, getJumbledNumber(mapping, num));
        }

        // Sort the original array based on their jumbled values
        Integer[] numsArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsArray, (a, b) -> Integer.compare(jumbledMap.get(a), jumbledMap.get(b)));

        // Convert the sorted array back to int[]
        return Arrays.stream(numsArray).mapToInt(Integer::intValue).toArray();
    }

    // Helper method to get the jumbled version of a number
    private int getJumbledNumber(int[] mapping, int num) {
        if (num == 0) return mapping[0];

        int jumbledNumber = 0;
        int place = 1;
        
        while (num > 0) {
            int digit = num % 10;
            int mappedDigit = mapping[digit];
            jumbledNumber += mappedDigit * place;
            place *= 10;
            num /= 10;
        }

        return jumbledNumber;
    }
}