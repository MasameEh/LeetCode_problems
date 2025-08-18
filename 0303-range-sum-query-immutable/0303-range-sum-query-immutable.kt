class NumArray(nums: IntArray) {

    var numbers = nums

    fun sumRange(left: Int, right: Int): Int {
        var sum = 0

        for(i in left..right){
            sum += numbers[i]
        }
        return sum
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */