class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        Integer defaultFreq = freqMap.get(s.charAt(0));

        for(Integer freq : freqMap.values()){
            if(!freq.equals(defaultFreq)){
                return false;
            }
        }
        return true;
    }
}