class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> uniqueNums1 = convertToSet(nums1);
        Set<Integer> uniqueNums2 = convertToSet(nums2);

        List<List<Integer>> diffs = new ArrayList<>();
        diffs.add(new ArrayList<Integer>());
        diffs.add(new ArrayList<Integer>());

        for(int num : uniqueNums1){
            if(!uniqueNums2.contains(num)){
                diffs.get(0).add(num);
            }
        }

        for(int num : uniqueNums2){
            if(!uniqueNums1.contains(num)){
                diffs.get(1).add(num);
            }
        }

        return diffs;
    }

    private Set<Integer> convertToSet(int[] nums1) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums1)
            set.add(val);
        return set;
    }
}