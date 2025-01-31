class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 9) return true;

        String xStr = String.valueOf(x);
        String revStr = "";

        for(int i = 0; i < xStr.length(); i++){
            char ch = xStr.charAt(i);

            revStr = ch + revStr;
        }

        return xStr.equals(revStr);
    }
}