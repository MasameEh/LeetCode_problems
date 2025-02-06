class Solution {
    public int tupleSameProduct(int[] nums) {

        Map<Integer, Integer> productFreq = new HashMap<>();

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                int product = nums[i] * nums[j];
                productFreq.put(product, productFreq.getOrDefault(product, 0) + 1);
            } 
        } 
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : productFreq.entrySet()){
            int freq = entry.getValue();
            if (freq > 1) {
                count += (freq * (freq - 1) / 2) * 8;  // Formula for tuple count
            }
        }
        return count;  
    }
}