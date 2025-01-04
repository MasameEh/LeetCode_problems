class Solution {
    public String reverseWords(String s) {
        String[] splittedString = s.split(" ");
        String[] revString = new String[splittedString.length];

        for(int i = 0; i < splittedString.length; i++){
            int l = 0;
            int r = splittedString[i].length() - 1;
            char[] rev = splittedString[i].toCharArray();
            
            while(r > l){
                char temp = rev[l];
                rev[l] = rev[r];
                rev[r] = temp;
                l++;
                r--;
            }
            revString[i] = new String(rev);
        }

        return String.join(" ", revString); 
    }
}