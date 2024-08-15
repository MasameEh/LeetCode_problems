class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] != 5) return false;

        int numOfFives = 0;
        int numOfTens = 0;

        for(int i = 0; i < bills.length; i++){

            if(bills[i] == 5)
                numOfFives++;
            else if(bills[i] == 10 && numOfFives > 0){
                numOfFives--;
                numOfTens++;
            }else if(bills[i] == 20 && (numOfFives > 0 && numOfTens > 0)){
                numOfFives--;
                numOfTens--;
            }else if(bills[i] == 20 && numOfFives >= 3){
                numOfFives-=3;
            }else return false;
        }

        return true;
    }
}