class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[0]; // Handle edge case

        // Step 1: Use a TreeSet to sort the unique elements
        Set<Integer> sortedSet = new TreeSet<>();
        for (int num : arr) {
            sortedSet.add(num);  // Automatically sorts elements and removes duplicates
        }

        // Step 2: Create a rank map
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedSet) {
            rankMap.put(num, rank++);
        }

        // Step 3: Assign ranks to the original array
        int[] ranks = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ranks[i] = rankMap.get(arr[i]);
        }

        return ranks;
    }
}
