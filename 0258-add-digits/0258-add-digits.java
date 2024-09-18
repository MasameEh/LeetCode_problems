class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        int sum = 0;
        int temp = num;

        while(num >= 10){
            int rem = temp % 10;
            sum += rem;
            temp /= 10;

            if(temp == 0){
                num = sum;
                temp = sum;
                sum = 0;
            }
        }
        return num;
    }
}