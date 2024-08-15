class Solution {
    public int minOperations(String[] logs) {
        int minOperations = 0;

        for(int i = 0; i < logs.length; i++)
        {
            if(!logs[i].equals("../") && !logs[i].equals("./"))
            {
                minOperations++;
            }else if(logs[i].equals("../") && minOperations != 0)
            {
                minOperations--;
            }
        }
        return minOperations;
    }
}