class Solution {

    public String[] sortPeople(String[] names, int[] heights) {

        boolean swapped = false;
        int n = names.length;

        for(int i = n - 1; i > 0; i--){
            swapped = false;
            for(int j = n - 1; j > n  - 1 - i; j--){
                if(heights[j] > heights[j - 1]){
                    // Swap heights
                    int tempHeight = heights[j];
                    heights[j] = heights[j - 1];
                    heights[j - 1] = tempHeight;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j - 1];
                    names[j - 1] = tempName;
                    swapped = true;
                }
                // If no two elements were swapped by inner loop, then break
            }
            if (swapped == false)
            {
                break;
            }

        }
        
        return names;
    }
}