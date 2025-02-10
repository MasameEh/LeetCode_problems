class Solution {
    public String clearDigits(String s) {
        Stack<Character> chars = new Stack<>();
        StringBuilder sb = new StringBuilder(); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c <= '9') {
               chars.pop();
            }else chars.push(c);
        }

        while(chars.size() > 0){
            char c = chars.pop();
            sb.append(c);
        } 
        return sb.reverse().toString(); 
    }
}