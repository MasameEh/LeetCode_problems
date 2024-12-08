class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int maxSum = 0;
        int earYear = 2060;

        for(int i = 1950; i < 2050; i++){
            int sum = 0;
            for(int j = 0; j < logs.length; j++){
                if(logs[j][0] > i){
                    continue;
                }else if(logs[j][0] == i){
                    sum+=1;
                }else if(logs[j][0] < i && logs[j][1] - 1 >= i){
                    sum+=1;
                }
            }
            System.out.println(sum + "  " + i);
            if(sum > maxSum){
                maxSum = sum;
                earYear = i;
            }
        }
        return earYear;
    }
}