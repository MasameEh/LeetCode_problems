class Solution {
    public int countAsterisks(String s) {
        boolean isPair = true;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '|') isPair = !isPair;
            if (isPair && ch == '*') count++;
        }
        return count;
    }
}