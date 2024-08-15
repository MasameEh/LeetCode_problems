class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int totalCustomers = 0, maxGrumpyCus = 0; 
        int temp = 0;
        
        for(int i = 0; i <= customers.length - minutes; i++){
            int sum = 0;
            temp = i;
            for(int j = 0; j < minutes; j++){
                if(grumpy[temp] != 0)
                {
                    sum+=customers[temp];
                }
                temp++;
            }
            if(sum > maxGrumpyCus)
            {
                maxGrumpyCus = sum;
            }
            temp = 0;
        }

        for(int i = 0; i < customers.length; i++)
        {
            if(grumpy[i] == 0)
            {
                totalCustomers+= customers[i];
            }
        }
        totalCustomers+= maxGrumpyCus;
        return totalCustomers;
    }
}