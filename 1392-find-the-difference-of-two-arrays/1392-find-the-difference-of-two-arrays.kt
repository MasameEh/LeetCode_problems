class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {

        val diffNums = mutableListOf<MutableList<Int>>()
        diffNums.add(mutableListOf())
        diffNums.add(mutableListOf())

        val uniqueNum1 = nums1.toSet()
        val uniqueNum2 = nums2.toSet()

        for(num in uniqueNum1){

            if(!uniqueNum2.contains(num)){
                diffNums[0].add(num) 
            }
        }

        for(num in uniqueNum2){

            if(!uniqueNum1.contains(num)){
                  diffNums[1].add(num) 
            }
        }
        return diffNums
    }
}