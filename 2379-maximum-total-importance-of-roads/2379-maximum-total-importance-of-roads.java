class Solution {
    public long maximumImportance(int n, int[][] roads) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Calculate the frequency of each element
        for (int[] road : roads) {
            for (int city : road) {
                freqMap.put(city, freqMap.getOrDefault(city, 0) + 1);
            }
        }

        // Convert map entries to a list and sort by values in descending order
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(freqMap.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Create a new map from the sorted entries and assign numbers from n to 1
        int maxValue = n;
        Map<Integer, Integer> assignedValues = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            assignedValues.put(entry.getKey(), maxValue--);
        }

        long sum = 0;
        // Calculate the sum of assigned values for each road
        for (int[] road : roads) {
            for (int city : road) {
                sum += assignedValues.get(city);
            }
        }
        return sum;
    }
}