class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int required = 0;

        for(int num : arr)
        {
            if(required == 3) 
                break; 
            if(num % 2 == 1){
                required++;
            }else 
                required = 0;
        }

        return required == 3 ? true:false;
    }
}