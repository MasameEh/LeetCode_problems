class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0, digitSum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            while(num > 0){
                int rem = num % 10;
                digitSum+=rem;
                num/=10;
            }
        }

        return Math.abs(digitSum - sum);
    }
}