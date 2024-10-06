class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 1){
            return false;
        }
        if(n == 1){
            return true;
        }
        double num = n;

        while(num > 0){
            num /= 3.0;
            if(num == 1){
                return true;
            }
        }
        return false;
    }
}