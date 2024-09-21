class Solution {

    private int countSetBits(int n){
        int count = 0;
        while(n > 0){
            n &= (n-1);
            count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] retArray = new int[n + 1];
        
        while(n >= 0)
        {
            int counter = countSetBits(n);
            retArray[n] = counter;
            n--;
        }
        return retArray;
    }
}