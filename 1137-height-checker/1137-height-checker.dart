class Solution {
  int heightChecker(List<int> heights) {
    
    List<int> expected = List.from(heights);
    int diffIndices = 0; 
    expected.sort();

    for(int i = 0; i < heights.length; i++)
    {
        if(heights[i] != expected[i])
        {
            diffIndices++;
        }
    }
    return diffIndices;
  }
}