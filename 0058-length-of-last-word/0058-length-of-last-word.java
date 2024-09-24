class Solution {
    public int lengthOfLastWord(String s) {
        // Split the string by spaces and filter out empty strings
        String[] words = s.trim().split("\\s+");
        
        // Return the length of the last word
        return words[words.length - 1].length();
    }
}