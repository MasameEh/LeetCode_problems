class Solution {
    public int countDigits(int num) {
        if(num <= 9) return 1;

        int n = num, count = 0;

        while(n > 0){
            int temp = n % 10;

            if(num % temp == 0){
                count++;
            }

            n/=10;
        }

        return count;
    }
}