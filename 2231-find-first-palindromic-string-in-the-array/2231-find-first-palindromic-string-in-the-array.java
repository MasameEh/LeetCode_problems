class Solution {
    public String firstPalindrome(String[] words) {
        //StringBuilder rev = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            StringBuilder rev = new StringBuilder();
            rev.append(words[i]);
            rev.reverse();
            System.out.println(rev);
            if(rev.toString().equals(words[i])){
                return words[i];
            }
        }
        return "";
    }
}