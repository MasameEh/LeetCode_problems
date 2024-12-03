class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder modifiedStr = new StringBuilder();
        // String modifiedStr = "";

        for(int i = 0, j = 0; i < s.length(); i++)
        {
            if(j < spaces.length && i == spaces[j]){
                modifiedStr.append(" ");
                j++;
            }
            char c = s.charAt(i);
            modifiedStr.append(c);
        }

        return modifiedStr.toString();
    }
}