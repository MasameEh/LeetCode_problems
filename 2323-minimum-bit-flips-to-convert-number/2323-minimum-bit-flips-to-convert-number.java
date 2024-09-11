class Solution {
    public int minBitFlips(int start, int goal) {

        int xor = start^goal;
        int numOfFlips = 0;
        String num1 = Integer.toBinaryString(xor);
        System.out.println(num1);
        for(int i = 0; i < num1.length(); i++){
            if(num1.charAt(i) == '1'){
                numOfFlips++;
            }
        }
        return numOfFlips;
    }
}