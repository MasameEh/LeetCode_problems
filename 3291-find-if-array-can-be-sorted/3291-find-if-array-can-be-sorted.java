class Solution {
    private int countSetBits(int n){
        int count = 0;
        while(n > 0){
            n&=(n-1);
            count++;
        }
        return count;
    }
    public boolean canSortArray(int[] nums) {
        boolean isPossible = true;

        for(int i = 0; i < nums.length - 1; i++){
            boolean isSwapped = false;

            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j+1]){
                    int num1Bits = countSetBits(nums[j]);
                    int num2Bits = countSetBits(nums[j+1]);
                    System.out.println(num1Bits + " " + num2Bits);
                    if(num1Bits == num2Bits){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                        isSwapped = true;
                    }else{
                        isPossible = false;
                        return isPossible;
                    }
                }
            }
            if(!isSwapped) return true;
        }
        return isPossible;
        
    }
}