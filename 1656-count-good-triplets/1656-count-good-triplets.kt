class Solution {
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
        var count = 0

        for (i in 0..arr.size - 3) {
            for (j in i + 1 until arr.size) {
                for (k in j + 1 until arr.size) {
                    if (abs(arr[i] - arr[j]) <= a &&
                        abs(arr[i] - arr[k]) <= c &&
                        abs(arr[j] - arr[k]) <= b) {
                        count++
                    }
                }
            }
        }
        return count
    }
}