class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            int num = nums1[i];
            boolean isEqual = false;

            for(int j = 0; j < nums2.length; j++){
                if(num == nums2[j]){
                    isEqual = true;
                }

                if(isEqual && num < nums2[j]){
                    ans[i] = nums2[j];
                    break;
                }else ans[i] = -1;
            }
        }

        return ans;
    }
}