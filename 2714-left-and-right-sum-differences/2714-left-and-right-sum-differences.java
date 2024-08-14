class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] lSum = new int[n];
        int[] rSum = new int[n];
        int[] diff = new int[n];

        for(int i = 0; i < n - 1; i++){
            int sum = 0;
            for(int j = i+1; j < n; j++){
                sum += nums[j];
            }
            rSum[i] = sum;
        }

        for(int i = 0; i < n; i++){
            int sum = 0;

            for(int j = i-1; j >= 0; j--){
                sum += nums[j];
            }
            lSum[i] = sum;
        }

        for(int i = 0; i < n; i++){
          diff[i] = Math.abs(lSum[i] - rSum[i]);
        }
        
        return diff;
    }
}