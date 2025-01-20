class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        List<Integer> larger = new ArrayList<Integer>();
        List<Integer> smaller = new ArrayList<Integer>();
        int pivotCount = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] < pivot){
                smaller.add(nums[i]);
            }

            else if(nums[i] > pivot){
                larger.add(nums[i]);
            }else pivotCount++;
        }

        List<Integer> newarr = new ArrayList<Integer>();

        while(pivotCount > 0){
            smaller.add(pivot);
            pivotCount--;
        }
        newarr.addAll(smaller);
        newarr.addAll(larger);

        System.out.println(newarr);

        return newarr.stream().mapToInt(i -> i).toArray();
    }
}