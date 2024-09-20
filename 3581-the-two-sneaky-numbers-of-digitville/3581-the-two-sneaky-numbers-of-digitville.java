class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] sneaky = new int[2];
        int counter = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                sneaky[counter++] = nums[i];
                i++;
            }
        }
        return sneaky;
    }
}