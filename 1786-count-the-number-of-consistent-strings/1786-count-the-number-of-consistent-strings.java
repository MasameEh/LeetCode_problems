class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] allowedArr = allowed.toCharArray();
        int totalNum = 0;
        for(String word : words){
            boolean isAllowed = true;;
            for(int j = 0; j < word.length(); j++){
                boolean charAllowed = false; // Check if the current character is allowed
                for(int i = 0; i < allowedArr.length; i++){
                    if(word.charAt(j) == allowedArr[i]){
                        charAllowed = true; // If char is allowed, mark it
                        break;
                    }
                }
                if (!charAllowed) { // If even one character is not allowed, mark word as disallowed
                    isAllowed = false;
                    break;
                }
            }
            if(isAllowed){
                totalNum++;
            }
        }
        return totalNum;
    }
}