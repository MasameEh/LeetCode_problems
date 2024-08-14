class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] og = new int[encoded.length+1];
        og[0] = first;
        for(int i = 0; i < encoded.length; i++){
            og[i + 1] = og[i] ^ encoded[i];
        }
        return og;
    }
}