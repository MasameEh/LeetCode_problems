class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int counter = 1;
            int comp = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if((comp + diff) == nums[j]){
                    counter++;
                    comp = nums[j];
                }
                if(counter == 3) break;
            }
            if(counter == 3) count++;
     
        }
        return count;
    }
}