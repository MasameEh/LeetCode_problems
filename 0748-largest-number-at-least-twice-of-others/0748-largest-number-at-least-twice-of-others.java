class Solution {
    public int dominantIndex(int[] nums) {
        int[] copyArr = nums.clone();
        Arrays.sort(copyArr);
        int n = copyArr.length, index = 0;
        int largest = copyArr[n - 1];

        for(int i = 0; i < n; i++){
            if(nums[i] == largest){
                index = i;
                break;
            }
        }

        return (copyArr[n-2] <= (largest/2)) ? index: -1;
    }
}