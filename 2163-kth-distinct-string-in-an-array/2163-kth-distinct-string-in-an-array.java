class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freqMap = new LinkedHashMap<>();

        for(String c : arr){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int counter = 1;
        String ret = "";

        for(Map.Entry<String, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() == 1 && counter <= k){
                counter++;
                ret = entry.getKey();
            }
        }

        return counter > k ? ret : "";
    }
}