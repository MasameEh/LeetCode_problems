class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val uniqueNum1 = mutableSetOf<Int>()
        val uniqueNum2 = mutableSetOf<Int>()

        val diffNums = mutableListOf<MutableList<Int>>()

        diffNums.add(mutableListOf())
        diffNums.add(mutableListOf())

        for(i in nums1.indices){
            uniqueNum1.add(nums1[i])
        }
        for(i in nums2.indices){
            uniqueNum2.add(nums2[i])
        }
        
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