class Solution {
    public boolean rotateString(String s, String goal) {
        int index = 0;
        if(goal.length() != s.length()){
            return false;
        }
          // Check if goal is a substring of s + s
        String doubled = s + s;
        return doubled.contains(goal);
    }
}