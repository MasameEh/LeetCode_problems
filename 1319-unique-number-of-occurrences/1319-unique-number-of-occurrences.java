class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        HashSet<Integer> occurances = new HashSet<>();
        
        for(int count : freqMap.values()){
            if(!occurances.add(count))
                return false;
        }
        return true;
    }
}