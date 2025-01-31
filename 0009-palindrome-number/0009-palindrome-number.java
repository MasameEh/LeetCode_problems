class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 9) return true;
        
        int newX = 0;
        int num = x;

        while(num > 0){
            int rem = num % 10;
            newX = newX * 10 + rem;
            num/=10;
        }

        return newX == x;
    }
}