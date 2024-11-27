class Solution {
    public String decodeMessage(String key, String message) {
        Set<Character> newAlpha =  new LinkedHashSet <>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Character> mapping = new HashMap<>();
        String decodedMsg = ""; 
        for(char c : key.toCharArray()){
            if (!Character.isWhitespace(c)) newAlpha.add(c);
        }
        int i = 0;
        for(Character c : newAlpha ){

            mapping.put(c, alphabet[i]);
            i++;
        }

        for(char c : message.toCharArray()){
            if (!Character.isWhitespace(c)){
                char chr = mapping.get(c);
                decodedMsg += chr;
            }else decodedMsg += " ";
        }
        return decodedMsg;
    }
}