class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = n
        if(n == 0) return true

        if (flowerbed.size == 1) {
            return if (flowerbed[0] == 0) count - 1 <= 0 else count <= 0
        }
        for(i in flowerbed.indices){
            if(flowerbed[i] == 0){
                if(i != 0 && i != flowerbed.size - 1){
                    if(flowerbed[i + 1] != 1 && flowerbed[i - 1] != 1){
                        count--
                        flowerbed[i] = 1
                    }
                }
                if(i == 0 && flowerbed[i + 1] != 1){
                    count--
                    flowerbed[i] = 1
                } else if(i == flowerbed.size - 1 && flowerbed[i - 1] != 1){
                    count--
                    flowerbed[i] = 1
                }
            }
            if(count == 0){
                return true
            }
        }

        return false
    }
}