class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();

        if(n < k){
            return false;
        }

        if(n == k){
            return true;
        }


        Map<Character, Integer> freqMap = new HashMap<>();

        for(char c :  s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;

        for(Map.Entry<Character,Integer> entry : freqMap.entrySet()){
            if(entry.getValue() % 2 != 0){
                oddCount++;
            }

            if(oddCount > k){
                return false;
            }
        }

        return true;
    }
}