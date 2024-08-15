class Solution {
    public int[] searchRange(int[] nums, int target) {
    
        int first = firstOccurance(nums,target);     
        int last = lastOccurance(nums,target);

        int [] res = new int[] {first , last};

        return res;
      
    }

    private int firstOccurance(int[] nums, int target) {

        int startIndex = 0, endIndex = nums.length - 1;
        int first = -1;

        while (startIndex <= endIndex)
        {
            int mid = startIndex + (endIndex - startIndex) / 2;

            if(target == nums[mid])
            {
                first = mid;
                endIndex = mid - 1;
            }
            else if(target > nums[mid])
            {
                startIndex = mid + 1;
            }
            else
            {
                endIndex = mid - 1; 
            }
        }
        return first;
    }   

    private int lastOccurance(int[] nums, int target) 
    {

        int startIndex = 0, endIndex = nums.length - 1;
        int last = -1;

        while (startIndex <= endIndex)
        {
            int mid = startIndex + (endIndex - startIndex) / 2;

            if(target == nums[mid])
            {
                last = mid;
                startIndex = mid + 1;
            }
            else if(target > nums[mid])
            {
                startIndex = mid + 1;
            }
            else
            {
                endIndex = mid - 1; 
            }
        }
        return last;
    }   
}