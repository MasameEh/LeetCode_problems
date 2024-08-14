class Solution {
  void sortColors(List<int> nums) {
    
    bool swapped;
    int temp;

    for(int i = 0; i < nums.length - 1; i++)
    {
        swapped = false;

        for(int j = 0; j < nums.length - 1 - i; j++)
        {
            if(nums[j] > nums[j + 1])
            {
                temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
                swapped = true;
            }
        }
        if(!swapped) 
            break;
    }
  }
}