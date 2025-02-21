class Solution {
    public boolean isPalindrome(String s) {

        String sl = s.toLowerCase();
        String reverse = "";
        String reverseSb = "";

        if (s == " ") {
            return true;
        }
        for (int i = sl.length() - 1; i > -1; i--) {
            char c = sl.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                reverse += c;

            }
        }

        StringBuilder sb = new StringBuilder(reverse);
        reverseSb = sb.reverse().toString();

        if (reverse.equals(reverseSb) ) {
            return true;
        } else {
            return false;
        }

    }
}