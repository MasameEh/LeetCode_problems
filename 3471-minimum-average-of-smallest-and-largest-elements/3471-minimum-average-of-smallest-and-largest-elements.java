class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        double[] avgs = new double[n/2];
        Arrays.sort(nums);

        for(int i = 0; i < n/2; i++){
            avgs[i] = (double)(nums[i] + nums[n - i - 1]) / 2; 
        }

        Arrays.sort(avgs);
        return avgs[0];
    }
}