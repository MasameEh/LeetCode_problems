class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int altitudes[] = new int[gain.length+1];
        altitudes[0] = 0;

        for(int i = 1; i < gain.length+1; i++){
            altitudes[i] =  altitudes[i - 1] + gain[i - 1];
        }

        for(int num : altitudes){
            max = Math.max(max, num);
        }

        return max;
    }
}