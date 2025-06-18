class Solution {
    fun angleClock(hour: Int, minutes: Int): Double {
        val h = (hour * 30) + (0.5 * minutes) 
        val m = 6 * minutes

        val diff = abs(h - m)

        return if(diff > 180) 360 - diff else diff
    }
}