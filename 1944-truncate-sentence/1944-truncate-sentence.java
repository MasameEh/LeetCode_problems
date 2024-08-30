class Solution {
    public String truncateSentence(String s, int k) {
        int spacesNum = 0;
        String ret = s;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                spacesNum++;
            }
            if(spacesNum == k){
                ret = s.substring(0, i);
                break;
            }
        }
        return ret;
    }
}