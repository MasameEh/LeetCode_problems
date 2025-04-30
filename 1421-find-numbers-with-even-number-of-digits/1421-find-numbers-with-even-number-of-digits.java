class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        
        for(int i = 0; i < nums.length; i++){
            int numbersCount = 0;

            while(nums[i] > 0){
                nums[i] /= 10;
                numbersCount++;
            }
            if(numbersCount % 2 == 0){
                evenCount++;       
            }
        }

        return evenCount;
    }
}