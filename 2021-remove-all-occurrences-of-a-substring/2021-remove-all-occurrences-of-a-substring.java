class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder stack = new StringBuilder();
        int partLength = part.length();
        
        for (char c : s.toCharArray()) {
            stack.append(c);
            

            if (stack.length() >= partLength && 
            stack.substring(stack.length() - partLength).equals(part)) {

                stack.setLength(stack.length() - partLength); 
            }
        }
        
        return stack.toString();
    }
}