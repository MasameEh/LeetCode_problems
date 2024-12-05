class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0, j = 0;

        while (i < n || j < n) {
            // Skip '_' in both strings
            while (i < n && start.charAt(i) == '_') i++;
            while (j < n && target.charAt(j) == '_') j++;

            // If both pointers reach the end, strings are valid
            if (i == n && j == n) return true;

            // If only one pointer reaches the end, mismatch
            if (i == n || j == n) return false;

            // Check character match
            char c1 = start.charAt(i);
            char c2 = target.charAt(j);

            if (c1 != c2) return false;

            // Check movement constraints
            if (c1 == 'L' && i < j) return false; // L cannot move right
            if (c1 == 'R' && i > j) return false; // R cannot move left

            // Move both pointers
            i++;
            j++;
        }

        return true;
    }
}
