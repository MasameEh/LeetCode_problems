class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int [] freqArr = new int[51];

        for(int i = 0; i < nums.length; ++i){
            freqArr[nums[i]]++;
        }

        int res = 0;
        for(int i = 0; i < freqArr.length; ++i){
            if(freqArr[i] == 2){
                res^=i;
            }
        }
        return res;
    }
}