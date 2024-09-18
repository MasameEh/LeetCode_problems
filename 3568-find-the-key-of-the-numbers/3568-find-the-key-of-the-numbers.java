class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int num = 0;
        String paddedNum1 = String.format("%04d", num1);
        String paddedNum2 = String.format("%04d", num2);
        String paddedNum3 = String.format("%04d", num3);
      
        
        for(int i = 0; i < 4; i++){
            int min = Math.min(paddedNum1.charAt(i) - '0', paddedNum2.charAt(i) - '0');
            min = Math.min(min, paddedNum3.charAt(i) - '0');
            num = num * 10 + min; 
        }
        return num;
    }
}