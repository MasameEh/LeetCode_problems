class Solution {
    public String toLowerCase(String s) {
        StringBuilder ret = new StringBuilder(); // Use StringBuilder for better string manipulation
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){ // Check if character is uppercase
                ret.append((char)(c + 32)); // Convert to lowercase by adding 32
            } else {
                ret.append(c); // If it's already lowercase, just add it
            }
        }
        
        return ret.toString(); // Convert StringBuilder to String and return
    }
}