class Solution {
  int countNegatives(List<List<int>> grid) {
    int n = grid[0].length;
    int count = 0;


    for(int i = 0; i < grid.length; i++){
        int r = n - 1;
        int l = 0;
        while(r >= l){
            int mid = l + (r - l)~/2;

            if(grid[i][mid] < 0){
                count += (r - mid + 1);
                r = mid - 1; // Search in the left part for more negatives
            }
            else if(grid[i][mid] >= 0)
            {
                l = mid + 1;
            }
        }
    }
    return count;
  }
}