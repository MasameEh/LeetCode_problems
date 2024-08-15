class Solution {
  bool judgeSquareSum(int c) {
    Map<int, int> sqrsMap = {};

    for(int i = 0; i*i <= c; i++)
    {
        sqrsMap[i*i] = 1;
        if(sqrsMap.containsKey(c - i*i))
        {
            return true;
        } 
    }
    return false;
  }
}