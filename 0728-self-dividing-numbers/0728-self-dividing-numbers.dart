class Solution {
    bool isSelfDividing(int n){
        int num = n;
        bool isSelfDividing = true;

        while(n > 0){
            int rem = n % 10;
            if(rem != 0 && num % rem == 0){
                isSelfDividing = true;
            }else{
                isSelfDividing = false;
                break;
            }
            n~/=10;
        }
        return isSelfDividing;
    }
    List<int> selfDividingNumbers(int left, int right) {
        List<int> selfDividingArray = [];

        for(int i = left; i <= right; i++){
            if(i < 10){
                selfDividingArray.add(i);
            }else if(isSelfDividing(i)){
                selfDividingArray.add(i);
            }
        }
        return selfDividingArray;
    }
}